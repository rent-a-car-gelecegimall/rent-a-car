package com.gelecegimall.rentacarbackend.service;

import com.gelecegimall.rentacarbackend.database.entity.ContractEntity;
import com.gelecegimall.rentacarbackend.database.repository.CompanyRepository;
import com.gelecegimall.rentacarbackend.database.repository.ContractRepository;
import com.gelecegimall.rentacarbackend.enums.CarStatusEnum;
import com.gelecegimall.rentacarbackend.mapper.CompanyMapper;
import com.gelecegimall.rentacarbackend.mapper.ContractMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.ContractRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.ContractResponseDTO;
import com.gelecegimall.rentacarbackend.util.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ContractService extends BaseService<
        ContractEntity, ContractResponseDTO, ContractRequestDTO, ContractRepository, ContractMapper> {

    private final ContractRepository contractRepository;

    @Override
    protected ContractMapper getBaseMapper() {
        return ContractMapper.INSTANCE;
    }

    @Override
    protected ContractRepository getBaseRepository() {
        return this.contractRepository;
    }

    @Override
    @Transactional
    public ContractResponseDTO save(ContractRequestDTO requestDTO) {
        ContractEntity entity = getBaseMapper().requestDtoToEntity(requestDTO);
        entity.getCar().setCarStatusEnum(CarStatusEnum.RENTED);
        entity = getBaseRepository().save(entity);
        return getBaseMapper().entityToResponseDto(entity);
    }
}
