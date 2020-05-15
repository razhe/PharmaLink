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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import vista.CuidadoPersonal;


/**
 *
 * @author Gustavo
 */


public class ProductoDAO {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    //Agregar datos
    
    public String agregar(Producto p) throws ClassNotFoundException {        
        try {
            
            String sql =("INSERT INTO PRODUCTO(CODPROD,NOMBRE,MARCA,PRECIO,FECHA_FAB,FECHA_VENCI,DOSIS) VALUES (?,?,?,?,?,?,?)");
                con = conectar.getConnection();
                ps = con.prepareStatement(sql);                
                ps.setInt(1, p.getCodigo());
                ps.setString(2, p.getNombre());
                ps.setString(3, p.getMarca());
                ps.setInt(4, p.getValor_peso());                
                ps.setString(5, p.getFecha_fabri());
                ps.setString(6, p.getFecha_venc());
                ps.setString(7, p.getDosis());
                ps.executeUpdate();
                
               if(ps.executeUpdate() == 1){
                   JOptionPane.showMessageDialog(null, "¡Producto insertado correctamente!");
               }
               else{                 
                   JOptionPane.showMessageDialog(null, "El producto no se ha podido añadir...");
                }
        }
        catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getMessage());
        }
        return null;
    }
    //Actualizar datos
    public void actualizar(Producto p) throws ClassNotFoundException {
        String sql =("UPDATE PRODUCTO SET nombre = ?, marca = ?, precio = ?, fecha_fab = ?, fecha_venci= ?, dosis = ? where codigo = ?");
        try {           
            con= conectar.getConnection();
            ps=con.prepareStatement(sql);
            
            ps.setString(1, p.getNombre()); // Nombre
            ps.setString(2, p.getMarca());//precio
            ps.setInt(3, p.getValor_peso());//Dosis
            ps.setString(4, p.getFecha_fabri());
            ps.setString(5, p.getFecha_venc());
            ps.setString(6, p.getDosis());
            ps.executeUpdate();
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null,"¡Actualización exitosa!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Error al actualizar el producto...");
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getMessage());
        }
    }     
    //Eliminar datos
    public void eliminar(Producto p){
        String sql = "DELETE FROM PRODUCTO WHERE CODPROD=?";
        try {
        con = conectar.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, p.getCodigo());
        ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    //Listar
    public List listar(){
        List<Producto>datos = new ArrayList<>();
        String sql = "select * from PRODUCTO";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {                
                Producto p = new Producto();
                p.setCodigo(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setMarca(rs.getString(3));
                p.setValor_peso(rs.getInt(4));
                p.setFecha_fabri(rs.getString(5));
                p.setFecha_venc(rs.getString(6));
                p.setDosis(rs.getString(7));
                
                datos.add(p);
            }
        } catch (Exception e) {
        }
        return datos;
    }
    //Buscar
    public boolean buscar(Producto p){
        
        String sql = "SELECT * FROM PRODUCTO WHERE CODPROD=?";
        try {
        con = conectar.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, p.getCodigo());
        rs = ps.executeQuery();
        
            if (rs.next()) {
                p.setCodigo(Integer.parseInt(rs.getString("CODPROD")));
                p.setNombre(rs.getString("NOMBRE"));
                p.setMarca(rs.getString("MARCA"));
                p.setValor_peso(Integer.parseInt(rs.getString("PRECIO")));
                p.setFecha_fabri(rs.getString("FECHA_FAB"));
                p.setFecha_venc(rs.getString("FECHA_VENCI"));
                p.setDosis(rs.getString("DOSIS"));
                return true;
            }
            return false;           
        } catch (Exception e) {
            return false;
        }
        
    }
}
