package com.accountManagement.System.service;
import com.accountManagement.System.Entity.Interaction;
import com.accountManagement.System.ResourceNotFoundException;
import com.accountManagement.System.repository.InteractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteractionService {

    @Autowired
    private InteractionRepository interactionRepository;

    public List<Interaction> getAllInteractions() {
        return interactionRepository.findAll();
    }

    public Interaction getInteractionById(Long id) {
        return interactionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Interaction not found with id " + id));
    }

    public Interaction createInteraction(Interaction interaction) {
        return interactionRepository.save(interaction);
    }

    public Interaction updateInteraction(Long id, Interaction interactionDetails) {
        Interaction interaction = interactionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Interaction not found with id " + id));

        interaction.setInteractionDate(interactionDetails.getInteractionDate());
        interaction.setType(interactionDetails.getType());
        interaction.setNotes(interactionDetails.getNotes());
        interaction.setAccount(interactionDetails.getAccount());
        // Update other fields as needed

        return interactionRepository.save(interaction);
    }

    public void deleteInteraction(Long id) {
        Interaction interaction = interactionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Interaction not found with id " + id));

        interactionRepository.delete(interaction);
    }
}
