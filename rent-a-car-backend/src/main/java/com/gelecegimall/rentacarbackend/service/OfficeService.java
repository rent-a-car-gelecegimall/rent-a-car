package com.gelecegimall.rentacarbackend.service;

import com.gelecegimall.rentacarbackend.database.entity.OfficeEntity;
import com.gelecegimall.rentacarbackend.database.repository.OfficeRepository;
import com.gelecegimall.rentacarbackend.mapper.OfficeMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.OfficeRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.OfficeResponseDTO;
import com.gelecegimall.rentacarbackend.util.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OfficeService extends BaseService<
        OfficeEntity, OfficeResponseDTO, OfficeRequestDTO, OfficeRepository, OfficeMapper> {

    private final OfficeRepository officeRepository;

    @Override
    protected OfficeMapper getBaseMapper() {
        return OfficeMapper.INSTANCE;
    }

    @Override
    protected OfficeRepository getBaseRepository() {
        return officeRepository;
    }

    /*public OfficeEntity getEntityByUuid(UUID uuid) {
        return officeRepository.findByUuid(uuid).orElse(null);
    }*/




}
