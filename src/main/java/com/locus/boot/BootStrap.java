package com.locus.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"com.locus.apis"})
public class BootStrap {
	public static void main(String[] args) {
        SpringApplication.run(BootStrap.class, args);
    }
}
