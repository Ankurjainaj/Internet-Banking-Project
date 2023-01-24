package com.banking.fundtransferservice.model.repository;

import com.banking.fundtransferservice.model.entity.FundTransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundTransferRepository extends JpaRepository<FundTransferEntity, Long> {
}
