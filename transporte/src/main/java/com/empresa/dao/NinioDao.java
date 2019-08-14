/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.ApoderadoBean;
import com.empresa.model.NinioBean;
import com.empresa.model.PersonaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class NinioDao {
    private Conexion conn;
    private NinioBean ninBea;
    private PersonaBean perBea;
    private List<NinioBean> niniLS;
    private ApoderadoBean apoBea;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    private SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    public NinioDao(Conexion conn) {
        this.conn = conn;
    }
    public boolean insertar(NinioBean ninBea){
    
    sql = "insert into ninio values(?,?,?,?,?)";
    
        try {
            
            ps = conn.conexion().prepareStatement(sql);
            
            ps.setInt(1, ninBea.getIdnino());
            ps.setInt(2, perBea.getIdperson());
            ps.setInt(3, apoBea.getIdapoder());
            ps.setString(4, format.format(ninBea.getHoraP()));
            ps.setString(5, format.format(ninBea.getHoraLl()));
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            
            return false;
        }
    }
    public boolean actualizar(NinioBean ninBea){
    
         sql = "update ninio set idpersona, idapoderado, hora_p, hora_ll where idninio =?";
    
        try {
            
            ps = conn.conexion().prepareStatement(sql);
            
            
            ps.setInt(1, perBea.getIdperson());
            ps.setInt(2, apoBea.getIdapoder());
            ps.setString(3, format.format(ninBea.getHoraP()));
            ps.setString(4, format.format(ninBea.getHoraLl()));
            ps.setInt(5, ninBea.getIdnino());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            
            return false;
        }
    }
    
    public boolean eliminar(int id){
        sql = "DELETE ninio FROM WHERE idninio=?";
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
    
    public List<NinioBean> buscarTodo(){
        sql = "SELECT * FROM ninio";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            niniLS = new LinkedList<>();
            
            while (rs.next()) {                
                ninBea = new NinioBean(rs.getInt("idninio"));
                
                perBea = new PersonaBean(rs.getInt("idpersona"));
                ninBea.setIdperson(perBea);
                apoBea = new ApoderadoBean(rs.getInt("idapoderado"));
                ninBea.setIdapoder(apoBea);
                ninBea.setHoraP(rs.getDate("hora_p"));
                ninBea.setHoraLl(rs.getDate("hora_ll"));
                
                niniLS.add(ninBea);
            }
            
            return niniLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo:"+e);
            return null;
        }
    }
    
    public List<NinioBean> buscarPorId(int id){
        sql = "SELECT * FROM ninio WHERE idninio=?";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            niniLS = new LinkedList<>();
            
            while (rs.next()) {                
                ninBea = new NinioBean(rs.getInt("idninio"));
                
                perBea = new PersonaBean(rs.getInt("idpersona"));
                ninBea.setIdperson(perBea);
                apoBea = new ApoderadoBean(rs.getInt("idapoderado"));
                ninBea.setIdapoder(apoBea);
                ninBea.setHoraP(rs.getDate("hora_p"));
                ninBea.setHoraLl(rs.getDate("hora_ll"));
                
                niniLS.add(ninBea);
            }
            
            return niniLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo:"+e);
            return null;
        }
    }
}
