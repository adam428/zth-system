package com.example.zthsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@SpringBootApplication
@RestController
public class ZthSystemApplication {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    public static void main(String[] args) {

        SpringApplication.run(ZthSystemApplication.class, args);
    }



}
