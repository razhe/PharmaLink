/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.Oferta;
import modelo.OfertaSQL;
import modelo.Producto;
import vista.Admin;
import vista.Ofertas;

/**
 *
 * @author Gustavo
 */
public class ControladorOferta implements ActionListener  {
    OfertaSQL ofertaSql = new OfertaSQL();
    Oferta oferta = new Oferta();
    Ofertas of = new Ofertas();
    Admin admin = new Admin();
    DefaultTableModel modelo = new DefaultTableModel();
    

    public ControladorOferta(Admin adm,Ofertas ofer) {
        //Modulo adminsitrador
        this.admin = adm;
        this.admin.jBOfertaAgregar.addActionListener(this);
        this.admin.jBOfertaBuscar.addActionListener(this);
        this.admin.jBOfertaEliminar.addActionListener(this);
        this.admin.jBOfertaModificar.addActionListener(this);
        //Vista ofertas
        this.of = ofer;
        this.of.jBRecargarCarrito.addActionListener(this);
                
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //Agregar oferta.
        if (e.getSource()==admin.jBOfertaAgregar) {
            agregarOferta();
        }
        //Eliminar Oferta.
        if (e.getSource()==admin.jBOfertaEliminar) {
            eliminarProducto();
        }
        //Modificar
        if (e.getSource()==admin.jBOfertaModificar) {
           actualizarOferta();
        }
        //Listar
        if (e.getSource()==of.jBRecargarCarrito) {
            listarOferta(of.jTOfertas);
        }
        //Buscar
        if (e.getSource()==admin.jBOfertaBuscar) {
            buscarOferta();
        }
    }
        public void limpiar(){
         admin.jTOfertaCodigo.setText(null);
         admin.jTOfertaDescuento.setText(null);
         admin.jTOfertasCantidad.setText(null);        
         admin.jDOfertaInicio.setCalendar(null);
         admin.jDOfertaFinal.setCalendar(null);
         
         
    }
    public void buscarOferta(){
        
        try {
            oferta.setId(Integer.parseInt(admin.jTOfertaCodigo.getText()));
            ofertaSql.buscarOferta(oferta);
            
            admin.jTOfertaDescuento.setText(String.valueOf(oferta.getDescuento()));
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            admin.jDOfertaInicio.setDate(sd.parse(oferta.getFecha_inicio()));
            admin.jDOfertaFinal.setDate(sd.parse(oferta.getFecha_fin()));
            admin.jTOfertasCantidad.setText(String.valueOf(oferta.getNum_producto()));           
        } catch (Exception e) {
        }
    }
    public void actualizarOferta(){
        try {
            oferta.setId(Integer.parseInt(admin.jTOfertaCodigo.getText()));
            oferta.setDescuento(Double.parseDouble(admin.jTOfertaDescuento.getText()));
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            oferta.setFecha_inicio(formatoFecha.format(admin.jDOfertaInicio.getDate()));
            oferta.setFecha_fin(formatoFecha.format(admin.jDOfertaFinal.getDate()));
            oferta.setNum_producto(Integer.parseInt(admin.jTOfertasCantidad.getText()));
            ofertaSql.actualizarOferta(oferta);
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void eliminarProducto(){     
        try {
            oferta.setId(Integer.parseInt(admin.jTOfertaCodigo.getText()));
            ofertaSql.eliminar(oferta);
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void agregarOferta(){  
        try {           
            oferta.setDescuento(Double.parseDouble(admin.jTOfertaDescuento.getText()));
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            oferta.setFecha_inicio(formatoFecha.format(admin.jDOfertaInicio.getDate()));
            oferta.setFecha_fin(formatoFecha.format(admin.jDOfertaFinal.getDate()));
            oferta.setNum_producto(Integer.parseInt(admin.jTOfertasCantidad.getText()));
            ofertaSql.agregarOferta(oferta);
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void listarOferta(JTable jTOfertas){
        modelo=(DefaultTableModel) jTOfertas.getModel();
       List<Producto> lista = ofertaSql.listarOfertas(); 
        Object[] object = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            object[0]=lista.get(i).getNombre();
            object[1]=lista.get(i).getMarca();
            object[2]= lista.get(i).getValor_peso();
            object[3]= lista.get(i).getDosis();
            modelo.addRow(object);
            
        }
        of.jTOfertas.setModel(modelo);
    }
    
    
    
    
}
