package com.example.obspringej789.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @GetMapping("/hola")
    public String saludo(){
        return "Hola caracola!";
    }
}
