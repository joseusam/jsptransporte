/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author moises.alvarengausam
 */
public class Conexion {
    static String db = "transporte";
    static String user = "root";
    static String pass = "root";
    static String url = "jdbc:mysql://localhost:3306/"+db+"?useSSL=false";
    
    Connection conn = null;
    
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            
            if (conn!=null) {
                System.out.println("Conectado");
            }
        } catch (Exception e) {
            System.out.println("Error al conectar: "+e);
        }
    }
    
    public Connection conexion(){
        return conn;
    }
    
    public void desconectar() throws SQLException{
        conn.close();
    }
    
    public static void main(String[] args) {
        Conexion con = new Conexion();
    }
}
