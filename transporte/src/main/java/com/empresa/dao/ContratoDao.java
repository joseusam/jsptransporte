/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.ApoderadoBean;
import com.empresa.model.ContratoBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class ContratoDao {
    private Conexion conn; 
    private ContratoBean conBea;
    private ApoderadoBean apoBea;
    private List<ContratoBean> contLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    private SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");

    public ContratoDao(Conexion conn) {
        this.conn = conn;
    }
    
}
