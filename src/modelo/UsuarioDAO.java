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
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class UsuarioDAO {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public Usuario login(String usr) throws ClassNotFoundException{
        String sql = ("Select IDUSUARIO,RUNUSUARIO,IDTIPOUSUARIO from USUARIO where RUNUSUARIO = ? ");
        Usuario usuario = null;
        try{
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, usr);//Run
            rs = ps.executeQuery();
            if(rs.first()){
                usuario = new Usuario();
                usuario.setId(rs.getInt("IDUSUARIO"));
                usuario.setRun(rs.getString("RUNUSUARIO"));
                usuario.setId_tipo(rs.getInt("IDTIPOUSUARIO"));
            }
                                                               
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
        return usuario;
    }    
    
}
