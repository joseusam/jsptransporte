/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.model;

/**
 *
 * @author moises.alvarengausam
 */
public class BusBean {
    private int idbus;
    private String placas;
    private int asient;   

    public BusBean(int idbus) {
        this.idbus = idbus;
    }

    public int getIdbus() {
        return idbus;
    }

    public void setIdbus(int idbus) {
        this.idbus = idbus;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public int getAsient() {
        return asient;
    }

    public void setAsient(int asient) {
        this.asient = asient;
    }
    
    
}
