package com.accountManagement.System.Entity;

import jakarta.persistence.*;

@Entity
public class contact {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long contactId;

      @ManyToOne
      @JoinColumn(name = "account_id")
      private account account;

      private String firstName;
      private String lastName;
      private String email;
      private String phone;

      public Long getContactId() {
            return contactId;
      }

      public void setContactId(Long contactId) {
            this.contactId = contactId;
      }

      public com.accountManagement.System.Entity.account getAccount() {
            return account;
      }

      public void setAccount(com.accountManagement.System.Entity.account account) {
            this.account = account;
      }

      public String getFirstName() {
            return firstName;
      }

      public void setFirstName(String firstName) {
            this.firstName = firstName;
      }

      public String getLastName() {
            return lastName;
      }

      public void setLastName(String lastName) {
            this.lastName = lastName;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public String getPhone() {
            return phone;
      }

      public void setPhone(String phone) {
            this.phone = phone;
      }
}



