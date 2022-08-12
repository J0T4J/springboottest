package com.bootcamp.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String Saudacao(@RequestParam(name = "nome", defaultValue = "Juan") String nome){
        return String.format("Bem-vindo, %s", nome);
    }
}
