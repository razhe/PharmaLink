/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCarrito;
import controlador.ControladorCompra;
import static java.awt.SystemColor.info;
import static java.time.Clock.tick;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Compra;
import modelo.CompraSQL;
import modelo.ListaCarrito;

/**
 *
 * @author Gustavo
 */
public class TicketDeCambio extends javax.swing.JFrame {

    /**
     * Creates new form TicketDeCambio
     */
    public TicketDeCambio() {
        initComponents();
        listarProductos();
        setLocationRelativeTo(null);
    } 
//    public int retornarTotal(){
//        int total = 0;
//        List<ListaCarrito> listarCarrito = ControladorCarrito.listarCarrito();
//        for (ListaCarrito listarCarrito1 : listarCarrito) {
//            total += listarCarrito1.getPrecio_bruto();
//            
//        }
//        return total;
//    }
//    public int retornarCantidadTotal(){
//        int cant_total = 0;
//        List<ListaCarrito> listarCarrito = ControladorCarrito.listarCarrito();
//        for (ListaCarrito listarCarrito1 : listarCarrito) {           
//            cant_total += listarCarrito1.getCantidad();
//        }
//        return cant_total;            
//    }
//    public void rellenarCasillasTicket() {
//        CompraSQL c = new CompraSQL();        
//        jTNumBoleta.setText(String.valueOf(c.buscarIdCompra()));
//        jTPrecioTotal.setText(String.valueOf(retornarTotal()));
//        jTCantidadDeProductos.setText(String.valueOf(retornarCantidadTotal()));
    
    

    public void listarProductos() {
        DefaultTableModel modelo = new DefaultTableModel();
        ListaCarrito l = new ListaCarrito();

        modelo = (DefaultTableModel) jTProductosTicket.getModel();
        modelo.setRowCount(0);
        List<ListaCarrito> lista = ControladorCarrito.listarCarrito();
        Object[] object = new Object[2];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getNombre();
            object[1] = lista.get(i).getPrecio_bruto();

            modelo.addRow(object);
        }
        jTProductosTicket.setModel(modelo);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProductosTicket = new javax.swing.JTable();
        jTNumBoleta = new javax.swing.JTextField();
        jTPrecioTotal = new javax.swing.JTextField();
        jTCantidadDeProductos = new javax.swing.JTextField();
        jBVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la boleta"));

        jLabel1.setText("Numero de boleta:");

        jLabel2.setText("Precio total:");

        jLabel3.setText("Cantidad de productos:");

        jLabel4.setText("Productos:");

        jTProductosTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Productos", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTProductosTicket);

        jTNumBoleta.setEditable(false);
        jTNumBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNumBoletaActionPerformed(evt);
            }
        });

        jTPrecioTotal.setEditable(false);
        jTPrecioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecioTotalActionPerformed(evt);
            }
        });

        jTCantidadDeProductos.setEditable(false);
        jTCantidadDeProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCantidadDeProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTCantidadDeProductos)
                        .addComponent(jTPrecioTotal)
                        .addComponent(jTNumBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTNumBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTCantidadDeProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jBVolver.setText("Volver");
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jBVolver)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTCantidadDeProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCantidadDeProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCantidadDeProductosActionPerformed

    private void jTNumBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNumBoletaActionPerformed

    }//GEN-LAST:event_jTNumBoletaActionPerformed

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
//        Carrito car = new Carrito();
//        TicketDeCambio t = new TicketDeCambio();
//        t.removeAll();
        dispose();
    }//GEN-LAST:event_jBVolverActionPerformed

    private void jTPrecioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrecioTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrecioTotalActionPerformed

    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTCantidadDeProductos;
    public javax.swing.JTextField jTNumBoleta;
    public javax.swing.JTextField jTPrecioTotal;
    public javax.swing.JTable jTProductosTicket;
    // End of variables declaration//GEN-END:variables
}
