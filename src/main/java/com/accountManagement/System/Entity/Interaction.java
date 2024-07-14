package com.accountManagement.System.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Interaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long interactionId;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private account account;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    private contact contact;

    private LocalDate interactionDate;
    private String type;
    private String notes;

    public Long getInteractionId() {
        return interactionId;
    }

    public void setInteractionId(Long interactionId) {
        this.interactionId = interactionId;
    }

    public com.accountManagement.System.Entity.account getAccount() {
        return account;
    }

    public void setAccount(com.accountManagement.System.Entity.account account) {
        this.account = account;
    }

    public com.accountManagement.System.Entity.contact getContact() {
        return contact;
    }

    public void setContact(com.accountManagement.System.Entity.contact contact) {
        this.contact = contact;
    }

    public LocalDate getInteractionDate() {
        return interactionDate;
    }

    public void setInteractionDate(LocalDate interactionDate) {
        this.interactionDate = interactionDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
