/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.ModalidadBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class ModalidadDao {
    private Conexion conn;
    private ModalidadBean modBea;
    private List<ModalidadBean> modLS;
    
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;
    
    public ModalidadDao(Conexion con){
        this.conn = con;
    }
    
    public boolean eliminar(int id){
        sql = "DELETE FROM modalidad WHERE idmodalidad=?";
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    public List<ModalidadBean> buscarTodo(){
        return null;
    }
}
