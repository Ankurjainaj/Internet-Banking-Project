package com.banking.utilitypaymentservice.model.mapper;

import com.banking.utilitypaymentservice.model.dto.UtilityPayment;
import com.banking.utilitypaymentservice.model.entity.UtilityPaymentEntity;
import org.springframework.beans.BeanUtils;

public class UtilityPaymentMapper extends BaseMapper<UtilityPaymentEntity, UtilityPayment> {
    @Override
    public UtilityPaymentEntity convertToEntity(UtilityPayment dto, Object... args) {
        UtilityPaymentEntity entity = new UtilityPaymentEntity();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity);
        }
        return entity;
    }

    @Override
    public UtilityPayment convertToDto(UtilityPaymentEntity entity, Object... args) {
        UtilityPayment dto = new UtilityPayment();
        if (entity != null) {
            BeanUtils.copyProperties(entity, dto);
        }
        return dto;
    }
}
