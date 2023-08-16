package com.gelecegimall.rentacarbackend.mapper;

import com.gelecegimall.rentacarbackend.database.entity.AddressEntity;
import com.gelecegimall.rentacarbackend.model.AddressDTO;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

    public AddressDTO entityToRequestDTO(AddressEntity addressEntity) {
        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setId(addressEntity.getId());
        addressDTO.setUuid(addressEntity.getUuid());
        addressDTO.setCreationDate(addressEntity.getCreationDate());
        addressDTO.setLastModifiedDate(addressEntity.getLastModifiedDate());

        addressDTO.setCity(addressEntity.getCity());
        addressDTO.setState(addressEntity.getState());
        addressDTO.setPhoneNumber(addressEntity.getPhoneNumber());

        return addressDTO;
    }

}
