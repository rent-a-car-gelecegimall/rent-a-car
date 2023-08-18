package com.gelecegimall.rentacarbackend.service;

import com.gelecegimall.rentacarbackend.database.entity.OfficeEntity;
import com.gelecegimall.rentacarbackend.database.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OfficeService {

    @Autowired
    OfficeRepository officeRepository;

    public OfficeEntity getEntityByUuid(UUID uuid) {
        return officeRepository.findByUuid(uuid).orElse(null);
    }

}
