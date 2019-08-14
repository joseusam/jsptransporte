/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.EmpleadoBean;
import com.empresa.model.PersonaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class EmpleadoDao {
    private Conexion conn;
    private EmpleadoBean empBea;
    private PersonaBean perBea;
    private List<PersonaBean> persLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public EmpleadoDao(Conexion conn) {
        this.conn = conn;
    }
    
}
