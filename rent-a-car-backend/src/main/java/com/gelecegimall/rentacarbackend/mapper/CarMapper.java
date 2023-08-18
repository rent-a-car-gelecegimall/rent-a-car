package com.gelecegimall.rentacarbackend.mapper;

import com.gelecegimall.rentacarbackend.database.entity.CarEntity;
import com.gelecegimall.rentacarbackend.model.requestDTO.CarRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.CarResponseResponseDTO;
import com.gelecegimall.rentacarbackend.util.IBaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper extends IBaseMapper<CarEntity, CarResponseResponseDTO, CarRequestDTO> {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Override
    @Mapping(target = "office", ignore = true)
    CarEntity requestDtoToEntity(CarRequestDTO requestDTO);
}
