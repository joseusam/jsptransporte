/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.HorarioBean;
import com.empresa.model.RegistroBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class RegistroDao {
    private Conexion conn; 
    private RegistroBean regBea;
    private HorarioBean horB;
    private List<RegistroBean> regiLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    private SimpleDateFormat fomat = new SimpleDateFormat("HH:mm:ss");

    public RegistroDao(Conexion conn) {
        this.conn = conn;
    }
    
    public boolean eliminar(int id){
        sql = "DELETE FROM registro WHERE idregistro=?";
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
    
    public List<RegistroBean> buscarTodo(){
        sql = "SELECT * FROM registro";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            regiLS = new LinkedList<>();
            
            while (rs.next()) {                
                regBea = new RegistroBean(rs.getInt("idregistro"));
               
                horB = new HorarioBean(rs.getInt("idhorario"));
                regBea.setIdhorari(horB);
                regBea.setHorLle(rs.getDate("hora_llegada_d"));
                regBea.setHorRet(rs.getDate("hora_retorno"));
                regBea.setComent(rs.getString("comentarios"));
                regBea.setKilomP(rs.getDouble("kilometraje_p"));
                regBea.setKilomR(rs.getDouble("kilometraje_r"));
                
                regiLS.add(regBea);
            }
            
            return regiLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo: "+e);
            return null;
        }
    }
    
    public List<RegistroBean> buscarPorId(int id){
        sql = "SELECT * FROM registro WHERE registro=?";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            regiLS = new LinkedList<>();
            
            while (rs.next()) {                
                regBea = new RegistroBean(rs.getInt("idregistro"));
               
                horB = new HorarioBean(rs.getInt("idhorario"));
                regBea.setIdhorari(horB);
                regBea.setHorLle(rs.getDate("hora_llegada_d"));
                regBea.setHorRet(rs.getDate("hora_retorno"));
                regBea.setComent(rs.getString("comentarios"));
                regBea.setKilomP(rs.getDouble("kilometraje_p"));
                regBea.setKilomR(rs.getDouble("kilometraje_r"));
                
                regiLS.add(regBea);
            }
            
            return regiLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Por Id: "+e);
            return null;
        }
    }
   
}
