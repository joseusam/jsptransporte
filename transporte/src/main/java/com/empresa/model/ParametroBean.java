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
public class ParametroBean {
    private int idparame;
    private String descri;
    private double valor;

    public ParametroBean(int idparame) {
        this.idparame = idparame;
    }
    
    public int getIdparame() {
        return idparame;
    }

    public void setIdparame(int idparame) {
        this.idparame = idparame;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
