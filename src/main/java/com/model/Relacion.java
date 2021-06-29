package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RELACION")

public class Relacion{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column
    private int ID_CONDUCTOR;
    @Column
    private int ID_CARRO;
    @Column
    private int ID_DESPLAZAMINETO;
    @Column
    private Date FECHA_RELACION_CREADA;
    
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public int getID_CONDUCTOR() {
        return ID_CONDUCTOR;
    }
    public void setID_CONDUCTOR(int iD_CONDUCTOR) {
        ID_CONDUCTOR = iD_CONDUCTOR;
    }
    public int getID_CARRO() {
        return ID_CARRO;
    }
    public void setID_CARRO(int iD_CARRO) {
        ID_CARRO = iD_CARRO;
    }
    public int getID_DESPLAZAMINETO() {
        return ID_DESPLAZAMINETO;
    }
    public void setID_DESPLAZAMINETO(int iD_DESPLAZAMINETO) {
        ID_DESPLAZAMINETO = iD_DESPLAZAMINETO;
    }
    public Date getFECHA_RELACION_CREADA() {
        return FECHA_RELACION_CREADA;
    }
    public void setFECHA_RELACION_CREADA(Date fECHA_RELACION_CREADA) {
        FECHA_RELACION_CREADA = fECHA_RELACION_CREADA;
    }

    




}