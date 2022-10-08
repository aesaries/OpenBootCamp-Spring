package com.E456.Ejercicio.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private int pulgadas;
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
