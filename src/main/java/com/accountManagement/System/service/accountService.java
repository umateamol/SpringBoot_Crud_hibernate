package com.accountManagement.System.service;

import com.accountManagement.System.Entity.account;
import com.accountManagement.System.repository.accountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class accountService  implements accountinterface{

    @Autowired
    private accountRepository accountRepository;

    public List<account> list() {
        return accountRepository.findAll();
    }
    // Save operation
    @Override
    public account saveaccount(account acc)
    {
        return accountRepository.save(acc);
    }





    // Delete operation

    @Override
    public void deleteaccountById(Integer accountid) {
        accountRepository.deleteById(accountid);

    }

    // Update operation

    @Override
    public account updateaccount(account acc, Integer accountid) {
        account depDB
                = accountRepository.findById(accountid)
                .get();

        if (Objects.nonNull(acc.getAccountname())
                && !"".equalsIgnoreCase(
                acc.getAccountname())) {
            depDB.setAccountname(
                    acc.getAccountname());
        }

        if (Objects.nonNull(acc.getIndustory())
                && !"".equalsIgnoreCase(
                acc.getIndustory())) {
            depDB.setIndustory(
                    acc.getIndustory());
        }
        if (Objects.nonNull(acc.getCreated_by())
                && !"".equalsIgnoreCase(
                acc.getCreated_by())) {
            depDB.setCreated_by(
                    acc.getCreated_by());
        }
        if (Objects.nonNull(acc.getUpdated_by())
                && !"".equalsIgnoreCase(
                acc.getUpdated_by())) {
            depDB.setUpdated_by(
                    acc.getUpdated_by());
        }

        return accountRepository.save(depDB);
    }





    // Read operation

    @Override
    public List<account> fetchaccountlist() {
        return (List<account>)
                accountRepository.findAll();
    }




}
