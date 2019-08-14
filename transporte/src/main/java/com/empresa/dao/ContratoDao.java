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
    public boolean insertar(ContratoBean conBea){
    
    sql = "insert into contrato values(?,?,?,?,?,?,?,?)";
        try {
            
            ps = conn.conexion().prepareStatement(sql);
            
            ps.setInt(1, conBea.getIdcontra());
            ps.setInt(2, apoBea.getIdapoder());
            ps.setInt(3, conBea.getNumHij());
            ps.setString(4, format.format(conBea.getDesde()));
            ps.setString(5, format.format(conBea.getHasta()));
            ps.setInt(6, conBea.getPeriod());
            ps.setDouble(7, conBea.getPrecio());
            ps.setString(8, conBea.getComenta());
            ps.executeUpdate();
            return true;
           
        } catch (Exception e) {
            return false;
        }
    }
        public boolean actualizar(ContratoBean conBea){
        
            sql = "update contrato set idapoderado, no_hijos, desde, hasta, periodo, precio, comentarios where idcontrato =?";
        try {
            
            ps = conn.conexion().prepareStatement(sql);
            
            ps.setInt(1, apoBea.getIdapoder());
            ps.setInt(2, conBea.getNumHij());
            ps.setString(3, format.format(conBea.getDesde()));
            ps.setString(4, format.format(conBea.getHasta()));
            ps.setInt(5, conBea.getPeriod());
            ps.setDouble(6, conBea.getPrecio());
            ps.setString(7, conBea.getComenta());
            ps.setInt(8, conBea.getIdcontra());
            ps.executeUpdate();
            return true;
           
        } catch (Exception e) {
            return false;
        }
        }
    }

