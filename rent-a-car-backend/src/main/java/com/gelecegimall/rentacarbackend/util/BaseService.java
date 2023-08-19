package com.gelecegimall.rentacarbackend.util;

import com.gelecegimall.rentacarbackend.util.dbutil.BaseEntity;
import com.gelecegimall.rentacarbackend.util.dbutil.IBaseRepository;

import java.util.List;
import java.util.UUID;

public abstract class BaseService<
        Entity extends BaseEntity,
        ResponseDTO extends BaseResponseDTO,
        RequestDTO extends BaseRequestDTO,
        Repository extends IBaseRepository<Entity>,
        Mapper extends IBaseMapper<Entity, ResponseDTO, RequestDTO>> {

    protected abstract Mapper getBaseMapper();


    protected abstract Repository getBaseRepository();

    public List<ResponseDTO> getAll() {
        List<Entity> entityList = getBaseRepository().findAll();
        return getBaseMapper().entityListToResponseDtoList(entityList);
    }

    public ResponseDTO save(RequestDTO requestDTO) {
        Entity entity = getBaseMapper().requestDtoToEntity(requestDTO);
        entity = getBaseRepository().save(entity);
        return getBaseMapper().entityToResponseDto(entity);
    }


    public ResponseDTO update(UUID uuid, RequestDTO requestDTO) {
        Entity entity = getBaseRepository().findByUuid(uuid).orElse(null);
        if (entity == null) {
            return null;
        }
        return getBaseMapper().entityToResponseDto(getBaseRepository().save(getBaseMapper().updateEntityFromRequestDTO(requestDTO, entity)));
    }

    public Boolean deleteByUuid(UUID uuid) {
        Entity entity = getBaseRepository().findByUuid(uuid).orElse(null);
        if (entity != null) {
            getBaseRepository().delete(entity);
            return true;
        }
        return false;
    }

    public ResponseDTO getByUuid(UUID uuid) {
        Entity entity = getBaseRepository().findByUuid(uuid).orElse(null);
        if (entity != null) {
            return getBaseMapper().entityToResponseDto(entity);
        } else {
            return null;
        }
    }

}