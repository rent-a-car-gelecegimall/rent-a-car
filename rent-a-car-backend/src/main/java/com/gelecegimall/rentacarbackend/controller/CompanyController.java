package com.gelecegimall.rentacarbackend.controller;

import com.gelecegimall.rentacarbackend.database.entity.CompanyEntity;
import com.gelecegimall.rentacarbackend.database.repository.CompanyRepository;
import com.gelecegimall.rentacarbackend.mapper.CompanyMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.CompanyRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.CompanyResponseDTO;
import com.gelecegimall.rentacarbackend.service.CompanyService;
import com.gelecegimall.rentacarbackend.util.BaseController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("company")
public class CompanyController extends BaseController<CompanyEntity,
        CompanyResponseDTO,
        CompanyRequestDTO,
        CompanyRepository,
        CompanyMapper,
        CompanyService> {

    private final CompanyService companyService;

    @Override
    protected CompanyService getService(){
        return this.companyService;
    }
}
