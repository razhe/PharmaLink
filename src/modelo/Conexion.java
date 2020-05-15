/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gustavo
 */
public class Conexion {
    Connection con;
    public Connection getConnection(){
        String url = "jdbc:mysql://168.138.149.15:3306/Pharma";
        String user = "pharma_link";
        String pass = "PharmaLink__//1";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            
        } catch (Exception e) {
        }
        return con;
    }
}
