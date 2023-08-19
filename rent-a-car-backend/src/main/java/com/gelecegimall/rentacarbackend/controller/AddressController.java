package com.gelecegimall.rentacarbackend.controller;

import com.gelecegimall.rentacarbackend.database.entity.AddressEntity;
import com.gelecegimall.rentacarbackend.database.repository.AddressRepository;
import com.gelecegimall.rentacarbackend.mapper.AddressMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.AddressRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.AddressResponseDTO;
import com.gelecegimall.rentacarbackend.service.AddressService;
import com.gelecegimall.rentacarbackend.util.BaseController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
@RequiredArgsConstructor
public class AddressController extends BaseController<
        AddressEntity, AddressResponseDTO, AddressRequestDTO, AddressRepository, AddressMapper, AddressService> {

    private final AddressService addressService;

    @Override
    protected AddressService getService() {
        return this.addressService;
    }

}
