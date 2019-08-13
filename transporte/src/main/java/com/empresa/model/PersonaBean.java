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
public class PersonaBean {
    
   private int idperson;
   private String nombre;
   private String apelli;
   private String telefo;
   private String docume;
   private DireccionBean iddirecc;
   private TipoDocumentoBean idtipDoc;

    public PersonaBean(int idperson) {
        this.idperson = idperson;
    }

    public int getIdperson() {
        return idperson;
    }

    public void setIdperson(int idperson) {
        this.idperson = idperson;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelli() {
        return apelli;
    }

    public void setApelli(String apelli) {
        this.apelli = apelli;
    }

    public String getTelefo() {
        return telefo;
    }

    public void setTelefo(String telefo) {
        this.telefo = telefo;
    }

    public String getDocume() {
        return docume;
    }

    public void setDocume(String docume) {
        this.docume = docume;
    }

    public DireccionBean getIddirecc() {
        return iddirecc;
    }

    public void setIddirecc(DireccionBean iddirecc) {
        this.iddirecc = iddirecc;
    }

    public TipoDocumentoBean getIdtipDoc() {
        return idtipDoc;
    }

    public void setIdtipDoc(TipoDocumentoBean idtipDoc) {
        this.idtipDoc = idtipDoc;
    }
    
}
