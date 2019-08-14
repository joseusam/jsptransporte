/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.ModalidadBean;
import com.empresa.model.RutaBean;
import com.empresa.model.RutaModalidadBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class RutaModalidadDao {
    private Conexion conn;
    private RutaModalidadBean rutMBea;
    private RutaBean rutBea;
    private ModalidadBean modBean;
    private List<RutaModalidadBean> rutMLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    private SimpleDateFormat fomat = new SimpleDateFormat("HH:mm:ss");

    public RutaModalidadDao(Conexion conn) {
        this.conn = conn;
    }
    
    public boolean eliminar(int id){
        sql = "DELETE FROM WHERE ruta_modalidad=?";
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
    
    public List<RutaModalidadBean> buscarTodo(){
        sql = "SELECT * FROM ruta_modalidad";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            rutMLS = new LinkedList<>();
            
            while (rs.next()) {                
                rutMBea = new RutaModalidadBean(rs.getInt("idruta_modalidad"));
                rutMBea.setHora(rs.getDate("hora"));
                
                rutBea = new RutaBean(rs.getInt("idruta"));
                rutMBea.setIdruta(rutBea);
                modBean = new ModalidadBean(rs.getInt("idmodalidad"));
                rutMBea.setIdmodali(modBean);
                
                rutMLS.add(rutMBea);
            }
            
            return rutMLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo: "+e);
            return null;
        }
    }
    
    public List<RutaModalidadBean> buscarPorId(int id){
        sql = "SELECT * FROM ruta_modalidad WHERE idruta_modalidad=?";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            rutMLS = new LinkedList<>();
            
            while (rs.next()) {                
                rutMBea = new RutaModalidadBean(rs.getInt("idruta_modalidad"));
                rutMBea.setHora(rs.getDate("hora"));
                
                rutBea = new RutaBean(rs.getInt("idruta"));
                rutMBea.setIdruta(rutBea);
                modBean = new ModalidadBean(rs.getInt("idmodalidad"));
                rutMBea.setIdmodali(modBean);
                
                rutMLS.add(rutMBea);
            }
            
            return rutMLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Por Id: "+e);
            return null;
        }
    }        
}
