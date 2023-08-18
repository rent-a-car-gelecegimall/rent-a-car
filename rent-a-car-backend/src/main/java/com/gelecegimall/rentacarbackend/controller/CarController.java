package com.gelecegimall.rentacarbackend.controller;

import com.gelecegimall.rentacarbackend.model.requestDTO.CarRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.CarResponseResponseDTO;
import com.gelecegimall.rentacarbackend.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("car")
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping
    public ResponseEntity<List<CarResponseResponseDTO>> getAll() {
        return new ResponseEntity<>(carService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CarResponseResponseDTO> save(@RequestBody CarRequestDTO requestDTO) {
        try {
            CarResponseResponseDTO responseDTO = carService.save(requestDTO);
            return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}

