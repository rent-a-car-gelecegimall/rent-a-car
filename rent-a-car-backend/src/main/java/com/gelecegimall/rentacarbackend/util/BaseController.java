package com.gelecegimall.rentacarbackend.util;

import com.gelecegimall.rentacarbackend.model.requestDTO.BaseFilterRequestDTO;
import com.gelecegimall.rentacarbackend.model.responseDTO.PageResponseDTO;
import com.gelecegimall.rentacarbackend.util.dbutil.BaseEntity;
import com.gelecegimall.rentacarbackend.util.dbutil.IBaseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public abstract class BaseController<
        Entity extends BaseEntity,
        ResponseDTO extends BaseResponseDTO,
        RequestDTO extends BaseRequestDTO,
        Repository extends IBaseRepository<Entity>,
        Mapper extends IBaseMapper<Entity, ResponseDTO, RequestDTO>,
        Service extends BaseService<Entity, ResponseDTO, RequestDTO, Repository, Mapper>> {

    protected abstract Service getService();

    @PostMapping("get-all-filter")
    public ResponseEntity<PageResponseDTO<ResponseDTO>> getAll(@RequestBody BaseFilterRequestDTO baseFilterRequestDTO) {
        return new ResponseEntity<PageResponseDTO<ResponseDTO>>(getService().getAll(baseFilterRequestDTO), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody RequestDTO requestDTO) {
        try {
            ResponseDTO responseDTO = getService().save(requestDTO);
            return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("{uuid}")
    public ResponseEntity<ResponseDTO> getByUuid(@PathVariable UUID uuid) {
        try {
            ResponseDTO responseDTO = getService().getByUuid(uuid);
            return new ResponseEntity<>(responseDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }


    @DeleteMapping("{uuid}")
    public ResponseEntity<Boolean> deleteByUuid(@PathVariable UUID uuid) {
        Boolean isDeleted = getService().deleteByUuid(uuid);
        if (isDeleted) {
            return new ResponseEntity<>(isDeleted, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(isDeleted, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("update/{uuid}")
    public ResponseEntity<ResponseDTO> update(@PathVariable UUID uuid, RequestDTO requestDTO) {
        try {
            ResponseDTO responseDTO = getService().update(uuid, requestDTO);
            return new ResponseEntity<>(responseDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

}
