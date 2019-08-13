/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.ApoderadoBean;
import com.empresa.model.PersonaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class ApoderadoDao {
    private Conexion conn;
    private ApoderadoBean apoBea;
    private PersonaBean perBea;
    private List<ApoderadoBean> apoLS;
    
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;

    public ApoderadoDao(Conexion conn) {
        this.conn = conn;
    }
    
    public boolean eliminar(int id){
        sql = "DELETE FROM apoderado WHERE idapoderado";
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
    
    public List<ApoderadoBean> buscarTodo(){
        sql = "SELECT * FROM apoderado";
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            apoLS = new LinkedList<>();
            
            while (rs.next()) {                
                apoBea = new ApoderadoBean(rs.getInt("idapoderado"));
                perBea = new PersonaBean(rs.getInt("idpersona"));
                apoBea.setIdperson(perBea);
                
                apoLS.add(apoBea);
            }return apoLS;
            
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo: "+e);
            return null;
        }
    }
    
    public List<ApoderadoBean> buscarById(int id){
        sql = "SELECT * FROM apoderado WHERE idapoderado=?";
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            apoLS = new LinkedList<>();
            
            while (rs.next()) {                
                apoBea = new ApoderadoBean(rs.getInt("idapoderado"));
                perBea = new PersonaBean(rs.getInt("idpersona"));
                apoBea.setIdperson(perBea);
                
                apoLS.add(apoBea);
            }return apoLS;
            
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo: "+e);
            return null;
        }
    }
}
