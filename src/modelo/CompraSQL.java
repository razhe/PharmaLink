/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.TicketDeCambio;

/**
 *
 * @author Gustavo
 */
public class CompraSQL {
    Conexion conectar  = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public void agregar(Compra c) throws ClassNotFoundException{
        try{
           String sql = "INSERT INTO COMPRA (FECHA,TOTAL,CODTIPOPAGO,IDUSUARIO) values (?,?,?,?)";
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);      
            ps.setString(1, c.getFecha());  
            ps.setInt(2, c.getTotal());
            ps.setInt(3, c.getCod_tipo_pago());
            ps.setInt(4, c.getIdusuario());                           
            if (ps.executeUpdate() == 1) {
                System.out.println("Compra ingresada correctamente");
            }
        }
        catch(SQLException ex){
            System.out.println("Error SQL: " + ex.getErrorCode() +" - "+ex.getMessage());
        }        
    }
    public int buscarIdCompra() throws ClassNotFoundException{
        Compra c = new Compra();
        try {
            
            String sql = "SELECT MAX(NUMCOMP) FROM COMPRA";
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);           
            rs = ps.executeQuery(sql);
            while (rs.next()) {                
                c.setId_compra(Integer.parseInt(rs.getString("MAX(NUMCOMP)")));                 
            }
            TicketDeCambio t = new TicketDeCambio();
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getErrorCode() +" - "+ex.getMessage());
        }
        return c.getId_compra();
    }
}
