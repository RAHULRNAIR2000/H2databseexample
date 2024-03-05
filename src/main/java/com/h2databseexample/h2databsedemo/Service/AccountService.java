package com.h2databseexample.h2databsedemo.Service;

import com.h2databseexample.h2databsedemo.Models.Account;
import com.h2databseexample.h2databsedemo.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account save(Account account){
        return accountRepository.save(account);
    }
}
