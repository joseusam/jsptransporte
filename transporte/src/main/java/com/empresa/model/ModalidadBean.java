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
public class ModalidadBean {
    private int idmodali;
    private String descri;

    public ModalidadBean(int idmodali) {
        this.idmodali = idmodali;
    }

    public int getIdmodali() {
        return idmodali;
    }

    public void setIdmodali(int idmodali) {
        this.idmodali = idmodali;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }        
}
