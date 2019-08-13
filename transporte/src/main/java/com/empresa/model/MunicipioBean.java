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
public class MunicipioBean {
    
    private int idmun;
    private String mun;

    public MunicipioBean(int idmun) {
        this.idmun = idmun;
    }

    public int getIdmun() {
        return idmun;
    }

    public void setIdmun(int idmun) {
        this.idmun = idmun;
    }

    public String getMun() {
        return mun;
    }

    public void setMun(String mun) {
        this.mun = mun;
    }
    
}
