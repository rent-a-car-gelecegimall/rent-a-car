package com.gelecegimall.rentacarbackend.controller;

import com.gelecegimall.rentacarbackend.database.entity.CustomerEntity;
import com.gelecegimall.rentacarbackend.database.repository.CustomerRepository;
import com.gelecegimall.rentacarbackend.mapper.CustomerMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.CustomerRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.CustomerResponseDTO;
import com.gelecegimall.rentacarbackend.service.CustomerService;
import com.gelecegimall.rentacarbackend.util.BaseController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomerController extends BaseController<
        CustomerEntity, CustomerResponseDTO,CustomerRequestDTO, CustomerRepository, CustomerMapper,CustomerService> {

    private final CustomerService customerService;

    @Override
    protected CustomerService getService() {
        return this.customerService;
    }
}
