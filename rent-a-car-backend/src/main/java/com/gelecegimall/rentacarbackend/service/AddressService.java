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

import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class AddressService {
    //@Autowired
    //AddressRepository addressRepository2;


    private final AddressRepository addressRepository;

    private final AddressMapper addressMapper;

    public AddressResponseDTO save(AddressRequestDTO addressRequestDTO) {
        AddressEntity addressEntity = addressMapper.requestDtoToEntity(addressRequestDTO);

        AddressEntity addressResponseEntity = addressRepository.save(addressEntity);
        return addressMapper.entityToResponseDTO(addressResponseEntity);
    }

    public List<AddressResponseDTO> getAll(){
        List<AddressEntity> addressEntityList = addressRepository.findAll();
        return addressMapper.entityListToResponseDTOList(addressEntityList);
    }

}
