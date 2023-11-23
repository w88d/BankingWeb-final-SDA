package com.BankingApp.mid.controller.interfaces;

import com.BankingApp.mid.model.Account;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IAccountController {

    public List<Account> getAllAccounts();
    public Account getAccountById(Long id);

}
