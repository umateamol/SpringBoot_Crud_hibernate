package com.accountManagement.System.Controller;

import com.accountManagement.System.Entity.account;
import com.accountManagement.System.Entity.contact;
import com.accountManagement.System.repository.ContactRepository;
import com.accountManagement.System.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class contactController {


    @RestController
    @RequestMapping("/contacts")
    public class ContactController {

        @Autowired
        private ContactService contactService;

        @GetMapping
        public List<contact> getAllContacts() {
            return contactService.getAllContacts();
        }

        @GetMapping("/{id}")
        public ResponseEntity<contact> getContactById(@PathVariable Long id) {
            contact contact = contactService.getContactById(id);
            return ResponseEntity.ok(contact);
        }

        @PostMapping
        public contact createContact(@RequestBody contact contact) {
            return contactService.createContact(contact);
        }

        @PutMapping("/{id}")
        public ResponseEntity<contact> updateContact(@PathVariable Long id, @RequestBody contact contactDetails) {
            contact updatedContact = contactService.updateContact(id, contactDetails);
            return ResponseEntity.ok(updatedContact);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<?> deleteContact(@PathVariable Long id) {
            contactService.deleteContact(id);
            return ResponseEntity.ok().build();
        }
    }
}


