package com.example.zthsystem;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@RestController
class ZthSystemApplicationTests {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @Test
    void contextLoads() {
    }

}
