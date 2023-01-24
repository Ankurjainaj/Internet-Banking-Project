package com.banking.corebankingservice.service;

import com.banking.corebankingservice.exception.EntityNotFoundException;
import com.banking.corebankingservice.model.dto.BankAccount;
import com.banking.corebankingservice.model.dto.UtilityAccount;
import com.banking.corebankingservice.model.entity.BankAccountEntity;
import com.banking.corebankingservice.model.entity.UtilityAccountEntity;
import com.banking.corebankingservice.model.mapper.BankAccountMapper;
import com.banking.corebankingservice.model.mapper.UtilityAccountMapper;
import com.banking.corebankingservice.repository.BankAccountRepository;
import com.banking.corebankingservice.repository.UtilityAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private BankAccountMapper bankAccountMapper = new BankAccountMapper();
    private UtilityAccountMapper utilityAccountMapper = new UtilityAccountMapper();

    private final BankAccountRepository bankAccountRepository;
    private final UtilityAccountRepository utilityAccountRepository;

    public BankAccount readBankAccount(String accountNumber) {
        BankAccountEntity entity = bankAccountRepository.findByNumber(accountNumber).orElseThrow(EntityNotFoundException::new);
        return bankAccountMapper.convertToDto(entity);
    }

    public UtilityAccount readUtilityAccount(String provider) {
        UtilityAccountEntity utilityAccountEntity = utilityAccountRepository.findByProviderName(provider).orElseThrow(EntityNotFoundException::new);
        return utilityAccountMapper.convertToDto(utilityAccountEntity);
    }

    public UtilityAccount readUtilityAccount(Long id) {
        return utilityAccountMapper.convertToDto(utilityAccountRepository.findById(id).orElseThrow(EntityNotFoundException::new));
    }

}
