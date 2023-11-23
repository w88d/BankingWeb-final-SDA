package com.BankingApp.mid.repository;

import com.BankingApp.mid.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    // Custom JPA methods
    List<Account> findAllById(Long id);
    List<Account> findAllByName(String name);
    Optional<Account> findByAccountNum(String accountNum);

}
