package com.gelecegimall.rentacarbackend.mapper;

import com.gelecegimall.rentacarbackend.database.entity.CustomerEntity;
import com.gelecegimall.rentacarbackend.model.requestDTO.CustomerRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.CustomerResponseDTO;
import com.gelecegimall.rentacarbackend.util.IBaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper extends IBaseMapper<CustomerEntity, CustomerResponseDTO, CustomerRequestDTO> {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

}
