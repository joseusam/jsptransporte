/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.BusBean;
import com.empresa.model.EmpleadoBean;
import com.empresa.model.HorarioBean;
import com.empresa.model.RutaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class HorarioDao {
    private Conexion conn; 
    private HorarioBean horBea;
    private EmpleadoBean empBea;
    private BusBean busBea;
    private RutaBean rutBea;
    private List<HorarioBean> horaLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    private SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");

    public HorarioDao(Conexion conn) {
        this.conn = conn;
    }
    
}
