package com.prashanth.spring.reactive.r2dbc;

import lombok.Data;
import lombok.NonNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactiveR2DBCApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveR2DBCApplication.class, args);
    }
}

