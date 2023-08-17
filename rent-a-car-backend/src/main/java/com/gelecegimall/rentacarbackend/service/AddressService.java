package com.gelecegimall.rentacarbackend.service;

import com.gelecegimall.rentacarbackend.database.entity.AddressEntity;
import com.gelecegimall.rentacarbackend.database.repository.AddressRepository;
import com.gelecegimall.rentacarbackend.mapper.AddressMapper;
import com.gelecegimall.rentacarbackend.model.AddressResponseDTO;
import com.gelecegimall.rentacarbackend.model.requestDTO.AddressRequestDTO;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor

public class AddressService {
    //@Autowired
    //AddressRepository addressRepository2;


    private final AddressRepository addressRepository;

    private final AddressMapper addressMapper;

    public ResponseEntity<AddressResponseDTO> save(AddressRequestDTO addressRequestDTO) {
        AddressEntity addressEntity = addressMapper.requestDtoToEntity(addressRequestDTO);

        ResponseEntity<AddressResponseDTO> response;

        try {
            AddressEntity addressResponseEntity = addressRepository.save(addressEntity);
            response = new ResponseEntity<>(addressMapper.entityToResponseDTO(addressResponseEntity), HttpStatus.CREATED);
        } catch (Exception e) {
            response = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

        return response;
    }

}
