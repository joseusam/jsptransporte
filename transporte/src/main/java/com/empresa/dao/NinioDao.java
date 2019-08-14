/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.NinioBean;
import com.empresa.model.PersonaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class NinioDao {
    private Conexion conn;
    private NinioBean ninBea;
    private PersonaBean perBea;
    private List<NinioBean> niniLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    private SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    public NinioDao(Conexion conn) {
        this.conn = conn;
    }
    
}
