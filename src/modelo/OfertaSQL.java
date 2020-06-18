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
import static java.util.Collections.list;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class OfertaSQL {
    Conexion  conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public void agregarOferta(Oferta o){
        try {
            String sql = "INSERT INTO OFERTA (CODOFERTA,PORC_DESC,INICIO,FIN,NUM_PROD) VALUES (?,?,?,?,?) ";
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, o.getId());            
            ps.setDouble(2, o.getDescuento());
            ps.setString(3, o.getFecha_inicio());
            ps.setString(4, o.getFecha_fin());
            ps.setInt(5, o.getNum_producto());          
            ps.executeUpdate();           
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Oferta agregada correctamente");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al intentar agregar la oferta...");
            }
            
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getErrorCode() +" - "+ex.getMessage());
        }
        
    }
    
    public void eliminar(Oferta o){
        try {
            
            String sql = "DELETE FROM OFERTA WHERE CODOFERTA = ?";
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);            
            ps.setInt(1, o.getId());
            ps.executeUpdate();
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Oferta eliminada correctamente");
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getErrorCode() +" - "+ex.getMessage());
        }
    }
    
    public void actualizarOferta(Oferta o){
        try {
            String sql = "UPDATE OFERTA SET PORC_DESC = ?, INICIO = ?, FIN = ?, NUM_PROD = ? WHERE CODOFERTA = ? ";
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);                                 
            ps.setDouble(1, o.getDescuento());
            ps.setString(2, o.getFecha_inicio());
            ps.setString(3, o.getFecha_fin());
            ps.setInt(4, o.getNum_producto());            
            ps.setInt(5, o.getId());
            
            ps.executeUpdate();
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Oferta modificada de manera exitosa");
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getErrorCode() +" - "+ex.getMessage());
        }
    }
    
    
    public List listarOfertas(){
        List<Producto>datos = new ArrayList<>();
        String sql = "SELECT NOMBRE,MARCA,PRECIO,DOSIS FROM PRODUCTO WHERE CODOFERTA <> 'null'";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {                               
                Producto p = new Producto();
                p.setNombre(rs.getString(1));
                p.setMarca(rs.getString(2));
                p.setValor_peso(rs.getInt(3));
                p.setDosis(rs.getString(4));                
                datos.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error SQL listar ofertas: " + e.getMessage());
        }
        return datos;
    }
    public boolean buscarOferta(Oferta o){       
        try {
            String sql = "select * from OFERTA where CODOFERTA = ?";
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, o.getId());
            rs = ps.executeQuery();            
            if (rs.next()) {
                o.setDescuento(Double.parseDouble(rs.getString("PORC_DESC")));
                o.setFecha_inicio(rs.getString("INICIO"));
                o.setFecha_fin(rs.getString("FIN"));
                o.setNum_producto(Integer.parseInt(rs.getString("NUM_PROD")));               
                return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println("Error SQL Buscar ofertas: " + e.getMessage());
            return false;
        }
    }
}
