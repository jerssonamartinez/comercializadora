/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercializadora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * 
 */
public class Conexion {

    private Connection conn;
    
    public Conexion(){
      //initComponents();
    
}
    
    
    public void realizarConexion() {
        String urlDatabase = "jdbc:postgresql://localhost:5432/TallerBD";
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(urlDatabase, "postgres", "1234");
        } catch (Exception e) {
            System.out.println("Ocurrio un error : " + e.getMessage());
        }
        if (conn != null) {
            System.out.println("La conexión se realizo sin problemas! ");
        }
    }
    
    public Connection getConn(){
        return conn;
    }
    
    public void desconectar() {
        try {
            conn.close();
            conn = null;
        } catch (SQLException ex) {
            System.out.println("problema al desconectar la BD");
        }
        System.out.println("conn cerrada");
    }
    
}
