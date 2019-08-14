/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.EmpleadoBean;
import com.empresa.model.PersonaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class EmpleadoDao {
    private Conexion conn;
    private EmpleadoBean empBea;
    private PersonaBean perBea;
    private List<PersonaBean> persLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public EmpleadoDao(Conexion conn) {
        this.conn = conn;
    }
    public boolean insertar(EmpleadoBean ampBea){
    
    sql = "insert into empleado values(?,?,?)";
    
        try {
            
            ps = conn.conexion().prepareStatement(sql);
            
            ps.setInt(1, empBea.getIdemplea());
            ps.setInt(2, perBea.getIdperson());
            ps.setString(3, empBea.getLicenc());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            
            return false;
        }
    }
    public boolean actualizar(EmpleadoBean ampBea){
        
     sql = "update empleado set idpersona, licencia where idempleado =?";
    
        try {
            
            ps = conn.conexion().prepareStatement(sql);
                     
            ps.setInt(1, perBea.getIdperson());
            ps.setString(2, empBea.getLicenc());
             ps.setInt(3, empBea.getIdemplea());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            
            return false;
        }
    
    }
}
