package com.banking.corebankingservice.model.dto;

import com.banking.corebankingservice.model.AccountStatus;
import com.banking.corebankingservice.model.AccountType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class BankAccount {

    private Long id;
    private String number;
    private AccountType type;
    private AccountStatus status;
    private BigDecimal availableBalance;
    private BigDecimal actualBalance;
    private User user;

}
