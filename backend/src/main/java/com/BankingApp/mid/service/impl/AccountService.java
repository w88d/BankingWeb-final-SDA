package com.BankingApp.mid.service.impl;

import com.BankingApp.mid.model.Account;
import com.BankingApp.mid.model.Bank;
import com.BankingApp.mid.repository.AccountRepository;
import com.BankingApp.mid.service.interfaces.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class AccountService implements IAccountService {

    @Autowired
    AccountRepository accountRepository;



    // Move logic
    @Override
    public Account getAccountById( Long id){
        Optional<Account> accountOptional = accountRepository.findById(id);
        if (accountOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Account" + id + "not found");
        return accountOptional.get();
    }

    // update put req
    @Override
    public void updateAccount(Account account, Long id) {
        Optional<Account> accountOptional = accountRepository.findById(id);
        if (accountOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Account" + id + "not found");
        account.setId(id);
        accountRepository.save(account);
    }

    // of delete id req
    @Override
    public void deleteAccount(Long id) {
        Optional<Account> accountOptional = accountRepository.findById(id);
        if (accountOptional.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Account" + id + "not found");
        accountRepository.deleteById(id);
    }
}
