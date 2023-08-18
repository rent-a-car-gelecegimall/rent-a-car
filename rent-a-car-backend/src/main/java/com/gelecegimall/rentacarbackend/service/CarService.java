package com.gelecegimall.rentacarbackend.service;

import com.gelecegimall.rentacarbackend.database.entity.CarEntity;
import com.gelecegimall.rentacarbackend.database.entity.OfficeEntity;
import com.gelecegimall.rentacarbackend.database.repository.CarRepository;
import com.gelecegimall.rentacarbackend.mapper.CarMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.CarRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.CarResponseResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    @Autowired
    OfficeService officeService;

    public CarResponseResponseDTO save(CarRequestDTO requestDTO) {
        CarEntity carEntity = CarMapper.INSTANCE.requestDtoToEntity(requestDTO);
        OfficeEntity officeEntity=officeService.getEntityByUuid(requestDTO.getOfficeUuid());
        if (officeEntity != null) {
            carEntity.setOffice(officeEntity);
            return CarMapper.INSTANCE.entityToResponseDto(carRepository.save(carEntity));
        } else {
            return null;
        }
    }

    public List<CarResponseResponseDTO> getAll() {
        List<CarEntity> entityList = carRepository.findAll();
        return CarMapper.INSTANCE.entityListToResponseDtoList(entityList);
    }
}
