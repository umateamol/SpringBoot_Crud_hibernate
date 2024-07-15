package com.accountManagement.System.service;

import com.accountManagement.System.Entity.contact;
import com.accountManagement.System.ResourceNotFoundException;
import com.accountManagement.System.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public contact getContactById(Long id) {
        return contactRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Contact not found with id " + id));
    }

    public contact createContact(contact contact) {
        return contactRepository.save(contact);
    }

    public contact updateContact(Long id, contact contactDetails) {
        contact contact = contactRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Contact not found with id " + id));

        contact.setFirstName(contactDetails.getFirstName());
        contact.setLastName(contactDetails.getLastName());
        contact.setEmail(contactDetails.getEmail());
        contact.setPhone(contactDetails.getPhone());
        // Update other fields as needed

        return contactRepository.save(contact);
    }

    public void deleteContact(Long id) {
        contact contact = contactRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Contact not found with id " + id));

        contactRepository.delete(contact);
    }
}

