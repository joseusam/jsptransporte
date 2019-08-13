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
public class RutaBean {
    private int idruta;
    private DireccionBean idinicio;

    public RutaBean(int idruta) {
        this.idruta = idruta;
    }

    public int getIdruta() {
        return idruta;
    }

    public void setIdruta(int idruta) {
        this.idruta = idruta;
    }

    public DireccionBean getIdinicio() {
        return idinicio;
    }

    public void setIdinicio(DireccionBean idinicio) {
        this.idinicio = idinicio;
    }
        
}
