package com.gelecegimall.rentacarbackend.service;

import com.gelecegimall.rentacarbackend.database.entity.CustomerEntity;
import com.gelecegimall.rentacarbackend.database.repository.CustomerRepository;
import com.gelecegimall.rentacarbackend.mapper.CustomerMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.CustomerRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.CustomerResponseDTO;
import com.gelecegimall.rentacarbackend.util.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService extends BaseService<
        CustomerEntity, CustomerResponseDTO, CustomerRequestDTO, CustomerRepository, CustomerMapper> {

    private final CustomerRepository customerRepository;

    @Override
    protected CustomerMapper getBaseMapper() {
        return CustomerMapper.INSTANCE;
    }

    @Override
    protected CustomerRepository getBaseRepository() {
        return this.customerRepository;
    }
}
