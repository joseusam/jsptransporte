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
public class ParadaBean {
    private int idparada;
    private RutaBean idruta;
    private DireccionBean iddirecc;
    private int orden;

    public ParadaBean(int idparada) {
        this.idparada = idparada;
    }
    
    public int getIdparada() {
        return idparada;
    }

    public void setIdparada(int idparada) {
        this.idparada = idparada;
    }

    public RutaBean getIdruta() {
        return idruta;
    }

    public void setIdruta(RutaBean idruta) {
        this.idruta = idruta;
    }

    public DireccionBean getIddirecc() {
        return iddirecc;
    }

    public void setIddirecc(DireccionBean iddirecc) {
        this.iddirecc = iddirecc;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }   
}
