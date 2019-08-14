/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.RutaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class RutaDao {
    private Conexion conn;
    private RutaBean rutBea;
    private DireccionDao dirBea;
    private List<RutaBean> rutaLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public RutaDao(Conexion conn) {
        this.conn = conn;
    }
    
}
