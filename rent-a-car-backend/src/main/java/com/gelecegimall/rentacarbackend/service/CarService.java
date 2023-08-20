package com.gelecegimall.rentacarbackend.service;

import com.gelecegimall.rentacarbackend.database.entity.CarEntity;
import com.gelecegimall.rentacarbackend.database.entity.OfficeEntity;
import com.gelecegimall.rentacarbackend.database.repository.CarRepository;
import com.gelecegimall.rentacarbackend.enums.CarStatusEnum;
import com.gelecegimall.rentacarbackend.mapper.CarMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.CarRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.CarResponseDTO;
import com.gelecegimall.rentacarbackend.util.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarService extends BaseService<
        CarEntity, CarResponseDTO, CarRequestDTO, CarRepository, CarMapper> {

    private final CarRepository carRepository;

    @Override
    protected CarMapper getBaseMapper() {
        return CarMapper.INSTANCE;
    }

    @Override
    protected CarRepository getBaseRepository() {
        return this.carRepository;
    }


    public CarResponseDTO updateStatus(UUID uuid,  CarStatusEnum carStatusEnum) {
        CarEntity entity = getBaseRepository().findByUuid(uuid).orElse(null);
        if (entity == null) {
            return null;
        }
        entity.setCarStatusEnum(carStatusEnum);
        return getBaseMapper().entityToResponseDto(getBaseRepository().save(entity));
    }

    /*    @Autowired
    OfficeService officeService;

    public CarResponseDTO save(CarRequestDTO requestDTO) {
        CarEntity carEntity = CarMapper.INSTANCE.requestDtoToEntity(requestDTO);
        OfficeEntity officeEntity = officeService.getEntityByUuid(requestDTO.getOfficeUuid());
        if (officeEntity != null) {
            carEntity.setOffice(officeEntity);
            return CarMapper.INSTANCE.entityToResponseDto(carRepository.save(carEntity));
        } else {
            return null;
        }
    }*/

}
