/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.RolBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class RolDao {
    private Conexion conn;
    private RolBean rolBea;
    private List<RolBean> rolLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public RolDao(Conexion conn) {
        this.conn = conn;
    }
    
}
