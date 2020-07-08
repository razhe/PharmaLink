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
import javax.swing.ImageIcon;
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
        
        //        Icono
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconox.png")).getImage());
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
        jPanel4 = new javax.swing.JPanel();
        jTNumBoleta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jTPrecioTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTCantidadDeProductos = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProductosTicket = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jBVolver = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 30, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Numero de boleta:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 43, 131, -1));

        jPanel4.setBackground(new java.awt.Color(0, 42, 113));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTNumBoleta.setEditable(false);
        jTNumBoleta.setBackground(new java.awt.Color(0, 42, 113));
        jTNumBoleta.setForeground(new java.awt.Color(204, 204, 204));
        jTNumBoleta.setBorder(null);
        jTNumBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNumBoletaActionPerformed(evt);
            }
        });
        jPanel4.add(jTNumBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 104, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 42, 100, 10));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, 60));

        jPanel5.setBackground(new java.awt.Color(0, 42, 113));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTPrecioTotal.setEditable(false);
        jTPrecioTotal.setBackground(new java.awt.Color(0, 42, 113));
        jTPrecioTotal.setForeground(new java.awt.Color(204, 204, 204));
        jTPrecioTotal.setBorder(null);
        jTPrecioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecioTotalActionPerformed(evt);
            }
        });
        jPanel5.add(jTPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 104, -1));

        jLabel2.setText("Precio total:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 131, -1));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 42, 100, 10));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 370, 60));

        jPanel6.setBackground(new java.awt.Color(0, 42, 113));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Cantidad de productos:");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTCantidadDeProductos.setEditable(false);
        jTCantidadDeProductos.setBackground(new java.awt.Color(0, 42, 113));
        jTCantidadDeProductos.setForeground(new java.awt.Color(204, 204, 204));
        jTCantidadDeProductos.setBorder(null);
        jTCantidadDeProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCantidadDeProductosActionPerformed(evt);
            }
        });
        jPanel6.add(jTCantidadDeProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 104, -1));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel6.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 42, 100, 10));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 370, 60));

        jPanel7.setBackground(new java.awt.Color(0, 42, 113));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Productos:");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 131, -1));

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

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 330, 160));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 370, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 540, 580));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_go_back_32px.png"))); // NOI18N
        jBVolver.setBorder(null);
        jBVolver.setBorderPainted(false);
        jBVolver.setContentAreaFilled(false);
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });
        jPanel2.add(jBVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 50));

        jPanel3.setBackground(new java.awt.Color(195, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Ticket de Compra");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_favorite_cart_32px.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 60, 40));

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("¡Gracias por preferirnos!");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 540, 140));

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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JTextField jTCantidadDeProductos;
    public javax.swing.JTextField jTNumBoleta;
    public javax.swing.JTextField jTPrecioTotal;
    public javax.swing.JTable jTProductosTicket;
    // End of variables declaration//GEN-END:variables
}
