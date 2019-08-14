/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.dao;

import com.empresa.conexion.Conexion;
import com.empresa.model.ModalidadBean;
import com.empresa.model.NinioBean;
import com.empresa.model.NinioModalidadBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author moises.alvarengausam
 */
public class NinioModalidadDao {
    private Conexion conn;
    private NinioModalidadBean ninMBea;
    private NinioBean ninBea;
    private ModalidadBean modBea;
    private List<NinioModalidadBean> ninMLS;
    
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    private SimpleDateFormat fomat = new SimpleDateFormat("HH:mm:ss");

    public NinioModalidadDao(Conexion conn) {
        this.conn = conn;
    }
    
}
