package com.BankingApp.mid.service.interfaces;

import com.BankingApp.mid.model.Account;

public interface IAccountService {


    public Account getAccountById(Long id);

    void updateAccount(Account account, Long id);

    public void deleteAccount(Long id);
}
