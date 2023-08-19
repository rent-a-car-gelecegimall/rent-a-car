package com.gelecegimall.rentacarbackend.mapper;

import com.gelecegimall.rentacarbackend.database.entity.CompanyEntity;
import com.gelecegimall.rentacarbackend.model.requestDTO.CompanyRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.CompanyResponseDTO;
import com.gelecegimall.rentacarbackend.util.IBaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompanyMapper extends IBaseMapper<CompanyEntity, CompanyResponseDTO, CompanyRequestDTO> {

    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

}
