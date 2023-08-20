package com.gelecegimall.rentacarbackend.service;

import com.gelecegimall.rentacarbackend.database.entity.CarEntity;
import com.gelecegimall.rentacarbackend.database.entity.OfficeEntity;
import com.gelecegimall.rentacarbackend.database.repository.OfficeRepository;
import com.gelecegimall.rentacarbackend.mapper.OfficeMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.OfficeRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.OfficeResponseDTO;
import com.gelecegimall.rentacarbackend.util.BaseService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OfficeService extends BaseService<
        OfficeEntity, OfficeResponseDTO, OfficeRequestDTO, OfficeRepository, OfficeMapper> {

    private final OfficeRepository officeRepository;
    private final CarService carService;

    @Override
    protected OfficeMapper getBaseMapper() {
        return OfficeMapper.INSTANCE;
    }

    @Override
    protected OfficeRepository getBaseRepository() {
        return officeRepository;
    }

    @Transactional
    public OfficeResponseDTO addCarToOffice(UUID officeUuid, UUID carUuid) {
        OfficeEntity officeEntity = officeRepository.findByUuid(officeUuid).orElse(null);
        CarEntity carEntity = carService.getEntityByUuid(carUuid);
        if (officeEntity.getCarList() == null) {
            officeEntity.setCarList(new ArrayList<>());
        }
        officeEntity.getCarList().add(carEntity);
        OfficeEntity previousOffice = carEntity.getOffice();
        if (previousOffice != null) {
            if (previousOffice.getCarList().remove(carEntity)) {
                officeRepository.save(previousOffice);
            }
        }
        carEntity.setOffice(officeEntity);
        officeEntity = officeRepository.save(officeEntity);
        return getBaseMapper().entityToResponseDto(officeEntity);
    }
}
