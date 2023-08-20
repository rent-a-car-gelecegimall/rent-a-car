package com.gelecegimall.rentacarbackend.mapper;

import com.gelecegimall.rentacarbackend.database.entity.ContractEntity;
import com.gelecegimall.rentacarbackend.model.requestDTO.ContractRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.ContractResponseDTO;
import com.gelecegimall.rentacarbackend.util.IBaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContractMapper extends IBaseMapper<ContractEntity, ContractResponseDTO, ContractRequestDTO> {

    ContractMapper INSTANCE = Mappers.getMapper(ContractMapper.class);

    @Override
    @Mapping(source = "customerId", target = "customer.id")
    @Mapping(source = "carId", target = "car.id")
    @Mapping(source = "fromOfficeId", target = "fromOffice.id")
    @Mapping(source = "toOfficeId", target = "toOffice.id")
    ContractEntity requestDtoToEntity(ContractRequestDTO requestDTO);
}

