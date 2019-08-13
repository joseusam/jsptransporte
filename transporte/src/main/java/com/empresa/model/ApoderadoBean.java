/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.model;

/**
 *
 * @author jose.lariosusam
 */
public class ApoderadoBean {
    
    private int idapoder;
    private PersonaBean idperson;

    public ApoderadoBean(int idapoder) {
        this.idapoder = idapoder;
    }
    
    public int getIdapoder() {
        return idapoder;
    }

    public void setIdapoder(int idapoder) {
        this.idapoder = idapoder;
    }

    public PersonaBean getIdperson() {
        return idperson;
    }

    public void setIdperson(PersonaBean idperson) {
        this.idperson = idperson;
    }
}
