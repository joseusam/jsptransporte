/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.HorarioBean;
import com.empresa.model.RegistroBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class RegistroDao {
    private Conexion conn; 
    private RegistroBean regBea;
    private HorarioBean horB;
    private List<RegistroBean> regiLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    private SimpleDateFormat fomat = new SimpleDateFormat("HH:mm:ss");

    public RegistroDao(Conexion conn) {
        this.conn = conn;
    }
   
}
