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
import vista.IniciarSesion;
import vista.Menú;

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
        login.jTextField1.setText(null);
    }
    
    public void login() throws SQLException{ 
        try {
            Usuario user = daoU.login(login.jTextField1.getText());
            if(user == null){
                JOptionPane.showMessageDialog(null,"Error al iniciar sesion");
                System.out.println("Error");
                limpiar();
            }
            else{
                if(user.getId_tipo() == 1){
                    JOptionPane.showMessageDialog(null,"Login exitoso");
                    System.out.println("Login exitoso");
                    Admin vistaADM = new Admin();
                    vistaADM.setVisible(true);
                    login.dispose();
                }
                else if(user.getId_tipo() == 2){
                    JOptionPane.showMessageDialog(null,"Login exitoso");
                    System.out.println("Login exitoso");
                    Menú vistaPrincipal = new Menú();
                    vistaPrincipal.setVisible(true);
                    login.dispose();   
                }           
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
   
}
