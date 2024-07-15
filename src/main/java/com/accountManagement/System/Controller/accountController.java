package com.accountManagement.System.Controller;

import com.accountManagement.System.repository.accountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.accountManagement.System.service.accountService;
import com.accountManagement.System.Entity.account;

import java.util.List;

@RestController

public class accountController {
    @Autowired
    private accountService accountService;

    // Save operation
    @PostMapping("/accounts")
    public account saveDepartment(
           @RequestBody account acc)
    {
        return accountService.saveaccount(acc);
    }

    // Read operation
    @GetMapping("/accounts")
    public List<account> fetchaccountList()
    {
        return accountService.fetchaccountlist();
    }

    // Update operation
    @PutMapping("/departments/{id}")
    public account
    updateDepartment(@RequestBody account acc,
                     @PathVariable("id") Integer accountid)
    {
        return accountService.updateaccount(
                acc, accountid);
    }

    // Delete operation
    @DeleteMapping("/account/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Integer accountid)
    {
        accountService.deleteaccountById(
                accountid);

        return "Deleted Successfully";
    }
}



