package com.gelecegimall.rentacarbackend.mapper;


import com.gelecegimall.rentacarbackend.database.entity.AddressEntity;
import com.gelecegimall.rentacarbackend.model.requestDTO.AddressRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.AddressResponseResponseDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AddressMapper {

    public AddressResponseResponseDTO entityToResponseDTO(AddressEntity addressEntity) {
        AddressResponseResponseDTO addressResponseDTO = new AddressResponseResponseDTO();

        addressResponseDTO.setId(addressEntity.getId());
        addressResponseDTO.setUuid(addressEntity.getUuid());
        addressResponseDTO.setCreationDate(addressEntity.getCreationDate());
        addressResponseDTO.setLastModifiedDate(addressEntity.getLastModifiedDate());

        addressResponseDTO.setCity(addressEntity.getCity());
        addressResponseDTO.setState(addressEntity.getState());
        addressResponseDTO.setPhoneNumber(addressEntity.getPhoneNumber());

        return addressResponseDTO;
    }

    public AddressEntity requestDtoToEntity(AddressRequestDTO addressRequestDTO){
        AddressEntity addressEntity = new AddressEntity();

        addressEntity.setCity(addressRequestDTO.getCity());
        addressEntity.setState(addressRequestDTO.getState());
        addressEntity.setPhoneNumber(addressRequestDTO.getPhoneNumber());

        return addressEntity;
    }


    public List<AddressResponseResponseDTO> entityListToResponseDTOList(List<AddressEntity> addressEntityList) {
        List<AddressResponseResponseDTO> addressResponseDTOList = new ArrayList<>();

        for(AddressEntity entity : addressEntityList ){
            addressResponseDTOList.add(entityToResponseDTO(entity));
        }


        return addressResponseDTOList;
    }
}
