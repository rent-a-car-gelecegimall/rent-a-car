package com.gelecegimall.rentacarbackend.service;

import com.gelecegimall.rentacarbackend.database.entity.CompanyEntity;
import com.gelecegimall.rentacarbackend.database.entity.OfficeEntity;
import com.gelecegimall.rentacarbackend.database.repository.CompanyRepository;
import com.gelecegimall.rentacarbackend.mapper.CompanyMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.CompanyRequestDTO;
import com.gelecegimall.rentacarbackend.model.requestDTO.OfficeRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.CompanyResponseDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.OfficeResponseDTO;
import com.gelecegimall.rentacarbackend.util.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService extends BaseService<
        CompanyEntity, CompanyResponseDTO, CompanyRequestDTO, CompanyRepository, CompanyMapper> {

    private final CompanyRepository companyRepository;

    @Override
    protected CompanyMapper getBaseMapper() {
        return CompanyMapper.INSTANCE;
    }

    @Override
    protected CompanyRepository getBaseRepository() {
        return this.companyRepository;
    }

}
