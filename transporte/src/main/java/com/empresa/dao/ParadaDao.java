/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.DireccionBean;
import com.empresa.model.ParadaBean;
import com.empresa.model.RutaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class ParadaDao {
    private Conexion conn;
    private ParadaBean parBea;
    private RutaBean rutBea;
    private DireccionBean dirBea;
    private List<ParadaBean> paraLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public ParadaDao(Conexion conn) {
        this.conn = conn;
    }
    
    public boolean eliminar(int id){
        sql = "DELETE FROM parada WHERE idparada=?";
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
    
    public List<ParadaBean> buscarTodo(){
        sql = "SELECT * FROM parada";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            paraLS = new LinkedList<>();
            
            while (rs.next()) {                
                parBea = new ParadaBean(rs.getInt("idparada"));
                
                rutBea = new RutaBean(rs.getInt("idruta"));
                parBea.setIdruta(rutBea);
                dirBea = new DireccionBean(rs.getInt("iddireccion"));
                parBea.setIddirecc(dirBea);
                parBea.setOrden(rs.getInt("orden"));
                
                paraLS.add(parBea);
            }
            
            return paraLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo:"+e);
            return null;
        }
    }
    
    public List<ParadaBean> buscarPorId(int id){
        sql = "SELECT * FROM parada WHERE idparada=?";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            paraLS = new LinkedList<>();
            
            while (rs.next()) {                
                parBea = new ParadaBean(rs.getInt("idparada"));
                
                rutBea = new RutaBean(rs.getInt("idruta"));
                parBea.setIdruta(rutBea);
                dirBea = new DireccionBean(rs.getInt("iddireccion"));
                parBea.setIddirecc(dirBea);
                parBea.setOrden(rs.getInt("orden"));
                
                paraLS.add(parBea);
            }
            
            return paraLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Por Id:"+e);
            return null;
        }
    }
    
}
