package com.BankingApp.mid.controller.impl;


import com.BankingApp.mid.controller.interfaces.IBankController;
import com.BankingApp.mid.model.Account;
import com.BankingApp.mid.model.Bank;
import com.BankingApp.mid.repository.BankRepository;
import com.BankingApp.mid.service.interfaces.IBankService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BankController implements IBankController {
    // controller files impl one by one

    @Autowired
    BankRepository bankRepository;

    @Autowired
    IBankService bankService;

    // **** GET ****

    // GET Operation retrieve all banking info
    @GetMapping("/banking")
    public List<Bank> getAllBanking(){
        return bankRepository.findAll();
    }
    // GET Operation retrieve banking by id
    @GetMapping("/banking/{bank}")
    public Bank getBankById(@PathVariable Long bank){
      return bankService.getBankById(bank);
    }

    // **** POST ****
    @PostMapping("/banking")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBank(@RequestBody @Valid Bank bank) {
        bankRepository.save(bank);
    }

    // **** PUT ****
    @PutMapping("/banking/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBank(@RequestBody @Valid Bank bank, @PathVariable Long id){
        bankService.updateBank(bank, id);
    }


    // **** DELETE ****
    @DeleteMapping("/banking/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBank(@PathVariable Long id){
        bankService.deleteBank(id);
    }









}
