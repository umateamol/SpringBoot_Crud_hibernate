package com.accountManagement.System.repository;

import com.accountManagement.System.Entity.Interaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InteractionRepository extends JpaRepository<Interaction, Long> {
}
