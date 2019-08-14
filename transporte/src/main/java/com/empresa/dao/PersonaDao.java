;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.DireccionBean;
import com.empresa.model.PersonaBean;
import com.empresa.model.TipoDocumentoBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class PersonaDao {
    private Conexion conn;
    private PersonaBean perBea;
    private DireccionBean dirBea;
    private TipoDocumentoBean tipDBea;
    private List<PersonaBean> persLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public PersonaDao(Conexion conn) {
        this.conn = conn;
    }
    
    public boolean eliminar(int id){
        sql = "DELETE FROM persona WHERE idpersona=?";
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
    
    public List<PersonaBean> buscarTodo(){
        sql = "SELECT * FROM persona";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();
            
            persLS = new LinkedList<>();
            
            while (rs.next()) {                
                perBea = new PersonaBean(rs.getInt("idpersona"));
                perBea.setNombre(rs.getString("nombre"));
                perBea.setApelli(rs.getString("apellido"));
                perBea.setTelefo(rs.getString("telefono"));
                perBea.setDocume(rs.getString("documento"));
                
                dirBea = new DireccionBean(rs.getInt(rs.getInt("iddireccion")));
                perBea.setIddirecc(dirBea);
                tipDBea.setIdtipDoc(rs.getInt("idtipo_documento"));
                perBea.setIdtipDoc(tipDBea);
                
                persLS.add(perBea);
            }
            
            return persLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Todo: "+e);
            return null;
        }
    }
    
    public List<PersonaBean> buscarPorId(int id){
        sql = "SELECT * FROM persona WHERE idpersona=?";
        
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            persLS = new LinkedList<>();
            
            while (rs.next()) {                
                perBea = new PersonaBean(rs.getInt("idpersona"));
                perBea.setNombre(rs.getString("nombre"));
                perBea.setApelli(rs.getString("apellido"));
                perBea.setTelefo(rs.getString("telefono"));
                perBea.setDocume(rs.getString("documento"));
                
                dirBea = new DireccionBean(rs.getInt(rs.getInt("iddireccion")));
                perBea.setIddirecc(dirBea);
                tipDBea.setIdtipDoc(rs.getInt("idtipo_documento"));
                perBea.setIdtipDoc(tipDBea);
                
                persLS.add(perBea);
            }
            
            return persLS;
        } catch (Exception e) {
            System.out.println("Error en Buscar Por Id: "+e);
            return null;
        }
    }
}
