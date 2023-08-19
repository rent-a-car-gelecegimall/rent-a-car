package com.gelecegimall.rentacarbackend.service;

import com.gelecegimall.rentacarbackend.database.entity.ContractEntity;
import com.gelecegimall.rentacarbackend.database.repository.CompanyRepository;
import com.gelecegimall.rentacarbackend.database.repository.ContractRepository;
import com.gelecegimall.rentacarbackend.mapper.CompanyMapper;
import com.gelecegimall.rentacarbackend.mapper.ContractMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.ContractRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.ContractResponseDTO;
import com.gelecegimall.rentacarbackend.util.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
