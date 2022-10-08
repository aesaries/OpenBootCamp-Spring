package com.E456.Ejercicio.controllers;

import com.E456.Ejercicio.entities.Laptop;
import com.E456.Ejercicio.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopRepository lr;

    @PostMapping("api/laptop")
    public Laptop guardarLaptop(@RequestBody Laptop lt, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        return  lr.save(lt);
    }


    @GetMapping("api/laptop")
    public List<Laptop> listaLaptop(){

        return lr.findAll();
    }

}
