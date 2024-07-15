package com.accountManagement.System.service;
import com.accountManagement.System.Entity.account;

import java.util.List;

public interface accountinterface {

    // Save operation
    account saveaccount(account acc);


    void deleteaccountById(Integer accountid);

    // Update operation

    account updateaccount(account acc, Integer accountid);

    // Read operation
    List<account> fetchaccountlist();

    // Update operation
//    account updateaccount(account acc,
//                                Long accountid);

}
