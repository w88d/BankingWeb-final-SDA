package com.BankingApp.mid.repository;

import com.BankingApp.mid.model.SavingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsRepository extends JpaRepository<SavingsAccount, Double> {
}
