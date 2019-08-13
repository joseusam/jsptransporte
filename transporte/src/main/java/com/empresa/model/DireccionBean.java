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
public class DireccionBean {
   public int iddir;
   public MunicipioBean idmun;
   public String dir;

    public DireccionBean(int iddir) {
        this.iddir = iddir;
    }
   
    public int getIddir() {
        return iddir;
    }

    public void setIddir(int iddir) {
        this.iddir = iddir;
    }

    public MunicipioBean getIdmun() {
        return idmun;
    }

    public void setIdmun(MunicipioBean idmun) {
        this.idmun = idmun;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
   
   
}
