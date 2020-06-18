/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.UsuarioDAO;
import vista.Admin;
import vista.AdultoMayor;
import vista.Belleza;
import vista.CuidadoPersonal;
import vista.Dermocosmetica;
import vista.Infantil;
import vista.IniciarSesion;
import vista.Medicamentos;
import vista.Menú;
import vista.Nutricion;
import vista.Ofertas;
import vista.Prevencion;
import vista.Sexualidad;

/**
 *
 * @author Eduardo
 */

// Instanciando clases.
public class ControladorUsuario implements ActionListener {
    Usuario usr = null;
    UsuarioDAO daoU = new UsuarioDAO();
    IniciarSesion login = new IniciarSesion();
   

    public ControladorUsuario(IniciarSesion lg) {
        //Iniciar Sesion
        this.login = lg;
        this.login.BTLogin.addActionListener(this);
    }
    
    //Ejecucion de los metodos
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == login.BTLogin) {     
           try {
               login();
           } catch (Exception ex) {
               Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
           }
            
       }
    }       
    public void limpiar(){
        login.jPContraseña.setText(null);
    }
    
    public void login() throws SQLException{ 
        try {
            Usuario user = daoU.login(String.valueOf(login.jPContraseña.getPassword()));
            if(user == null){
                JOptionPane.showMessageDialog(null,"Error al iniciar sesion");
                System.out.println("Error");
                limpiar();
            }
            else{
                if(user.getId_tipo() == 1){
                    JOptionPane.showMessageDialog(null,"Login exitoso");
                    System.out.println("Login exitoso");
                    
                    CuidadoPersonal cp = new CuidadoPersonal();
                    Admin ad = new Admin();
                    AdultoMayor adul = new AdultoMayor();
                    Belleza be = new Belleza();
                    Dermocosmetica der = new Dermocosmetica();
                    Infantil inf = new Infantil();
                    Medicamentos med = new Medicamentos();
                    Nutricion nut = new Nutricion();
                    Prevencion prev = new Prevencion();
                    Sexualidad sex = new Sexualidad();
                    ControladorProducto c = new ControladorProducto(cp, ad, adul, be, der, inf, med, nut, prev, sex);
                    //
                    Ofertas of = new Ofertas();
                    ControladorOferta co = new ControladorOferta(ad, of);
                    //
                    ad.setVisible(true);
                    ad.setLocationRelativeTo(ad);
                    login.dispose();
                }
                else if(user.getId_tipo() == 2){
                    JOptionPane.showMessageDialog(null,"Login exitoso");
                    System.out.println("Login exitoso");
                    CuidadoPersonal cp = new CuidadoPersonal();
                    Admin ad = new Admin();
                    AdultoMayor adul = new AdultoMayor();
                    Belleza be = new Belleza();
                    Dermocosmetica der = new Dermocosmetica();
                    Infantil inf = new Infantil();
                    Medicamentos med = new Medicamentos();
                    Nutricion nut = new Nutricion();
                    Prevencion prev = new Prevencion();
                    Sexualidad sex = new Sexualidad();
                    Menú men = new Menú();
                    ControladorProducto c = new ControladorProducto(cp, ad, adul, be, der, inf, med, nut, prev, sex);
                    //
                    Ofertas of = new Ofertas();
                    ControladorOferta co = new ControladorOferta(ad, of);
                    //
                    men.setVisible(true);
                    men.setLocationRelativeTo(men);
                    login.dispose();   
                }           
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
   
}
