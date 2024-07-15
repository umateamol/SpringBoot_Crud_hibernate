package com.accountManagement.System.repository;

import com.accountManagement.System.Entity.Interaction;
import com.accountManagement.System.Entity.Metric;
import com.accountManagement.System.Entity.account;
import com.accountManagement.System.Entity.contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface accountRepository extends JpaRepository<account,Integer> {
}
