package com.BankingApp.mid.repository;

import com.BankingApp.mid.model.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckingRepository extends JpaRepository<CheckingAccount, Long> {
}
