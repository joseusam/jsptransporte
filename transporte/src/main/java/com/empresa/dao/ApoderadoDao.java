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
import java.util.List;

/**
 *
 * @author jose.lariosusam
 */
public class ApoderadoDao {
    
    private Conexion conn;
    private ApoderadoBean apoBea;
    private PersonaBean persBea;
    private List<ApoderadoBean> apbLS;
    
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;
    
    
    
}
