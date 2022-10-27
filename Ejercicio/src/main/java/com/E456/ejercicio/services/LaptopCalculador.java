package com.E456.ejercicio.services;

import com.E456.ejercicio.entities.Laptop;

public class LaptopCalculador {
    Integer precio = 70;

    public Integer precioFinal(Laptop laptop){
        if (laptop.isEsLatina()){
            precio += 100;
        }
        if(laptop.getPulgadas()> 13){
            precio+= 50;
        }
        return precio;
    }

}
