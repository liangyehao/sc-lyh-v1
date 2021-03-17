package com.liang.servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HiApp {
    public static void main(String[] args) {
        SpringApplication.run(HiApp.class,args);
    }

    String port;

    @Value("${server.port}")
    public void port(String port) {
        this.port = port;
    }

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam(value = "name",defaultValue = "liang") String name){

        return "hi "+name+",I am from "+port;
    }
}
