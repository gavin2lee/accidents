package com.gl.roadaccidents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gavin on 16-5-26.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class RestDataWebApplication {


    public static void main(String... args) {
        System.setProperty("debug", "");

        SpringApplication.run(RestDataWebApplication.class, args);
    }


}
