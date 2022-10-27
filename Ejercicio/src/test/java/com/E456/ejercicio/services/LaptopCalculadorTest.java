package com.E456.ejercicio.services;

import com.E456.ejercicio.entities.Laptop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaptopCalculadorTest {

    @Test
    void precioFinal() {

        // se prepara los objetos para el test
        Laptop laptop = new Laptop(5L, "pcPrueba", 15, true);
        LaptopCalculador calculador = new LaptopCalculador();

        // se ejecuta el procedimiento para ver que resultado va a dar
       Integer precioFinalTest = calculador.precioFinal(laptop);

       // se empiezan a comprobar las aserciones
        assertTrue(precioFinalTest > 50);
        assertEquals(220, precioFinalTest);



    }
}