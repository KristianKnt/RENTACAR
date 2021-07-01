package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONDUCTOR")

public class Condutor {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column
    private String NOMBRE;
    @Column
    private String APELLIDO;
    @Column
    private int cedula;

    
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getNOMBRE() {
        return NOMBRE;
    }
    public void setNOMBRE(String nOMBRE) {
        NOMBRE = nOMBRE;
    }
    public String getAPELLIDO() {
        return APELLIDO;
    }
    public void setAPELLIDO(String aPELLIDO) {
        APELLIDO = aPELLIDO;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
}
