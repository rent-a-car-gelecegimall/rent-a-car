package com.gelecegimall.rentacarbackend.service;

import com.gelecegimall.rentacarbackend.database.entity.AddressEntity;
import com.gelecegimall.rentacarbackend.database.repository.AddressRepository;
import com.gelecegimall.rentacarbackend.mapper.AddressMapper;
import com.gelecegimall.rentacarbackend.model.requestDTO.AddressRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.AddressResponseDTO;
import com.gelecegimall.rentacarbackend.util.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressService extends BaseService<
        AddressEntity, AddressResponseDTO, AddressRequestDTO, AddressRepository, AddressMapper> {

    private final AddressRepository addressRepository;

    @Override
    protected AddressMapper getBaseMapper() {
        return AddressMapper.INSTANCE;
    }

    @Override
    protected AddressRepository getBaseRepository() {
        return this.addressRepository;
    }

/*    public AddressResponseDTO save(AddressRequestDTO addressRequestDTO) {
        AddressEntity addressEntity = addressMapper.requestDtoToEntity(addressRequestDTO);

        AddressEntity addressResponseEntity = addressRepository.save(addressEntity);
        return addressMapper.entityToResponseDTO(addressResponseEntity);
    }



    public List<AddressResponseDTO> getAll() {
        List<AddressEntity> addressEntityList = addressRepository.findAll();
        return addressMapper.entityListToResponseDTOList(addressEntityList);
    }*/

}
