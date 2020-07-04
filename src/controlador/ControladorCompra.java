/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.table.DefaultTableModel;
import modelo.Compra;
import modelo.CompraSQL;
import modelo.DetalleCompra;
import modelo.DetalleCompraDAO;
import modelo.ListaCarrito;
import vista.Carrito;
import vista.TicketDeCambio;

/**
 *
 * @author Gustavo
 */
public class ControladorCompra implements ActionListener {

    //Sql 
    CompraSQL cSQL = new CompraSQL();
    DetalleCompraDAO detDAO = new DetalleCompraDAO();
    //Datos
    Compra com = new Compra();
    DetalleCompra detCom = new DetalleCompra();
    //Vista
    Carrito car = new Carrito();
    TicketDeCambio tick = new TicketDeCambio();
    //Tabla
    DefaultTableModel modelo = new DefaultTableModel();
    //variable global
    String info;

    public ControladorCompra(Carrito carrito) {
        this.car = carrito;
        this.car.jBComprar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == car.jBComprar) {
            info = car.jCTipoPago1.getSelectedItem().toString();
            if (info.equals("Credito")) {
                com.setCod_tipo_pago(1);
            } else if (info.equals("Debito")) {
                com.setCod_tipo_pago(2);
            } else if (info.equals("Efectivo")) {
                com.setCod_tipo_pago(3);
            }
            agregarCompra();
        }
        if (e.getSource() == car.jBComprar) {
            agregarDetalleCompra();
        }

    }

    public void agregarCompra() {
        //Falta codigo compra
        int precioTotal = 0;
        List<ListaCarrito> listarCarrito = ControladorCarrito.listarCarrito();
        for (ListaCarrito listarCarrito1 : listarCarrito) {
            precioTotal += listarCarrito1.getPrecio_bruto();
        }
        com.setFecha(car.jTFecha.getText());
        com.setTotal(precioTotal);
        com.setIdusuario(com.getIdusuario());       
        //Falta Id de Usuario
        cSQL.agregar(com);
    }

    public void agregarDetalleCompra() {       
        cSQL.buscarIdCompra(com);
        List<ListaCarrito> listarCarrito = ControladorCarrito.listarCarrito();
        for (ListaCarrito listarCarrito1 : listarCarrito) {
            try {

                detCom.setPrecio_neto(listarCarrito1.getPrecio());
                detCom.setPrecio_bruto((int) listarCarrito1.getPrecio_bruto());
                detCom.setCantidad(listarCarrito1.getCantidad());
                //Evaluar el parse int
                detCom.setCod_producto(Integer.parseInt(listarCarrito1.getId()));
                detCom.setCod_compra(com.getId_compra());
                detDAO.agregarDetalleCompra(detCom);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
