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
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class ReporteSQL {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void enviarReporte(Reporte r) {
        String sql = "INSERT INTO REPORTES (DESCRIPCION,IDUSUARIO) VALUES (?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, r.getDescripcion());
            ps.setInt(2, r.getId_usuario());
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Gracias por enviarnos su reporte");
            }
            else{
                System.out.println("Error al enviar reporte de errores");
            }
        } catch (SQLException e) {
            System.out.println("Error al enviar reporte: " + e.getErrorCode() + " " + e.getMessage());
        }
    }
}
