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
public class EmpleadoBean {
    private int idemplea;
    private PersonaBean idperson;
    private String licenc;

    public EmpleadoBean(int idemplea) {
        this.idemplea = idemplea;
    }

    public int getIdemplea() {
        return idemplea;
    }

    public void setIdemplea(int idemplea) {
        this.idemplea = idemplea;
    }

    public PersonaBean getIdperson() {
        return idperson;
    }

    public void setIdperson(PersonaBean idperson) {
        this.idperson = idperson;
    }

    public String getLicenc() {
        return licenc;
    }

    public void setLicenc(String licenc) {
        this.licenc = licenc;
    }
    
    
    
}
