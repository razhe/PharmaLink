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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Compra;
import modelo.CompraSQL;
import modelo.DetalleCompra;
import modelo.DetalleCompraSQL;
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
    DetalleCompraSQL detDAO = new DetalleCompraSQL();
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
            try {
                if (car.jCTipoPago1.getSelectedItem() == "Forma de pago") {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un metodo de pago");
                    return;
                }
                agregarCompra();
                if (e.getSource() == car.jBComprar) {

                    try {
                        agregarDetalleCompra();
                    } catch (Exception ex) {
                        System.out.println("Error al agregar detalle compra (Controlador compra)");
                    }
                }
            } catch (Exception ex) {
                System.out.println("Error al agregar la compra (Controlador compra)");
            }

        }

    }

    public void agregarCompra() throws ClassNotFoundException {
        com.setFecha(car.jTFecha.getText());
        com.setTotal(retornarPrecio());
        com.setIdusuario(com.getIdusuario());
        cSQL.agregar(com);
    }

    public int retornarPrecio() {
        int precioTotal = 0;
        List<ListaCarrito> listarCarrito = ControladorCarrito.listarCarrito();
        for (ListaCarrito listarCarrito1 : listarCarrito) {
            precioTotal += listarCarrito1.getPrecio_bruto();
        }
        return precioTotal;
    }
//    public void rellenarCasillasTicket(){
//        List<ListaCarrito> listarCarrito = ControladorCarrito.listarCarrito();
//        TicketDeCambio t = new TicketDeCambio();
//        CompraSQL c = new CompraSQL();
//        int total = 0;
//        int cant_total = 0;
//        for (ListaCarrito listarCarrito1 : listarCarrito) {
//             total += listarCarrito1.getPrecio_bruto();
//             cant_total += listarCarrito1.getCantidad();
//        }
//        t.jTNumBoleta.setText(String.valueOf(c.buscarIdCompra()));
//        t.jTPrecioTotal.setText(String.valueOf(total));
//        t.jTCantidadDeProductos.setText(String.valueOf(cant_total));
//    }

    public void agregarDetalleCompra() throws ClassNotFoundException {

        List<ListaCarrito> listarCarrito = ControladorCarrito.listarCarrito();
        for (ListaCarrito listarCarrito1 : listarCarrito) {
            try {
                detCom.setPrecio_neto(listarCarrito1.getPrecio());
                detCom.setPrecio_bruto((int) listarCarrito1.getPrecio_bruto());
                detCom.setCantidad(listarCarrito1.getCantidad());
                //Evaluar el parse int
                detCom.setCod_producto(Integer.parseInt(listarCarrito1.getId()));
                detCom.setCod_compra(cSQL.buscarIdCompra());
                detDAO.agregarDetalleCompra(detCom);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
