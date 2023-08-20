package com.gelecegimall.rentacarbackend.controller;

import com.gelecegimall.rentacarbackend.database.entity.ContractEntity;
import com.gelecegimall.rentacarbackend.database.repository.ContractRepository;
import com.gelecegimall.rentacarbackend.mapper.ContractMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.ContractRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.ContractResponseDTO;
import com.gelecegimall.rentacarbackend.service.ContractService;
import com.gelecegimall.rentacarbackend.util.BaseController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("contracts")
public class ContractController extends BaseController<ContractEntity,
        ContractResponseDTO,
        ContractRequestDTO,
        ContractRepository,
        ContractMapper,
        ContractService> {

    protected ContractService contractService;

    @Override
    protected ContractService getService() {
        return this.contractService;
    }
}
