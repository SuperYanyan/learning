package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BananaController {

    @GetMapping("/firstController")
    public String firstController(){
        return "Hello FirstController!";
    }

    @GetMapping("/secondController")
    public String secondController(){
        return "Hello SecondController!";
    }

    @GetMapping("/thirdController")
    public String thirdController(){
        return "Hello thirdController!";
    }

    @GetMapping("/fifthController")
    public String fifthController(){
        return "Hello fifthController!";
    }


}
