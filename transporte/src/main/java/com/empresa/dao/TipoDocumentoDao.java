/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.TipoDocumentoBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class TipoDocumentoDao {
    private Conexion conn;
    private TipoDocumentoBean tipDBea;
    private List<TipoDocumentoBean> tipDLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public TipoDocumentoDao(Conexion conn) {
        this.conn = conn;
    }
    
    public boolean eliminar(int id){
        sql = "DELETE FROM tipo_documento WHERE idtipo_documento=?";
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
    
    public List<TipoDocumentoBean> buscarTodo(){
        sql = "SELECT * FROM tipo_documento";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            tipDLS = new LinkedList<>();
            
            while (rs.next()) {                
                tipDBea = new TipoDocumentoBean(rs.getInt("idtipo_documento"));
                tipDBea.setDescri(rs.getString("descripcion"));
                
                tipDLS.add(tipDBea);
            }
            
            return tipDLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo: "+e);
            return null;
        }
    }
    
    public List<TipoDocumentoBean> buscarPorId(int id){
        sql = "SELECT * FROM tipo_documento WHERE idtipo_documento=?";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            tipDLS = new LinkedList<>();
            
            while (rs.next()) {                
                tipDBea = new TipoDocumentoBean(rs.getInt("idtipo_documento"));
                tipDBea.setDescri(rs.getString("descripcion"));
                
                tipDLS.add(tipDBea);
            }
            
            return tipDLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Por Id: "+e);
            return null;
        }
    }
}
