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
public class TipoDocumentoBean {
    
    private int idtipDoc;
    private String descri;

    public TipoDocumentoBean(int idtipDoc) {
        this.idtipDoc = idtipDoc;
    }
    
    public int getIdtipDoc() {
        return idtipDoc;
    }

    public void setIdtipDoc(int idtipDoc) {
        this.idtipDoc = idtipDoc;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }
 
}
