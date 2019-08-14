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
public class ContratoBean {
    
   private int idcontra;
   private ApoderadoBean idapoder;
   private int numHij;
   private Date desde;
   private Date hasta;
   private int period;
   private double precio;
   private String comenta;

    public ContratoBean(int idcontra) {
        this.idcontra = idcontra;
    }

   public int getIdcontra() {
        return idcontra;
    }

    public void setIdcontra(int idcontra) {
        this.idcontra = idcontra;
    }

    public ApoderadoBean getIdapoder() {
        return idapoder;
    }

    public void setIdapoder(ApoderadoBean idapoder) {
        this.idapoder = idapoder;
    }

    public int getNumHij() {
        return numHij;
    }

    public void setNumHij(int numHij) {
        this.numHij = numHij;
    }
    

    public Date getHasta() {
        return hasta;
    }

    public void setHasta(Date hasta) {
        this.hasta = hasta;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getComenta() {
        return comenta;
    }

    public void setComenta(String comenta) {
        this.comenta = comenta;
    }

    public Date getDesde() {
        return desde;
    }

    public void setDesde(Date desde) {
        this.desde = desde;
    }

}
