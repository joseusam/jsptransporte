/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.model;

import java.util.Date;

/**
 *
 * @author moises.alvarengausam
 */
public class RutaModalidadBean {
    private int idrutMod;
    private Date hora;
    private RutaBean idruta;
    private ModalidadBean idmodali;

    public RutaModalidadBean(int idrutMod) {
        this.idrutMod = idrutMod;
    }

    public int getIdrutMod() {
        return idrutMod;
    }

    public void setIdrutMod(int idrutMod) {
        this.idrutMod = idrutMod;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public RutaBean getIdruta() {
        return idruta;
    }

    public void setIdruta(RutaBean idruta) {
        this.idruta = idruta;
    }

    public ModalidadBean getIdmodali() {
        return idmodali;
    }

    public void setIdmodali(ModalidadBean idmodali) {
        this.idmodali = idmodali;
    }
    
}
