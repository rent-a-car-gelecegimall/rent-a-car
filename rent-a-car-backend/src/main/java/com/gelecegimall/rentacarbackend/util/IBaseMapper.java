package com.gelecegimall.rentacarbackend.util;

import com.gelecegimall.rentacarbackend.util.dbutil.BaseEntity;

import java.util.List;

public interface IBaseMapper<Entity extends BaseEntity,
        ResponseDTO extends BaseResponseDTO,
        RequestDTO extends BaseRequestDTO> {

    Entity requestDtoToEntity(RequestDTO requestDTO);

    ResponseDTO entityToResponseDto(Entity entity);

    List<ResponseDTO> entityListToResponseDtoList(List<Entity> entityList);


}