package com.accountManagement.System.repository;

import com.accountManagement.System.Entity.contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<contact, Long> {
}
