package com.gelecegimall.rentacarbackend.mapper;

import com.gelecegimall.rentacarbackend.database.entity.OfficeEntity;
import com.gelecegimall.rentacarbackend.model.requestDTO.OfficeRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.OfficeResponseDTO;
import com.gelecegimall.rentacarbackend.util.IBaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OfficeMapper extends IBaseMapper<OfficeEntity, OfficeResponseDTO, OfficeRequestDTO> {

    OfficeMapper INSTANCE = Mappers.getMapper(OfficeMapper.class);



    @Override
    @Mapping(source = "companyId", target = "company.id")
    OfficeEntity requestDtoToEntity(OfficeRequestDTO requestDTO);
}
