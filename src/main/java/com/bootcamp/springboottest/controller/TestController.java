package com.bootcamp.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String Saudacao(String nome){
        return String.format("Bem-vindo, %s", nome);
    }
}
