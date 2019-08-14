/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.DireccionBean;
import com.empresa.model.ParadaBean;
import com.empresa.model.RutaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class ParadaDao {
    private Conexion conn;
    private ParadaBean parBea;
    private RutaBean rutBea;
    private DireccionBean dirBea;
    private List<ParadaBean> paraLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public ParadaDao(Conexion conn) {
        this.conn = conn;
    }
    
    
}
