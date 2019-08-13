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
import java.util.LinkedList;
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

    public ModalidadDao(Conexion con) {
        this.conn = con;
    }

    public boolean eliminar(int id) {
        sql = "DELETE FROM modalidad WHERE idmodalidad=?";
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

            return true;
        } catch (Exception e) {
            System.out.println("Error en Eliminar: " + e);
            return false;
        }
    }

    public List<ModalidadBean> buscarTodo() {
        sql = "SELECT * FROM modalidad";
        try {
            ps = conn.conexion().prepareStatement(sql);
            rs = ps.executeQuery();

            modLS = new LinkedList<>();

            while (rs.next()) {
                modBea = new ModalidadBean(rs.getInt("idmodalidad"));
                modBea.setDescri(rs.getString("descripcion"));

                modLS.add(modBea);
            }return modLS;

        } catch (Exception e) {
            System.out.println("Error en Buscar Todo: " + e);
            return null;
        }
    }

    public List<ModalidadBean> buscaPorId(int id) {
        sql = "SELECT * FROM modalidad WHERE idmodalidad=?";
        try {
            ps = conn.conexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            modLS = new LinkedList<>();

            while (rs.next()) {
                modBea = new ModalidadBean(rs.getInt("idmodalidad"));
                modBea.setDescri(rs.getString("descripcion"));

                modLS.add(modBea);
            }return modLS;
            
        } catch (Exception e) {
            System.out.println("Error en Buscar Por Id");
            return null;
        }
    }
}
