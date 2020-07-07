/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gustavo
 */
public class Conexion {
    Connection con;
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection con = null;
        String url = "jdbc:mysql://168.138.149.15:3306/Pharma";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, "pharma_link", "PharmaLink__//1");
            System.out.println("En linea");
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos");
        }
        return con;
    }
}
