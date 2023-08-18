package com.gelecegimall.rentacarbackend.controller;

import com.gelecegimall.rentacarbackend.model.responseDTO.AddressResponseResponseDTO;
import com.gelecegimall.rentacarbackend.model.requestDTO.AddressRequestDTO;
import com.gelecegimall.rentacarbackend.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController  {
@Autowired
    AddressService addressService;

    @GetMapping
    public ResponseEntity<List<AddressResponseResponseDTO>> getAll(){
        return new ResponseEntity<>(addressService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public  ResponseEntity<AddressResponseResponseDTO> save(@RequestBody AddressRequestDTO addressRequestDTO){
        try {
            AddressResponseResponseDTO addressResponseDTO = addressService.save(addressRequestDTO);
            return  new ResponseEntity<>(addressResponseDTO, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }



}
