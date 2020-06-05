/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.ListaCarrito;
import modelo.Producto;
import modelo.ProductoDAO;
import vista.*;

/**
 *
 * @author Gustavo
 */
// Instanciando clases.
public class ControladorProducto implements ActionListener{
    ProductoDAO daoP = new ProductoDAO();
    Producto prod = new Producto();   
    Admin admin = new Admin();
    DefaultTableModel modelo = new DefaultTableModel();
    //Vistas
    CuidadoPersonal cp = new CuidadoPersonal();
    AdultoMayor adul = new AdultoMayor();
    Belleza be = new Belleza();
    Dermocosmetica der = new Dermocosmetica();
    Infantil inf = new Infantil();
    Medicamentos med = new Medicamentos();
    Nutricion nut = new Nutricion();
    Prevencion prev = new Prevencion();
    Sexualidad sex = new Sexualidad();

    
    
    
    
//Constructor para instanciar funciones de las vitas(botones de ejecucion de formularios).
    public ControladorProducto(CuidadoPersonal CuidP,Admin ad,AdultoMayor adMayor,Belleza belleza,Dermocosmetica dermo, Infantil infantil, Medicamentos medic,
            Nutricion nutricion, Prevencion preven, Sexualidad sexualidad) {
        //listar cuidado personal
        this.cp = CuidP; 
        this.cp.BTListarProdCuidado.addActionListener(this);
        //Listar Adulto mayor
        this.adul = adMayor;
        this.adul.jBAdulto.addActionListener(this);
        //Listar belleza
        this.be = belleza;
        this.be.jBBelleza.addActionListener(this);
        // Listar Dermocosmetica
        this.der = dermo;
        this.der.jBDermo.addActionListener(this);
        //Listar infantil
        this.inf = infantil;
        this.inf.jBInfantil.addActionListener(this);
        //listar Medicamentos
        this.med = medic;
        this.med.jBMeds.addActionListener(this);
        //Listar nutrición.
        this.nut = nutricion;
        this.nut.jBNutri.addActionListener(this);
        //listar Prevencion
        this.prev = preven;
        this.prev.jBPrev.addActionListener(this);
        //Listar Sexualidad
        this.sex = sexualidad;
        this.sex.jBSexualidad.addActionListener(this);
        
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
            listarCuid(cp.JTCuidadoPersonal);           
        } 
        if (e.getSource()== adul.jBAdulto) {
            listarAdMayor(adul.jTaAdultoMayor);
        }
        if (e.getSource() == be.jBBelleza) {
            listarBell(be.jTaBelleza);
        }
        if (e.getSource() ==der.jBDermo) {
            listarDermo(der.jTaDermoCosmetica);
        }
        if (e.getSource() ==inf.jBInfantil) {
            listarInfyMat(inf.jTaInfantil);
        }
        if (e.getSource()==med.jBMeds) {
            listarMedi(med.jTMedicamentos);
        }
        if (e.getSource() == nut.jBNutri) {
            listarNutyVit(nut.jTNutricion);
        }
        if (e.getSource() == prev.jBPrev) {
            listarPrev(prev.jTPrevencion);
        }
        if (e.getSource()==sex.jBSexualidad) {
            listarSex(sex.jTSexualidad);
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
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        prod.setFecha_fabri(formatoFecha.format(admin.jDFecha_fab.getDate()));
        prod.setFecha_venc(formatoFecha.format(admin.jDFecha_venc.getDate()));
        prod.setDosis(admin.jTextFieldDosis.getText());
        prod.setCodigocategoria(Integer.parseInt(admin.jTCodCategoria.getText()));
        prod.setCodigo_oferta(Integer.parseInt(admin.jTCodOferta.getText()));
        try {
            daoP.actualizar(prod);
            JOptionPane.showMessageDialog(null, "Registro modificado");
            //Limpiar casillas de texto
            limpiar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
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
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");  
            admin.jDFecha_fab.setDate(formato.parse(prod.getFecha_fabri()));
            admin.jDFecha_venc.setDate(formato.parse(prod.getFecha_venc()));
            admin.jTextFieldDosis.setText(prod.getDosis());
            admin.jTCodCategoria.setText(String.valueOf(prod.getCodigocategoria()));
            admin.jTCodOferta.setText(String.valueOf(prod.getCodigo_oferta()));
            
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
        prod.setCodigocategoria(Integer.parseInt(admin.jTCodCategoria.getText()));
        prod.setCodigo_oferta(Integer.parseInt(admin.jTCodOferta.getText()));
        try {
            daoP.agregar(prod);
            JOptionPane.showMessageDialog(null, "Registro agregado");
            //Limpiar casillas de texto
            limpiar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al registrar producto");
            //Limpiar casillas de texto
            limpiar();
        }
    }
    // metodo listar controlador
    public void listarCuid(JTable JTCuidadoPersonal ){
        modelo=(DefaultTableModel)JTCuidadoPersonal.getModel();
        List<Producto>lista= daoP.listarCuidadoPersonal();
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
        // metodo listar controlador
    public void listarPrev(JTable jTPrevencion){
        modelo=(DefaultTableModel)jTPrevencion.getModel();
        List<Producto>lista= daoP.listarPrevencion();
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
        prev.jTPrevencion.setModel(modelo);
    }
    // metodo listar controlador
    public void listarMedi(JTable jTMedicamentos ){
        modelo=(DefaultTableModel)jTMedicamentos.getModel();
        List<Producto>lista= daoP.listarMedicamentos();
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
        med.jTMedicamentos.setModel(modelo);
    }
    // metodo listar controlador
    public void listarDermo(JTable jTaDermoCosmetica ){
        modelo=(DefaultTableModel)jTaDermoCosmetica.getModel();
        List<Producto>lista= daoP.listarDermocosmetica();
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
        der.jTaDermoCosmetica.setModel(modelo);
    }
    // metodo listar controlador
    public void listarInfyMat(JTable jTaInfantil ){
        modelo=(DefaultTableModel)jTaInfantil.getModel();
        List<Producto>lista= daoP.listarInfyMat();
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
        inf.jTaInfantil.setModel(modelo);
    }
    // metodo listar controlador
    public void listarSex(JTable jTSexualidad ){
        modelo=(DefaultTableModel)jTSexualidad.getModel();
        List<Producto>lista= daoP.listarSexualidad();
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
        sex.jTSexualidad.setModel(modelo);
    }
    // metodo listar controlador
    public void listarBell(JTable jTaBelleza ){
        modelo=(DefaultTableModel)jTaBelleza.getModel();
        List<Producto>lista= daoP.listarBelleza();
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
        be.jTaBelleza.setModel(modelo);
    }
    // metodo listar controlador
    public void listarNutyVit(JTable jTNutricion ){
        modelo=(DefaultTableModel)jTNutricion.getModel();
        List<Producto>lista= daoP.listarnutri();
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
        nut.jTNutricion.setModel(modelo);
    }
    // metodo listar controlador
    public void listarAdMayor(JTable jTaAdultoMayor ){
        modelo=(DefaultTableModel)jTaAdultoMayor.getModel();
        List<Producto>lista= daoP.listarAdultoMayor();
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
        adul.jTaAdultoMayor.setModel(modelo);
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
         admin.jTCodCategoria.setText(null);
         admin.jTCodOferta.setText(null);
         
    }

    
    

    
}
