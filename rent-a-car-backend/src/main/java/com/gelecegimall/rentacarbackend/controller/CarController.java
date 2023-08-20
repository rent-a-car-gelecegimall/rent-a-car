package com.gelecegimall.rentacarbackend.controller;

import com.gelecegimall.rentacarbackend.database.entity.CarEntity;
import com.gelecegimall.rentacarbackend.database.repository.CarRepository;
import com.gelecegimall.rentacarbackend.enums.CarStatusEnum;
import com.gelecegimall.rentacarbackend.mapper.CarMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.CarRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.CarResponseDTO;
import com.gelecegimall.rentacarbackend.service.CarService;
import com.gelecegimall.rentacarbackend.util.BaseController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("car")
@RequiredArgsConstructor
public class CarController extends BaseController<
        CarEntity, CarResponseDTO, CarRequestDTO, CarRepository, CarMapper, CarService> {

    private final CarService carService;

    @Override
    protected CarService getService() {
        return this.carService;
    }

    @PostMapping("/updateStatus/{uuid}/{carStatusEnum}")
    protected ResponseEntity<CarResponseDTO> updateStatus(@PathVariable UUID uuid, CarStatusEnum carStatusEnum){
        try {
            CarResponseDTO responseDTO = getService().updateStatus(uuid, carStatusEnum);
            return new ResponseEntity<>(responseDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}

