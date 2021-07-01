
package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CARRO")


public class Carro {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column
    private String placa;
    @Column
    private String marca;
    @Column
    private String modelo;

    public int getID() {
        return ID;
    }
    public void setId(int ID) {
        this.ID = ID;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
}
