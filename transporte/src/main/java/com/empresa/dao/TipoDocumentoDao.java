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
    
}
