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
public class NinioModalidadBean {
    
    private int idninMod;
    private Date hora;
    private NinioBean idninio;
    private ModalidadBean idmodali;

    public NinioModalidadBean(int idninMod) {
        this.idninMod = idninMod;
    }

    public int getIdninMod() {
        return idninMod;
    }

    public void setIdninMod(int idninMod) {
        this.idninMod = idninMod;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public NinioBean getIdninio() {
        return idninio;
    }

    public void setIdninio(NinioBean idninio) {
        this.idninio = idninio;
    }

    public ModalidadBean getIdmodali() {
        return idmodali;
    }

    public void setIdmodali(ModalidadBean idmodali) {
        this.idmodali = idmodali;
    }

}
