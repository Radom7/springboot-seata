package com.haiyu.samples.order;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.haiyu.samples", exclude = DataSourceAutoConfiguration.class)
public class SamplesOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamplesOrderApplication.class, args);
    }

}
