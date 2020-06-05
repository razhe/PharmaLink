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

/**
 *
 * @author Gustavo
 */
public class CompraSQL {
    Conexion conectar  = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public void agregar(Compra c){
        try{
           String sql = "INSERT INTO COMPRA (FECHA,VALOR_NETO,VALOR_BRUTO,CODTIPOPAGO,IDUSUARIO) values (?,?,?,?,?)";
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
//            rs = ps.getGeneratedKeys();           
            ps.setString(1, c.getFecha());
            ps.setInt(2, c.getBruto());
            ps.setInt(3, c.getNeto());
            ps.setInt(4, c.getCod_tipo_pago());
            ps.setInt(5, c.getIdusuario());
            ps.executeUpdate();        
//            ps.getGeneratedKeys();           

//            int idGenerada = 0;
//            while (rs.next()) {                                
//                idGenerada = rs.getInt(1);
//            }
            
            if (ps.executeUpdate() == 1) {
                System.out.println("Compra ingresada correctamente");
            }
        }
        catch(SQLException e){
            System.out.println("Error: " + e.getErrorCode()+" "+e.getMessage());
        }
        
    }
    public void buscarIdCompra(Compra c){
        try {
            String sql = "SELECT MAX(NUMCOMP) FROM COMPRA";
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            
            rs = ps.executeQuery(sql);
            while (rs.next()) {                
                c.setId_compra(Integer.parseInt(rs.getString("MAX(NUMCOMP)")));                 
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CompraSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
