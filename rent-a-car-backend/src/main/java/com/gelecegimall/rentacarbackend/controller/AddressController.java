package com.gelecegimall.rentacarbackend.controller;

import com.gelecegimall.rentacarbackend.model.responseDTO.AddressResponseDTO;
import com.gelecegimall.rentacarbackend.model.requestDTO.AddressRequestDTO;
import com.gelecegimall.rentacarbackend.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
@RequiredArgsConstructor
public class AddressController  {

    private final AddressService addressService;

    @GetMapping
    public ResponseEntity<List<AddressResponseDTO>> getAll(){
        return new ResponseEntity<>(addressService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public  ResponseEntity<AddressResponseDTO> save(@RequestBody AddressRequestDTO addressRequestDTO){
        try {
            AddressResponseDTO addressResponseDTO = addressService.save(addressRequestDTO);
            return  new ResponseEntity<>(addressResponseDTO, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }



}
