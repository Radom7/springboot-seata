package com.haiyu.samples.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.haiyu.samples", exclude = DataSourceAutoConfiguration.class)
public class SamplesAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamplesAccountApplication.class, args);
    }

}
