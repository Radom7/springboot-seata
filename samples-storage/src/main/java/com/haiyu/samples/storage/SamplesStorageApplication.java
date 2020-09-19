package com.haiyu.samples.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.haiyu.samples", exclude = DataSourceAutoConfiguration.class)
public class SamplesStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamplesStorageApplication.class, args);
    }

}
