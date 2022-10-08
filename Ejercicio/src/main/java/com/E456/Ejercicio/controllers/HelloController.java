package com.E456.Ejercicio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello/saludo")
    public String imprimeSaludo(){
        System.out.println("Saludando desde Hello Controller");
        return  "HOla desde Hello Controller por segunda vez ´por tercera vez";
    }

}
