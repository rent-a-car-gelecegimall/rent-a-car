package com.gelecegimall.rentacarbackend.database.repository;

import com.gelecegimall.rentacarbackend.database.entity.CustomerEntity;
import com.gelecegimall.rentacarbackend.util.dbutil.IBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends IBaseRepository<CustomerEntity> {
}
