/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.ProductoDAO;
import vista.*;

/**
 *
 * @author Gustavo
 */
// Instanciando clases.
public class Controlador implements ActionListener{
    ProductoDAO daoP = new ProductoDAO();
    Producto prod = new Producto();
    CuidadoPersonal cp = new CuidadoPersonal();
    Admin admin = new Admin();
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    
//Constructor para instanciar funciones de las vitas(botones de ejecucion de formularios).
    public Controlador(CuidadoPersonal CuidP,Admin ad,IniciarSesion lg) {
        //listar cuidado personal
        this.cp = CuidP; 
        this.cp.BTListarProdCuidado.addActionListener(this);
        //Agregar producto
        this.admin = ad;
        this.admin.BTAgregar.addActionListener(this);
        this.admin.BTEliminar.addActionListener(this);
        this.admin.BTModificar.addActionListener(this);
        this.admin.BtBuscar.addActionListener(this);       
    }

    //Ejecucion de los metodos
    @Override
    public void actionPerformed(ActionEvent e) {  
        //Agregar productos
        if (e.getSource()== admin.BTAgregar) {
            agregar();
        }
        //Listar productos
        if(e.getSource()==cp.BTListarProdCuidado){
            listar(cp.JTCuidadoPersonal);
        }            
        //Modificar productos
        if(e.getSource()==admin.BTModificar){
            actualizar();
        }
        //Borrar productos
        if (e.getSource()==admin.BTEliminar) {
            eliminar();
        }
        //Buscar
        if (e.getSource() == admin.BtBuscar) {
            buscar();
        }
      
    }
    //Actualizar registro de tabla.   
    public void actualizar(){
        prod.setCodigo(Integer.parseInt(admin.jTextFieldCodigo.getText()));
        prod.setNombre(admin.jTextFieldNombre.getText());
        prod.setMarca(admin.jTextFieldMarca.getText());
        prod.setValor_peso(Integer.parseInt(admin.jTextFieldPrecio.getText()));
        prod.setFecha_fabri(admin.jDFecha_fab.getDateFormatString());
        prod.setFecha_venc(admin.jDFecha_venc.getDateFormatString());
        prod.setDosis(admin.jTextFieldDosis.getText());
        try {
            daoP.actualizar(prod);
            JOptionPane.showMessageDialog(null, "Registro modificado");
            //Limpiar casillas de texto
            limpiar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al modificar el registro");
            //Limpiar casillas de texto
            limpiar();
        }
    }
    //Eliminar registro de tabla.
    public void eliminar(){
        prod.setCodigo(Integer.parseInt(admin.jTextFieldCodigo.getText()));  
        try {
            daoP.eliminar(prod);          
            JOptionPane.showMessageDialog(null, "Registro eliminado");
            //Limpiar casillas de texto
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro");
            //Limpiar casillas de texto
            limpiar();
        }
    }
    public void buscar(){
        prod.setCodigo(Integer.parseInt(admin.jTextFieldCodigo.getText()));  
        try {
            
            daoP.buscar(prod); 
            //De volviendo la información a las casillas
            admin.jTextFieldNombre.setText(prod.getNombre());
            admin.jTextFieldMarca.setText(prod.getMarca());
            admin.jTextFieldPrecio.setText(String.valueOf(prod.getValor_peso()));
            admin.jDFecha_fab.setDateFormatString(prod.getFecha_fabri());
            admin.jDFecha_venc.setDateFormatString(prod.getFecha_venc());
            admin.jTextFieldDosis.setText(prod.getDosis());
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "*Error al buscar el registro* no se ha encotrado.");
            //Limpiar casillas de texto
            limpiar();
        }     
    }
    
    
    //metodo Agregar productos
    public void agregar(){       
        prod.setCodigo(Integer.parseInt(admin.jTextFieldCodigo.getText()));
        prod.setNombre(admin.jTextFieldNombre.getText());
        prod.setMarca(admin.jTextFieldMarca.getText());
        prod.setValor_peso(Integer.parseInt(admin.jTextFieldPrecio.getText()));
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        prod.setFecha_fabri(formatoFecha.format(admin.jDFecha_fab.getDate()));
        prod.setFecha_venc(formatoFecha.format(admin.jDFecha_venc.getDate()));
        prod.setDosis(admin.jTextFieldDosis.getText());
        try {
            daoP.agregar(prod);
            JOptionPane.showMessageDialog(null, "Registro agregado");
            //Limpiar casillas de texto
            limpiar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al registrar producto");
            //Limpiar casillas de texto
            limpiar();
        }
    }
    // metodo listar controlador
    public void listar(JTable JTCuidadoPersonal ){
        modelo=(DefaultTableModel)JTCuidadoPersonal.getModel();
        List<Producto>lista= daoP.listar();
        Object[]object=new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            object[0]= lista.get(i).getCodigo();
            object[1]= lista.get(i).getNombre();
            object[2]=lista.get(i).getMarca();
            object[3]=lista.get(i).getValor_peso();
            object[4]=lista.get(i).getFecha_fabri();
            object[5]=lista.get(i).getFecha_venc();
            object[6]= lista.get(i).getDosis();            
            modelo.addRow(object);
        //Si no se muestra es por que falto controlar el muestreo de datos en la tabla
        }
        cp.JTCuidadoPersonal.setModel(modelo);
    }
    
    //Limpiar cajas de texto   
    public void limpiar(){
         admin.jTextFieldCodigo.setText(null);
         admin.jTextFieldNombre.setText(null);
         admin.jTextFieldMarca.setText(null);
         admin.jTextFieldPrecio.setText(null);
         admin.jDFecha_fab.setCalendar(null);
         admin.jDFecha_venc.setCalendar(null);
         admin.jTextFieldDosis.setText(null);
         
    }
    
}
