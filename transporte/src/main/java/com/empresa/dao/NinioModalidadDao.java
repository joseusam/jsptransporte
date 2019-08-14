/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.ModalidadBean;
import com.empresa.model.NinioBean;
import com.empresa.model.NinioModalidadBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class NinioModalidadDao {
    private Conexion conn;
    private NinioModalidadBean ninMBea;
    private NinioBean ninBea;
    private ModalidadBean modBea;
    private List<NinioModalidadBean> ninMLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    private SimpleDateFormat fomat = new SimpleDateFormat("HH:mm:ss");

    public NinioModalidadDao(Conexion conn) {
        this.conn = conn;
    }
    
    public boolean eliminar(int id){
        sql = "DELETE FROM ninio_modalidad WHERE idninio_modalidad=?";
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
    
    public List<NinioModalidadBean> buscarTodo(){
        sql = "SELECT * FROM ninio_modalidad";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            ninMLS = new LinkedList<>();
            
            while (rs.next()) {                
                ninMBea = new NinioModalidadBean(rs.getInt("idninio_modalidad"));
                ninMBea.setHora(rs.getDate("hora"));
                
                ninBea = new NinioBean(rs.getInt("idninio"));
                ninMBea.setIdninio(ninBea);
                modBea = new ModalidadBean(rs.getInt("idmodalidad"));
                ninMBea.setIdmodali(modBea);
                
                ninMLS.add(ninMBea);
            }
            
            return ninMLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo:"+e);
            return null;
        }
    }
    
    public List<NinioModalidadBean> buscarPorId(int id){
        sql = "SELECT * FROM ninio_modalidad WHERE idninio_modalidad=?";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            ninMLS = new LinkedList<>();
            
            while (rs.next()) {                
                ninMBea = new NinioModalidadBean(rs.getInt("idninio_modalidad"));
                ninMBea.setHora(rs.getDate("hora"));
                
                ninBea = new NinioBean(rs.getInt("idninio"));
                ninMBea.setIdninio(ninBea);
                modBea = new ModalidadBean(rs.getInt("idmodalidad"));
                ninMBea.setIdmodali(modBea);
                
                ninMLS.add(ninMBea);
            }
            
            return ninMLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Por Id:"+e);
            return null;
        }
    }
}
