package com.example.zthsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@SpringBootApplication
@RestController
public class ZthSystemApplication {


    public static void main(String[] args) {

        SpringApplication.run(ZthSystemApplication.class, args);
    }

    @GetMapping("/zthsystem")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
