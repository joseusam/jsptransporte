/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.NinioBean;
import com.empresa.model.ParadaBean;
import com.empresa.model.ParadaNinioBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class ParadaNinioDao {
    private Conexion conn;
    private ParadaNinioBean parNBea;
    private NinioBean ninBea;
    private ParadaBean parB;
    private List<ParadaNinioBean> parNLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public ParadaNinioDao(Conexion conn) {
        this.conn = conn;
    }
    
    public boolean eliminar(int id){
        sql = "DELETE FROM parada_ninio WHERE idparada_ninio=?";
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
    
    public List<ParadaNinioBean> buscarTodo(){
        sql = "SELECT * FROM parada_ninio";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            parNLS = new LinkedList<>();
            
            while (rs.next()) {                
                parNBea = new ParadaNinioBean(rs.getInt("idparada_ninio"));
                
                ninBea = new NinioBean(rs.getInt("idninio"));
                parNBea.setIdninio(ninBea);
                parB = new ParadaBean(rs.getInt("idparada"));
                parNBea.setIdinicio(parB);
                parB = new ParadaBean(rs.getInt("idparada"));
                parNBea.setIdfinal(parB);
                
                parNLS.add(parNBea);
            }
            
            return parNLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo: "+e);
            return null;
        }
    }
    
    public List<ParadaNinioBean> buscarPorId(){
        sql = "SELECT * FROM parada_ninio WHERE idparada_ninio=?";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            parNLS = new LinkedList<>();
            
            while (rs.next()) {                
                parNBea = new ParadaNinioBean(rs.getInt("idparada_ninio"));
                
                ninBea = new NinioBean(rs.getInt("idninio"));
                parNBea.setIdninio(ninBea);
                parB = new ParadaBean(rs.getInt("idparada"));
                parNBea.setIdinicio(parB);
                parB = new ParadaBean(rs.getInt("idparada"));
                parNBea.setIdfinal(parB);
                
                parNLS.add(parNBea);
            }
            
            return parNLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Por Id: "+e);
            return null;
        }
    }
}
