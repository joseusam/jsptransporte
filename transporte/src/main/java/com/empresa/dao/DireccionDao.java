/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.DireccionBean;
import com.empresa.model.MunicipioBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author moises.alvarengausam
 */
public class DireccionDao {
    private Conexion conn;
    private DireccionBean dirBea;
    private MunicipioBean munBea;
    private List<DireccionBean> dirLS;
    
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;
    
    public boolean eliminar(int id){
        sql = "DELETE FROM direccion WHERE iddireccion=?";
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
    
    public List<DireccionBean> buscarTodo(){
        sql = "SELECT * FROM direccion";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            dirLS = new LinkedList<>();
            
            while (rs.next()) {                
                dirBea = new DireccionBean(rs.getInt("iddireccion"));
                dirBea.setDir(rs.getString("direccion"));
                munBea = new MunicipioBean(rs.getInt("idmunicipio"));
                dirBea.setIdmun(munBea);
                
                dirLS.add(dirBea);
            }return dirLS;
            
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo: "+e);
            return null;
        }
    }
    
    public List<DireccionBean> buscarPorId(int id){
        sql = "SELECT * FROM direccion WHERE iddireccion=?";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            dirLS = new LinkedList<>();
            
            while (rs.next()) {                
                dirBea = new DireccionBean(rs.getInt("iddireccion"));
                dirBea.setDir(rs.getString("direccion"));
                munBea = new MunicipioBean(rs.getInt("idmunicipio"));
                dirBea.setIdmun(munBea);
                
                dirLS.add(dirBea);
            }return dirLS;
            
        } catch (Exception e) {
            System.out.println("Error en Buscar Por Id: "+e);
            return null;
        }
    }
}
