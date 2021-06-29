package com.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DESPLAZAMIENTO")

public class Desplazamiento {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column
    private double LATITUD_ORIGEN;
    @Column
    private double LATITUD_DESTINO;
    @Column
    private double LOGINTUD_ORIGEN;
    @Column
    private double LONGITUD_DESTINO;
    @Column
    private Date FECHA_DESTINO;
    @Column
    private Date FECHA_ORIGEN;
    @Column
    private byte ESTADO;

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public double getLATITUD_ORIGEN() {
        return LATITUD_ORIGEN;
    }

    public void setLATITUD_ORIGEN(double lATITUD_ORIGEN) {
        LATITUD_ORIGEN = lATITUD_ORIGEN;
    }

    public double getLATITUD_DESTINO() {
        return LATITUD_DESTINO;
    }

    public void setLATITUD_DESTINO(double lATITUD_DESTINO) {
        LATITUD_DESTINO = lATITUD_DESTINO;
    }

    public double getLOGINTUD_ORIGEN() {
        return LOGINTUD_ORIGEN;
    }

    public void setLOGINTUD_ORIGEN(double lOGINTUD_ORIGEN) {
        LOGINTUD_ORIGEN = lOGINTUD_ORIGEN;
    }

    public double getLONGITUD_DESTINO() {
        return LONGITUD_DESTINO;
    }

    public void setLONGITUD_DESTINO(double lONGITUD_DESTINO) {
        LONGITUD_DESTINO = lONGITUD_DESTINO;
    }

    public Date getFECHA_DESTINO() {
        return FECHA_DESTINO;
    }

    public void setFECHA_DESTINO(Date fECHA_DESTINO) {
        FECHA_DESTINO = fECHA_DESTINO;
    }

    public Date getFECHA_ORIGEN() {
        return FECHA_ORIGEN;
    }

    public void setFECHA_ORIGEN(Date fECHA_ORIGEN) {
        FECHA_ORIGEN = fECHA_ORIGEN;
    }

    public byte getESTADO() {
        return ESTADO;
    }

    public void setESTADO(byte eSTADO) {
        ESTADO = eSTADO;
    }

}
