/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.DireccionBean;
import com.empresa.model.PersonaBean;
import com.empresa.model.TipoDocumentoBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author moises.alvarengausam
 */
public class PersonaDao {
    private Conexion conn;
    private PersonaBean perBea;
    private DireccionBean dirBea;
    private TipoDocumentoBean tipDBea;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public PersonaDao(Conexion conn) {
        this.conn = conn;
    }
    
}
