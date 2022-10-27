package com.E456.ejercicio.controllers;


import com.E456.ejercicio.entities.Laptop;
import com.E456.ejercicio.repository.LaptopRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    @Autowired
    LaptopRepository lr;

    public final Logger log = LoggerFactory.getLogger(LaptopController.class);


    @PostMapping("api/laptop")
    @ApiOperation("Crea una entidad Laptop con ID automatico (no añadir id)")
    public Laptop guardarLaptop(@RequestBody Laptop lt, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        return  lr.save(lt);
    }

// Pedido de todos las laptops

    /**
     * Buscar todos las Laptop que hay en base de datos (ArrayList de libros)
     * http://localhost:8081/api/books
     * @return
     */
    @GetMapping("api/laptop")
    @ApiOperation("Peticion de lista completa de Laptop")
    public List<Laptop> listaLaptop(){

        return lr.findAll();
    }

    // pedido de una laptop por id
    /**
     * http://localhost:8081/api/books/1
     * http://localhost:8081/api/books/2
     * Request
     * Response
     * @param id
     * @return
     */

    @GetMapping("api/laptop/{id}")
    @ApiOperation("Peticion de Laptop pasando un parametro Long Id")
    public ResponseEntity<Laptop> encuentraxId(@ApiParam("Parametro para pedir el dato de una Laptop con un Long ID") @PathVariable Long id) {
        Optional<Laptop> optLaptop = lr.findById(id);
        if (optLaptop.isPresent()) {
            return ResponseEntity.ok(optLaptop.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("api/laptop")
    @ApiOperation("Modificacion de datos de una entidad Laptop")
    public ResponseEntity<Laptop> actualiza(@ApiParam("Solicita la estructura Json de un Laptop") @RequestBody Laptop laptop){

        if (laptop.getId() == null) {
            log.warn("intenta actualizar una entidad que no existe");
            return ResponseEntity.badRequest().build();

        }
        if (!lr.existsById(laptop.getId())) {
            log.warn("Intenta actualizar un Laptop que no Existe");
        }
        Laptop result = lr.save(laptop);
        return ResponseEntity.ok(result);

    }

    @DeleteMapping("api/laptop/{id}")
    @ApiIgnore
    public ResponseEntity<Laptop> borra(@PathVariable Long id) {
        if (!lr.existsById(id)) {
            log.warn("Intenta borrar un id que no existe!!!!!");
            return ResponseEntity.badRequest().build();
        }
        lr.deleteById(id);
        return ResponseEntity.noContent().build();

    }

    @DeleteMapping("api/laptop")
    @ApiIgnore
    public ResponseEntity<Laptop> borraTodo() {
        log.info("La peticion borrara todos los registros");
        lr.deleteAll();
        return ResponseEntity.noContent().build();
    }

}
