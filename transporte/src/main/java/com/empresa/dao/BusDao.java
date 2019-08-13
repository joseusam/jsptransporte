/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.BusBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class BusDao {
    private Conexion conn;
    private BusBean busBea;
    private List<BusBean> busLS;
    
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;

    public BusDao(Conexion conn) {
        this.conn = conn;
    }
    
    public boolean eliminar(int id){
        sql = "DELETE FROM bus WHERE idbus=?";        
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
    
    public List<BusBean> buscarTodo(){
        sql = "SELECT * FROM bus";
        try {
            ps =conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            busLS = new LinkedList<>();
            
            while (rs.next()) {                
                busBea = new BusBean(rs.getInt("idbus"));
                busBea.setPlacas(rs.getString("placas"));
                busBea.setAsient(rs.getInt("asientos"));
                
                busLS.add(busBea);
            }return busLS;
            
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo: "+e);
            return null;
        }
    }
    
    public List<BusBean> buscarById(int id){
        sql = "SELECT * FROM bus";
        try {
            ps =conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            busLS = new LinkedList<>();
            
            while (rs.next()) {                
                busBea = new BusBean(rs.getInt("idbus"));
                busBea.setPlacas(rs.getString("placas"));
                busBea.setAsient(rs.getInt("asientos"));
                
                busLS.add(busBea);
            }return busLS;
            
        } catch (Exception e) {
            System.out.println("Error en Buscar Por Id: "+e);
            return null;
        }
    }
}
