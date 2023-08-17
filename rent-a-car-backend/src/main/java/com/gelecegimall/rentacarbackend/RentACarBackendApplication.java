package com.gelecegimall.rentacarbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class RentACarBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentACarBackendApplication.class, args);
    }

}
