package com.gelecegimall.rentacarbackend.service;

import com.gelecegimall.rentacarbackend.database.entity.AddressEntity;
import com.gelecegimall.rentacarbackend.database.repository.AddressRepository;
import com.gelecegimall.rentacarbackend.mapper.AddressMapper;
import com.gelecegimall.rentacarbackend.model.responseDTO.AddressResponseResponseDTO;
import com.gelecegimall.rentacarbackend.model.requestDTO.AddressRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    AddressMapper addressMapper;

    public AddressResponseResponseDTO save(AddressRequestDTO addressRequestDTO) {
        AddressEntity addressEntity = addressMapper.requestDtoToEntity(addressRequestDTO);

        AddressEntity addressResponseEntity = addressRepository.save(addressEntity);
        return addressMapper.entityToResponseDTO(addressResponseEntity);
    }

    public List<AddressResponseResponseDTO> getAll(){
        List<AddressEntity> addressEntityList = addressRepository.findAll();
        return addressMapper.entityListToResponseDTOList(addressEntityList);
    }

}
