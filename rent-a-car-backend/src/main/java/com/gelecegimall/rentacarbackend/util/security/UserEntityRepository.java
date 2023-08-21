package com.gelecegimall.rentacarbackend.util.security;

import com.gelecegimall.rentacarbackend.util.dbutil.IBaseRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserEntityRepository extends IBaseRepository<UserEntity> {

    Optional<UserEntity> findByEmail(String email);
}
