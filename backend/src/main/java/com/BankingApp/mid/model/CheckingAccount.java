package com.BankingApp.mid.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class CheckingAccount extends Account {
    private Long overDraft;
}