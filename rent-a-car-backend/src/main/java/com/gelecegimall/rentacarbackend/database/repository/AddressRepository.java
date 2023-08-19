package com.gelecegimall.rentacarbackend.database.repository;

import com.gelecegimall.rentacarbackend.database.entity.AddressEntity;
import com.gelecegimall.rentacarbackend.util.dbutil.IBaseRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AddressRepository extends IBaseRepository<AddressEntity> {
}
