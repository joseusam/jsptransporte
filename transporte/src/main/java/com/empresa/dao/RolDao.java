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
import java.util.LinkedList;
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
    
    public boolean eliminar(int id){
        sql = "DELETE FROM rol WHERE idrol=?";
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
    
    public List<RolBean> buscarTodo(){
        sql = "SELECT * FROM rol";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            rolLS = new LinkedList<>();
            
            while (rs.next()) {                
                rolBea = new RolBean(rs.getInt("idrol"));
                rolBea.setDescri(rs.getString("descripcion"));
                
                rolLS.add(rolBea);
            }
            
            return rolLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo: "+e);
            return null;
        }
    }
    
    public List<RolBean> buscarPorId(int id){
        sql = "SELECT * FROM rol WHERE idrol=?";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            rolLS = new LinkedList<>();
            
            while (rs.next()) {                
                rolBea = new RolBean(rs.getInt("idrol"));
                rolBea.setDescri(rs.getString("descripcion"));
                
                rolLS.add(rolBea);
            }
            
            return rolLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Por Id: "+e);
            return null;
        }
    }
    
}
