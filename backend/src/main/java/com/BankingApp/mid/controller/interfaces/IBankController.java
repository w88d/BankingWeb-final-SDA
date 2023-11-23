package com.BankingApp.mid.controller.interfaces;

import com.BankingApp.mid.model.Bank;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IBankController {

    public List<Bank> getAllBanking();
    public Bank getBankById( Long bank);


}
