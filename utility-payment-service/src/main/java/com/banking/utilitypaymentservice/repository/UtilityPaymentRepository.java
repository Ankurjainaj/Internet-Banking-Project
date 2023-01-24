package com.banking.utilitypaymentservice.repository;

import com.banking.utilitypaymentservice.model.dto.UtilityPayment;
import com.banking.utilitypaymentservice.model.entity.UtilityPaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilityPaymentRepository extends JpaRepository<UtilityPaymentEntity, UtilityPayment> {
}
