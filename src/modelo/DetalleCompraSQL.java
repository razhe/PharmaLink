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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author Gustavo
 */
public class DetalleCompraSQL {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public void agregarDetalleCompra(DetalleCompra d) throws SQLException, ClassNotFoundException{
        String sql = "INSERT INTO DETALLE_COMPRA (VALOR_NETO,VALOR_BRUTO,CANTIDAD,CODPROD,NUMCOMPRA) VALUES (?,?,?,?,?)";
        con = conectar.getConnection();
        ps = con.prepareStatement(sql);               
        ps.setDouble(1, d.getPrecio_neto());        
        ps.setInt(2, d.getPrecio_bruto());
        ps.setInt(3, d.getCantidad());
        ps.setInt(4, d.getCod_producto());
        ps.setInt(5, d.getCod_compra());
        if (ps.executeUpdate() == 1) {
            System.out.println("Detalle compra ingresado correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error al ingresar el detalle de compra");
        }        
    }   
}
