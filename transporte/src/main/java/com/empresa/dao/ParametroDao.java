/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.ParametroBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class ParametroDao {
    private Conexion conn;
    private ParametroBean paramBean;
    private List<ParametroBean> paramLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public ParametroDao(Conexion conn) {
        this.conn = conn;
    }
     
    public boolean eliminar(int id){
        sql = "DELETE FROM parametro WHERE idparametro=?";
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
    
    public List<ParametroBean> buscarTodo(){
        sql = "SELECT * FROM parametro";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            paramLS = new LinkedList<>();
            
            while (rs.next()) {                
                paramBean = new ParametroBean(rs.getInt("idparametro"));
                paramBean.setDescri(rs.getString("descripcion"));
                paramBean.setValor(rs.getDouble("valor"));
                
                paramLS.add(paramBean);
            }
            
            return paramLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo: "+e);
            return null;
        }
    }
    
    public List<ParametroBean> buscarPorID(){
        sql = "SELECT * FROM parametro WHERE idparametro=?";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            paramLS = new LinkedList<>();
            
            while (rs.next()) {                
                paramBean = new ParametroBean(rs.getInt("idparametro"));
                paramBean.setDescri(rs.getString("descripcion"));
                paramBean.setValor(rs.getDouble("valor"));
                
                paramLS.add(paramBean);
            }
            
            return paramLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Por Id: "+e);
            return null;
        }
    }
}
