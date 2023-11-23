package com.BankingApp.mid.service.interfaces;

import com.BankingApp.mid.model.Bank;

public interface IBankService {

    public Bank getBankById(Long bank);

    void updateBank(Bank bank, Long id);

    void deleteBank(Long id);
}
