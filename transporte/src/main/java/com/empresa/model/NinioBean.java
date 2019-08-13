/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.model;

import java.util.Date;

/**
 *
 * @author jose.lariosusam
 */
public class NinioBean {
        
    private int idnino;
    private PersonaBean idperson;
    private ApoderadoBean idapoder;
    private Date horaP;
    private Date horaLl;

    public NinioBean(int idnino) {
        this.idnino = idnino;
    }
    
    public int getIdnino() {
        return idnino;
    }

    public void setIdnino(int idnino) {
        this.idnino = idnino;
    }

    public PersonaBean getIdperson() {
        return idperson;
    }

    public void setIdperson(PersonaBean idperson) {
        this.idperson = idperson;
    }

    public ApoderadoBean getIdapoder() {
        return idapoder;
    }

    public void setIdapoder(ApoderadoBean idapoder) {
        this.idapoder = idapoder;
    }

    public Date getHoraP() {
        return horaP;
    }

    public void setHoraP(Date horaP) {
        this.horaP = horaP;
    }

    public Date getHoraLl() {
        return horaLl;
    }

    public void setHoraLl(Date horaLl) {
        this.horaLl = horaLl;
    }

}
