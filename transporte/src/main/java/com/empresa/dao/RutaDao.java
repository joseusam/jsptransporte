/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.DireccionBean;
import com.empresa.model.RutaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class RutaDao {
    private Conexion conn;
    private RutaBean rutBea;
    private DireccionBean dirBea;
    private List<RutaBean> rutaLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public RutaDao(Conexion conn) {
        this.conn = conn;
    }
    
    public boolean eliminar(int id){
        sql = "DELETE FROM ruta WHERE idruta=?";
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            System.out.println("Error en Eliminar: "+e);
            return false;
        }
    }
    
    public List<RutaBean> buscarTodo(){
        sql = "SELECT * FROM ruta";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            rutaLS = new LinkedList<>();
            
            while (rs.next()) {                
                rutBea = new RutaBean(rs.getInt("idruta"));
                dirBea = new DireccionBean(rs.getInt("iddireccion"));
                rutBea.setIdinicio(dirBea);
                
                rutaLS.add(rutBea);
            }
            
            return rutaLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo: "+e);
            return null;
        }
    }
    
    public List<RutaBean> buscarPorId(int id){
        sql = "SELECT * FROM ruta WHERE idruta=?";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            rutaLS = new LinkedList<>();
            
            while (rs.next()) {                
                rutBea = new RutaBean(rs.getInt("idruta"));
                dirBea = new DireccionBean(rs.getInt("iddireccion"));
                rutBea.setIdinicio(dirBea);
                
                rutaLS.add(rutBea);
            }
            
            return rutaLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Por Id: "+e);
            return null;
        }
    }
    
}
