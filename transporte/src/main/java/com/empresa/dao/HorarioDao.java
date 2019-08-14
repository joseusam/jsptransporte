/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.BusBean;
import com.empresa.model.EmpleadoBean;
import com.empresa.model.HorarioBean;
import com.empresa.model.RolBean;
import com.empresa.model.RutaBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class HorarioDao {
    private Conexion conn; 
    private HorarioBean horBea;
    private EmpleadoBean empBea;
    private RolBean rolBea;
    private BusBean busBea;
    private RutaBean rutBea;
    private List<HorarioBean> horaLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    private SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");

    public HorarioDao(Conexion conn) {
        this.conn = conn;
    }
    
    public boolean insertar(HorarioBean horBea){
    
    sql = "insert into horario values(?,?,?,?,?,?)";
    
        try {
            
            ps = conn.conexion().prepareStatement(sql);
            
            ps.setInt(1, horBea.getIdhorari());
            ps.setInt(2, empBea.getIdemplea());
            ps.setInt(3, rolBea.getIdrol());
            ps.setString(4, format.format(horBea.getFecha()));
            ps.setInt(5, busBea.getIdbus());
            ps.setInt(6, rutBea.getIdruta());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            
            return false;
        }
    }
    public boolean actualizar(HorarioBean horBea){
    
    
    sql = "update horario set idempleado, idrol, fecha, idbus, idruta where idhorario =?";
    
        try {
            
            ps = conn.conexion().prepareStatement(sql);
            
            ps.setInt(1, empBea.getIdemplea());
            ps.setInt(2, rolBea.getIdrol());
            ps.setString(3, format.format(horBea.getFecha()));
            ps.setInt(4, busBea.getIdbus());
            ps.setInt(5, rutBea.getIdruta());
                ps.setInt(6, horBea.getIdhorari());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            
            return false;
        }
    
    }
}
