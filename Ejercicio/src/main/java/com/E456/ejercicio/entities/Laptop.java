package com.E456.ejercicio.entities;



import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@ApiModel(value = "Entidad Laptop", description = "caracteristicas de una pc portatil")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id automatico tipo Long")
    private Long id;

    @ApiModelProperty(value = "marca de la pc")
    private String marca;
    @ApiModelProperty(value = "Tamaño de la pantalla en pulgadas")
    private int pulgadas;
    @ApiModelProperty(value = "Si es Latina el teclado trae al letra ñ")
    private boolean esLatina;

    public Laptop() {
    }

    public Laptop(Long id, String marca, int pulgadas, boolean esLatina) {
        this.id = id;
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.esLatina = esLatina;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isEsLatina() {
        return esLatina;
    }

    public void setEsLatina(boolean esLatina) {
        this.esLatina = esLatina;
    }
}
