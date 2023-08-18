package com.gelecegimall.rentacarbackend.util;

import com.gelecegimall.rentacarbackend.database.entity.AddressEntity;
import com.gelecegimall.rentacarbackend.model.requestDTO.AddressRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.AddressResponseResponseDTO;

import java.util.List;
import java.util.UUID;

public abstract class BaseService<ResponseDTO extends BaseResponseDTO,
        RequestDTO extends BaseRequestDTO> {
    abstract List<ResponseDTO> getAll();

    abstract ResponseDTO save(RequestDTO requestDTO);

    abstract ResponseDTO getByUuid(UUID uuid);

    abstract ResponseDTO update(UUID uuid,RequestDTO requestDTO);

    abstract Boolean deleteByUuid(UUID uuid);

}
