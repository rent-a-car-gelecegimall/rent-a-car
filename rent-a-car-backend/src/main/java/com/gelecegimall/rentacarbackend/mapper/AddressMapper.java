package com.gelecegimall.rentacarbackend.mapper;


import com.gelecegimall.rentacarbackend.database.entity.AddressEntity;
import com.gelecegimall.rentacarbackend.model.requestDTO.AddressRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.AddressResponseDTO;
import com.gelecegimall.rentacarbackend.util.IBaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface AddressMapper extends IBaseMapper<AddressEntity, AddressResponseDTO, AddressRequestDTO> {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

/*    public AddressResponseDTO entityToResponseDTO(AddressEntity addressEntity) {
        AddressResponseDTO addressResponseDTO = new AddressResponseDTO();

        addressResponseDTO.setId(addressEntity.getId());
        addressResponseDTO.setUuid(addressEntity.getUuid());
        addressResponseDTO.setCreationDate(addressEntity.getCreationDate());
        addressResponseDTO.setLastModifiedDate(addressEntity.getLastModifiedDate());

        addressResponseDTO.setCity(addressEntity.getCity());
        addressResponseDTO.setState(addressEntity.getState());
        addressResponseDTO.setPhoneNumber(addressEntity.getPhoneNumber());

        return addressResponseDTO;
    }

    public AddressEntity requestDtoToEntity(AddressRequestDTO addressRequestDTO) {
        AddressEntity addressEntity = new AddressEntity();

        addressEntity.setCity(addressRequestDTO.getCity());
        addressEntity.setState(addressRequestDTO.getState());
        addressEntity.setPhoneNumber(addressRequestDTO.getPhoneNumber());

        return addressEntity;
    }


    public List<AddressResponseDTO> entityListToResponseDTOList(List<AddressEntity> addressEntityList) {
        List<AddressResponseDTO> addressResponseDTOList = new ArrayList<>();

        for (AddressEntity entity : addressEntityList) {
            addressResponseDTOList.add(entityToResponseDTO(entity));
        }


        return addressResponseDTOList;
    }*/
}
