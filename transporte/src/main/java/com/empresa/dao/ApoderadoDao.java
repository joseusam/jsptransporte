/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.ApoderadoBean;
import com.empresa.model.PersonaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author jose.lariosusam
 */
public class ApoderadoDao {
    
    private Conexion conn;
    private ApoderadoBean apoBea;
    private PersonaBean persBea;
    private List<ApoderadoBean> apbLS;
    
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;
    
    public boolean insertar(ApoderadoBean apoBea){
    
    sql = "insert into apoderado values(?,?)";
        try {
            
            ps = conn.conexion().prepareStatement(sql);
    
    ps.setInt(1, apoBea.getIdapoder());
    ps.setInt(2, persBea.getIdperson());
    ps.executeUpdate();
    return true;
        } catch (Exception e) {
            
            return false;
        }
    }
    
    public boolean actualizar(ApoderadoBean apoBea){
    
     sql = "update apoderado set idpersona where idapoderado =?";
        try {
            
            ps = conn.conexion().prepareStatement(sql);
    
    ps.setInt(1, persBea.getIdperson());
    ps.setInt(2, apoBea.getIdapoder());
    ps.executeUpdate();
    return true;
        } catch (Exception e) {
            
            return false;
        }
    }
    
}
