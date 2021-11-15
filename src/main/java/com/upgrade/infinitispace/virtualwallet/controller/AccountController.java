package com.upgrade.infinitispace.virtualwallet.controller;


import com.upgrade.infinitispace.virtualwallet.models.Account;
import com.upgrade.infinitispace.virtualwallet.repository.AccountRepository;
import com.upgrade.infinitispace.virtualwallet.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.AccountNotFoundException;
import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("account")
    public Account createAccount(@RequestBody Account account) {
        return accountRepository.save(account);
    }

    @GetMapping("account")
    Iterable<Account> getAccounts(){
        return accountRepository.findAll();
    }

//    @GetMapping("account/{accountNumber")
//    List<Account> getAccount(@PathVariable Integer accountNumber){
//
//
//    }

    //get account by account number
//    @GetMapping("account/{accountNumber")
//    public ResponseEntity<Account> getAccountByAccountNumber(@PathVariable(value = "accountNumber") Integer accountNumber)
//            throws AccountNotFoundException {
//        Account account  = accountRepository.findAccountByAccountNumber(accountNumber)
//                .orElseThrow(() -> new AccountNotFoundException("Account not found for this accountNumber :: " + accountNumber));
//        return ResponseEntity.ok().body(account);
//    }
}
