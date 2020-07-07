/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import vista.Admin;
import vista.CuidadoPersonal;

/**
 *
 * @author Gustavo
 */
public class ProductoSQL {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    //Agregar datos    
    //Agregar datos    
    //EXPERIMENTAL

    public void agregar(Producto p) throws ClassNotFoundException, FileNotFoundException {
        try {
            String sql = ("INSERT INTO PRODUCTO(CODPROD,NOMBRE,MARCA,PRECIO,FECHA_FAB,FECHA_VENCI,DOSIS,IMAGEN,DESCRIPCION,CODTIPOPRODUCTO,CODOFERTA) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            FileInputStream fi = null;
            PreparedStatement ps = null;
            File file = new File(p.getRuta());
            fi = new FileInputStream(file);
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getCodigo());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getMarca());
            ps.setInt(4, p.getValor_peso());
            ps.setString(5, p.getFecha_fabri());
            ps.setString(6, p.getFecha_venc());
            ps.setString(7, p.getDosis());
            ps.setBinaryStream(8, fi);
            ps.setString(9, p.getDescripcion_prod());
            ps.setString(10, p.getCodigocategoria());
            ps.setInt(11, p.getCodigo_oferta());
            ps.executeUpdate();

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "¡Producto insertado correctamente!");
            } else {
                JOptionPane.showMessageDialog(null, "El producto no se ha podido añadir...");
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getErrorCode() + " - " + ex.getMessage());
        }
    }

    //Actualizar datos

    public int actualizar(Producto p) throws ClassNotFoundException, FileNotFoundException {
        String sql = ("UPDATE PRODUCTO SET nombre = ?, marca = ?, precio = ?, fecha_fab = ?, fecha_venci= ?, DOSIS = ?,IMAGEN = ?,DESCRIPCION = ?, CODTIPOPRODUCTO = ?,CODOFERTA = ? where CODPROD = ?");
        try {
            FileInputStream fi = null;
            PreparedStatement ps = null;
            File file = new File(p.getRuta());
            fi = new FileInputStream(file);
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getMarca());
            ps.setInt(3, p.getValor_peso());
            ps.setString(4, p.getFecha_fabri());
            ps.setString(5, p.getFecha_venc());
            ps.setString(6, p.getDosis());
            ps.setBinaryStream(7, fi);
            ps.setString(8, p.getDescripcion_prod());
            ps.setString(9, p.getCodigocategoria());
            ps.setInt(10, p.getCodigo_oferta());
            ps.setInt(11, p.getCodigo());
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "¡Actualización exitosa!");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar el producto...");
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getErrorCode() + " - " + ex.getMessage());
        }
        return 1;
    }

    //Eliminar datos

    public void eliminar(Producto p) throws ClassNotFoundException {
        String sql = "DELETE FROM PRODUCTO WHERE CODPROD=?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getCodigo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getErrorCode() + " - " + ex.getMessage());
        }

    }

    //Listar cuidado personal
    //EXPERIMENTAL

    public ResultSet visualizar_cuid() throws ClassNotFoundException, SQLException {
        con = conectar.getConnection();
        ResultSet rs = null;
        try {
            ps = con.prepareStatement("select * from PRODUCTO where CODTIPOPRODUCTO = 5");
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error de consulta");
        }
        return rs;
    }

    public ResultSet visualizar_prev() throws ClassNotFoundException, SQLException {
        con = conectar.getConnection();
        ResultSet rs = null;
        try {
            ps = con.prepareStatement("select * from PRODUCTO where CODTIPOPRODUCTO = 1");
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error de consulta");
        }
        return rs;
    }

    public ResultSet visualizar_med() throws ClassNotFoundException, SQLException {
        con = conectar.getConnection();
        ResultSet rs = null;
        try {
            ps = con.prepareStatement("select * from PRODUCTO where CODTIPOPRODUCTO = 2");
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error de consulta");
        }
        return rs;
    }

    public ResultSet visualizar_dermo() throws ClassNotFoundException, SQLException {
        con = conectar.getConnection();
        ResultSet rs = null;
        try {
            ps = con.prepareStatement("select * from PRODUCTO where CODTIPOPRODUCTO = 3");
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error de consulta");
        }
        return rs;
    }

    public ResultSet visualizar_inf_mat() throws ClassNotFoundException, SQLException {
        con = conectar.getConnection();
        ResultSet rs = null;
        try {
            ps = con.prepareStatement("select * from PRODUCTO where CODTIPOPRODUCTO = 4");
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error de consulta");
        }
        return rs;
    }

    public ResultSet visualizar_sex() throws ClassNotFoundException, SQLException {
        con = conectar.getConnection();
        ResultSet rs = null;
        try {
            ps = con.prepareStatement("select * from PRODUCTO where CODTIPOPRODUCTO = 6");
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error de consulta");
        }
        return rs;
    }

    public ResultSet visualizar_bell() throws ClassNotFoundException, SQLException {
        con = conectar.getConnection();
        ResultSet rs = null;
        try {
            ps = con.prepareStatement("select * from PRODUCTO where CODTIPOPRODUCTO = 7");
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error de consulta");
        }
        return rs;
    }

    public ResultSet visualizar_nut() throws ClassNotFoundException, SQLException {
        con = conectar.getConnection();
        ResultSet rs = null;
        try {
            ps = con.prepareStatement("select * from PRODUCTO where CODTIPOPRODUCTO = 8");
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error de consulta");
        }
        return rs;
    }

    public ResultSet visualizar_adul() throws ClassNotFoundException, SQLException {
        con = conectar.getConnection();
        ResultSet rs = null;
        try {
            ps = con.prepareStatement("select * from PRODUCTO where CODTIPOPRODUCTO = 9");
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error de consulta");
        }
        return rs;
    }

    //Buscar

    public boolean buscar(Producto p) throws Exception {

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
            }
            return false;
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getErrorCode() + " - " + ex.getMessage());
            return false;
        }
    }

    public ImageIcon buscarImagen(int codigo) throws ClassNotFoundException, SQLException {
        con = conectar.getConnection();
        Producto p = new Producto();
        Image img = null;
        ImageIcon ic = null;
        try {
            ps = con.prepareStatement("SELECT IMAGEN FROM PRODUCTO where CODPROD = ?");
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            
            
            while (rs.next()) {
                Blob blob = rs.getBlob("IMAGEN");
                byte[] recuperado = blob.getBytes(1, (int) blob.length());
                BufferedImage imagen = ImageIO.read(new ByteArrayInputStream(recuperado));
                
                img = imagen.getScaledInstance(200, 260, Image.SCALE_SMOOTH);
                ic  = new ImageIcon(img);                
            }
        } catch (Exception e) {
            System.out.println("Error de consulta (Buscar imagen)");            
        }
        return ic;
    }

    public boolean buscarDescripcion(Producto p) throws Exception {
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
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getErrorCode() + " - " + ex.getMessage());
            return false;
        }
    }

    public int buscarCodOferta() {
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
