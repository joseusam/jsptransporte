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
public class HorarioBean {
    private int idhorari;
    private EmpleadoBean idemplea;
    private RolBean idrol;
    private Date fecha;
    private BusBean idbus;
    private RutaBean idruta;

    public HorarioBean(int idhorari) {
        this.idhorari = idhorari;
    }
    
    public int getIdhorari() {
        return idhorari;
    }

    public void setIdhorari(int idhorari) {
        this.idhorari = idhorari;
    }

    public EmpleadoBean getIdemplea() {
        return idemplea;
    }

    public void setIdemplea(EmpleadoBean idemplea) {
        this.idemplea = idemplea;
    }

    public RolBean getIdrol() {
        return idrol;
    }

    public void setIdrol(RolBean idrol) {
        this.idrol = idrol;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BusBean getIdbus() {
        return idbus;
    }

    public void setIdbus(BusBean idbus) {
        this.idbus = idbus;
    }

    public RutaBean getIdruta() {
        return idruta;
    }

    public void setIdruta(RutaBean idruta) {
        this.idruta = idruta;
    }
    
}
