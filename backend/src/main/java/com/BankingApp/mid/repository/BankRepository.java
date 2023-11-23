package com.BankingApp.mid.repository;

import com.BankingApp.mid.model.Account;
import com.BankingApp.mid.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

    // Custom JPA methods
    List<Bank> findAllById(Long id);

}
