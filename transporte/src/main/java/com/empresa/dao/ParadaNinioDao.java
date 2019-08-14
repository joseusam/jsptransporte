/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.ParadaBean;
import com.empresa.model.ParadaNinioBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class ParadaNinioDao {
    private Conexion conn;
    private ParadaNinioBean parNBea;
    private ParadaBean parB;
    private List<ParadaBean> parBLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public ParadaNinioDao(Conexion conn) {
        this.conn = conn;
    }
    
}
