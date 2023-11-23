package com.BankingApp.mid.controller.impl;

import com.BankingApp.mid.controller.interfaces.IAccountController;
import com.BankingApp.mid.model.Account;
import com.BankingApp.mid.model.Bank;
import com.BankingApp.mid.repository.AccountRepository;
import com.BankingApp.mid.service.impl.AccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class AccountController implements IAccountController {
    // controller impl files one by one

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AccountService accountService;

    // **** GET ****
    // GET Operation retrieve all accounts info
    @GetMapping("/accounts")
    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    // GET Operation retrieve account by id
    @GetMapping("/accounts/{id}")
    public Account getAccountById(@PathVariable Long id){
        return accountService.getAccountById(id);
    }

    // **** POST ****
    @PostMapping("/accounts")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBank(@RequestBody @Valid Account account) {
        accountRepository.save(account);
    }


    // **** PUT ****
    @PutMapping("/accounts/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateAccount(@RequestBody @Valid Account account, @PathVariable Long id){
        accountService.updateAccount(account, id);
    }

    // **** DELETE ****
    @DeleteMapping("/accounts/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAccount(@PathVariable Long id){
        accountService.deleteAccount(id);
    }









    }





