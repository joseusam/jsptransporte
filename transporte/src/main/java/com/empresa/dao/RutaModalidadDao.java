/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.ModalidadBean;
import com.empresa.model.RutaBean;
import com.empresa.model.RutaModalidadBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class RutaModalidadDao {
    private Conexion conn;
    private RutaModalidadBean rutMBea;
    private RutaBean rutBea;
    private ModalidadBean modBean;
    private List<RutaModalidadBean> rutMLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    private SimpleDateFormat fomat = new SimpleDateFormat("HH:mm:ss");

    public RutaModalidadDao(Conexion conn) {
        this.conn = conn;
    }
        
}
