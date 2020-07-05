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
    public void agregar(Producto p) throws ClassNotFoundException {        
        try {       
            String sql =("INSERT INTO PRODUCTO(CODPROD,NOMBRE,MARCA,PRECIO,FECHA_FAB,FECHA_VENCI,DOSIS,DESCRIPCION,CODTIPOPRODUCTO,CODOFERTA) VALUES (?,?,?,?,?,?,?,?,?,?)");
                con = conectar.getConnection();
                ps = con.prepareStatement(sql);                
                ps.setInt(1, p.getCodigo());
                ps.setString(2, p.getNombre());
                ps.setString(3, p.getMarca());
                ps.setInt(4, p.getValor_peso());                
                ps.setString(5, p.getFecha_fabri());
                ps.setString(6, p.getFecha_venc());
                ps.setString(7, p.getDosis());
                ps.setString(8, p.getDescripcion_prod());
                ps.setString(9, p.getCodigocategoria());
                ps.setInt(10, p.getCodigo_oferta());          
               if(ps.executeUpdate() == 1){
                   JOptionPane.showMessageDialog(null, "¡Producto insertado correctamente!");
               }
               else{                 
                   JOptionPane.showMessageDialog(null, "El producto no se ha podido añadir...");
                }
        }
        catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getErrorCode() +" - "+ex.getMessage());
        }       
    }
    //Actualizar datos
    public int actualizar(Producto p) throws ClassNotFoundException {
        String sql =("UPDATE PRODUCTO SET nombre = ?, marca = ?, precio = ?, fecha_fab = ?, fecha_venci= ?, DOSIS = ?,DESCRIPCION = ?, CODTIPOPRODUCTO = ?,CODOFERTA = ? where CODPROD = ?");
        try {           
            con= conectar.getConnection();
            ps=con.prepareStatement(sql);  
            
            ps.setString(1, p.getNombre()); // Nombre
            ps.setString(2, p.getMarca());//precio
            ps.setInt(3, p.getValor_peso());//Dosis
            ps.setString(4, p.getFecha_fabri());
            ps.setString(5, p.getFecha_venc());
            ps.setString(6, p.getDosis());
            ps.setString(7, p.getDescripcion_prod());
            ps.setString(8, p.getCodigocategoria());           
            ps.setInt(9, p.getCodigo_oferta());
            ps.setInt(10, p.getCodigo());
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null,"¡Actualización exitosa!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Error al actualizar el producto...");
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getErrorCode() +" - "+ex.getMessage());
        }
        return 1;
    }     
    //Eliminar datos
    public void eliminar(Producto p){
        String sql = "DELETE FROM PRODUCTO WHERE CODPROD=?";
        try {
        con = conectar.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, p.getCodigo());
        ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getErrorCode() +" - "+ex.getMessage());
        }
        
    }
    //Listar cuidado personal
    public List listarCuidadoPersonal(){
        List<Producto>datos = new ArrayList<>();
        String sql = "select * from PRODUCTO where CODTIPOPRODUCTO = 5";
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
            System.out.println("Error al listar Cuidado personal: " + e.getMessage());
        }
        return datos;
    }
    //Listar prevencion.
            public List listarPrevencion(){
        List<Producto>datos = new ArrayList<>();
        String sql = "select * from PRODUCTO where CODTIPOPRODUCTO = 1";
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
            System.out.println("Error al listar Prevención: " + e.getMessage());
        }
        return datos;
    }
    //Listar Medicamentos 
        public List listarMedicamentos(){
        List<Producto>datos = new ArrayList<>();
        String sql = "select * from PRODUCTO where CODTIPOPRODUCTO = 2";
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
            System.out.println("Error al listar medicamentos: " + e.getMessage());
        }
        return datos;
    }
    //Listar dermocosmetica 
        public List listarDermocosmetica(){
        List<Producto>datos = new ArrayList<>();
        String sql = "select * from PRODUCTO where CODTIPOPRODUCTO = 3";
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
            System.out.println("Error al listar Dermocosmentica: " + e.getMessage());
        }
        return datos;
    }
    //Listar infantil y maternidad 
        public List listarInfyMat(){
        List<Producto>datos = new ArrayList<>();
        String sql = "select * from PRODUCTO where CODTIPOPRODUCTO = 4";
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
            System.out.println("Error al listar Infantil y maternidad: " + e.getMessage());
        }
        return datos;
    }
    //Listar sexualidad 
        public List listarSexualidad(){
        List<Producto>datos = new ArrayList<>();
        String sql = "select * from PRODUCTO where CODTIPOPRODUCTO = 6";
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
            System.out.println("Error al listar Sexualidad: " + e.getMessage());
        }
        return datos;
    }
    //Listar belleza 
        public List listarBelleza(){
        List<Producto>datos = new ArrayList<>();
        String sql = "select * from PRODUCTO where CODTIPOPRODUCTO = 7";
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
            System.out.println("Error al listar Belleza: " + e.getMessage());
        }
        return datos;
    }
    //Listar nutricion y vitaminas 
        public List listarnutri(){
        List<Producto>datos = new ArrayList<>();
        String sql = "select * from PRODUCTO where CODTIPOPRODUCTO = 8";
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
            System.out.println("Error al listar Nutrición: " + e.getMessage());
        }
        return datos;
    }
    //Listar Adulto mayor
        public List listarAdultoMayor(){
        List<Producto>datos = new ArrayList<>();
        String sql = "select * from PRODUCTO where CODTIPOPRODUCTO = 9";
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
            System.out.println("Error al listar adulto mayor: " + e.getMessage());
        }
        return datos;
    }
    //Buscar
    public boolean buscar(Producto p) throws Exception{
        
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
                p.setDescripcion_prod(rs.getString("DESCRIPCION"));
                p.setCodigocategoria(rs.getString("CODTIPOPRODUCTO"));
                p.setCodigo_oferta(rs.getInt("CODOFERTA"));
                
                return true;
            }
            return false;           
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getErrorCode() +" - "+ex.getMessage());
            return false;
        }
        
        
    }
    public boolean buscarDescripcion(Producto p) throws Exception{
        String sql = "SELECT DESCRIPCION FROM PRODUCTO WHERE CODPROD = ?";      
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getCodigo());
            rs = ps.executeQuery();
            if (rs.next()) {
                p.setDescripcion_prod(rs.getString("DESCRIPCION"));
                return true;
            }
            return false;
        }       
        catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getErrorCode() +" - "+ex.getMessage());
            return false;
        }
    }
    
    public int buscarCodOferta(){
        String sql = "SELECT MAX(CODOFERTA) FROM OFERTA";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);           
            rs = ps.executeQuery();
            if (rs.next()) {
                int numero = rs.getInt("MAX(CODOFERTA)");
                return numero;
            }
            return 0;
        } catch (Exception e) {
            System.out.println("Error SQL al intentar buscar el codigo de oferta: " + e.getMessage());
            return 0;
        }
    }
    
    
}
