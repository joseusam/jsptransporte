/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.model;

import java.util.Date;

/**
 *
 * @author moises.alvarengausam
 */
public class RegistroBean {
    private int idregist;
    private HorarioBean idhorari;
    private Date horLle;
    private Date horRet;
    private String coment;
    private double kilomP;
    private double kilomR;

    public RegistroBean(int idregist) {
        this.idregist = idregist;
    }
    
    public int getIdregist() {
        return idregist;
    }

    public void setIdregist(int idregist) {
        this.idregist = idregist;
    }

    public HorarioBean getIdhorari() {
        return idhorari;
    }

    public void setIdhorari(HorarioBean idhorari) {
        this.idhorari = idhorari;
    }

    public Date getHorLle() {
        return horLle;
    }

    public void setHorLle(Date horLle) {
        this.horLle = horLle;
    }

    public Date getHorRet() {
        return horRet;
    }

    public void setHorRet(Date horRet) {
        this.horRet = horRet;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    public double getKilomP() {
        return kilomP;
    }

    public void setKilomP(double kilomP) {
        this.kilomP = kilomP;
    }

    public double getKilomR() {
        return kilomR;
    }

    public void setKilomR(double kilomR) {
        this.kilomR = kilomR;
    }
        
}
