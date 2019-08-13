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
public class ParadaNinioBean {
    private int idparNin;
    private NinioBean idninio;
    private ParadaBean idinicio;
    private ParadaBean idfinal;

    public ParadaNinioBean(int idparNin) {
        this.idparNin = idparNin;
    }
    
    public int getIdparNin() {
        return idparNin;
    }

    public void setIdparNin(int idparNin) {
        this.idparNin = idparNin;
    }

    public NinioBean getIdninio() {
        return idninio;
    }

    public void setIdninio(NinioBean idninio) {
        this.idninio = idninio;
    }

    public ParadaBean getIdinicio() {
        return idinicio;
    }

    public void setIdinicio(ParadaBean idinicio) {
        this.idinicio = idinicio;
    }

    public ParadaBean getIdfinal() {
        return idfinal;
    }

    public void setIdfinal(ParadaBean idfinal) {
        this.idfinal = idfinal;
    }
    
}
