/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.BusBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class BusDao {
    private Conexion conn;
    private BusBean busBea;
    private List<BusBean> busLS;
    
    private ResultSet rs;
    private PreparedStatement ps;

    public BusDao(Conexion conn) {
        this.conn = conn;
    }
    
    
}
