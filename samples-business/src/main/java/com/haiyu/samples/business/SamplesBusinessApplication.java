package com.haiyu.samples.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.haiyu.samples", exclude = DataSourceAutoConfiguration.class)
public class SamplesBusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamplesBusinessApplication.class, args);
    }

}
