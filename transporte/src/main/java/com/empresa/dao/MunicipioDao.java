/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.MunicipioBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class MunicipioDao {
    private Conexion conn;
    private MunicipioBean munBea;
    private List<MunicipioBean> munLS;
    
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;
    
    public MunicipioDao(Conexion conn){
        this.conn = conn;
    }
    
    public boolean eliminar(int id){
        sql = "DELETE FROM municipio WHERE idmunicipio=?";
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
            System.out.println("Error al Eliminar: "+e);
            return false;
        }
    }
    
    public List<MunicipioBean> buscarTodo(){
        sql = "SELECT * FROM municipio";
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            munLS = new LinkedList<>();
            
            while (rs.next()) {                
                munBea = new MunicipioBean(rs.getInt("idmunicipio"));
                munBea.setMun(rs.getString("municipio"));
                
                munLS.add(munBea);
            }return munLS;
            
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo: "+e);
            return null;
        }
    }
    
    public List<MunicipioBean> buscarPorId(int id){
        sql = "SELECT * FROM municipio WHERE idmunicipio=?";
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            munLS = new LinkedList<>();
            
            while (rs.next()) {                
                munBea = new MunicipioBean(rs.getInt("idmunicipio"));
                munBea.setMun(rs.getString("municipio"));
                
                munLS.add(munBea);
            }return munLS;
            
        } catch (Exception e) {
            System.out.println("Error en Buscar Por Id: "+e);
            return null;
        }
    }
    
}
