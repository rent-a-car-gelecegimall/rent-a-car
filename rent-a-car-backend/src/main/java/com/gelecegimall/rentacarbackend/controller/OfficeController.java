package com.gelecegimall.rentacarbackend.controller;

import com.gelecegimall.rentacarbackend.database.entity.OfficeEntity;
import com.gelecegimall.rentacarbackend.database.repository.OfficeRepository;
import com.gelecegimall.rentacarbackend.mapper.OfficeMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.OfficeRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.OfficeResponseDTO;
import com.gelecegimall.rentacarbackend.service.CompanyService;
import com.gelecegimall.rentacarbackend.service.OfficeService;
import com.gelecegimall.rentacarbackend.util.BaseController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("office")
public class OfficeController extends BaseController<OfficeEntity, OfficeResponseDTO,OfficeRequestDTO,
        OfficeRepository, OfficeMapper, OfficeService> {
    
    private final OfficeService officeService;

    @Override
    protected OfficeService getService(){
        return this.officeService;
    }

}
