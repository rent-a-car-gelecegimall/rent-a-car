package com.gelecegimall.rentacarbackend.service;

import com.gelecegimall.rentacarbackend.database.entity.CarEntity;
import com.gelecegimall.rentacarbackend.database.repository.CarRepository;
import com.gelecegimall.rentacarbackend.mapper.CarMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.CarRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.CarResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {


    @Autowired
    CarRepository carRepository;

    public CarResponseDTO save(CarRequestDTO requestDTO) {
        return CarMapper.INSTANCE.entityToResponseDto(carRepository.save(CarMapper.INSTANCE.requestDtoToEntity(requestDTO)));
    }


    public List<CarResponseDTO> getAll() {
        List<CarEntity> entityList = carRepository.findAll();
        return CarMapper.INSTANCE.entityListToResponseDtoList(entityList);
    }
}
