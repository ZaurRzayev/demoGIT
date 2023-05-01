package com.example.demogit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGitApplication.class, args);
    }

}
