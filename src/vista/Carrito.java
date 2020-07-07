/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCarrito;
import static controlador.ControladorCarrito.lista;
import controlador.ControladorCompra;
import controlador.ControladorOferta;
import controlador.ControladorProducto;
import controlador.ControladorUsuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Compra;
import modelo.CompraSQL;
import modelo.ListaCarrito;
import modelo.Producto;

/**
 *
 * @author Eduardo
 */
public class Carrito extends javax.swing.JFrame {

    int col;
    int row;
    DefaultTableModel dtm = new DefaultTableModel();

    public Carrito() {
        initComponents();

        //        Icono
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconox.png")).getImage());

        //        Titulo
        setTitle("CARRITO");

        //        Fondo del Jframe
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/f1.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

        //        Centrar Jframe
        this.setLocationRelativeTo(null);
        //Establecer la fecha
        jTFecha.setText(ControladorCarrito.fecha());

        //Listar Carrito
        ControladorCarrito c = new ControladorCarrito();
        //
        DefaultTableModel modelo = new DefaultTableModel();
        ListaCarrito l = new ListaCarrito();

        modelo = (DefaultTableModel) jTCarrito.getModel();
        modelo.setRowCount(0);

        List<ListaCarrito> lista = ControladorCarrito.listarCarrito();
        Object[] object = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getPrecio();
            object[3] = lista.get(i).getPrecio_bruto();
            object[4] = lista.get(i).getCantidad();
            modelo.addRow(object);
        }
        jTCarrito.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTCarrito = new javax.swing.JTable();
        jTFecha = new javax.swing.JTextField();
        jCTipoPago1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jBRecargarCarrito = new javax.swing.JButton();
        jBCarritoComprar = new javax.swing.JButton();
        jBLimpiarCarrito = new javax.swing.JButton();
        jBCancelarCompra = new javax.swing.JButton();
        jBEliminarProducto = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jBComprar = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        Prevencion = new javax.swing.JMenuItem();
        Medicamentos = new javax.swing.JMenuItem();
        Dermocosmetica = new javax.swing.JMenuItem();
        InfantilMaternidad = new javax.swing.JMenuItem();
        CuidadoPersonal = new javax.swing.JMenuItem();
        Sexualidad = new javax.swing.JMenuItem();
        Belleza = new javax.swing.JMenuItem();
        Nutricion = new javax.swing.JMenuItem();
        AdultoMayor = new javax.swing.JMenuItem();
        IniciarSesion = new javax.swing.JMenu();
        Carrito = new javax.swing.JMenu();
        Ofertas = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre ", "Precio neto", "Precio bruto", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCarritoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTCarrito);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 69, 1460, 650));

        jTFecha.setEditable(false);
        jTFecha.setBackground(new java.awt.Color(0, 30, 84));
        jTFecha.setBorder(null);
        jTFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFechaActionPerformed(evt);
            }
        });
        getContentPane().add(jTFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1347, 6, 102, -1));

        jCTipoPago1.setBackground(new java.awt.Color(0, 42, 113));
        jCTipoPago1.setForeground(new java.awt.Color(204, 204, 204));
        jCTipoPago1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Forma de pago", "Credito", "Debito", "Efectivo" }));
        jCTipoPago1.setToolTipText("");
        jCTipoPago1.setBorder(null);
        jCTipoPago1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTipoPago1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCTipoPago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 727, 188, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/metodopago.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 727, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 30, 84));
        jPanel1.setForeground(new java.awt.Color(0, 30, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 10));

        jBRecargarCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/recargar2.png"))); // NOI18N
        jBRecargarCarrito.setBorder(null);
        jBRecargarCarrito.setBorderPainted(false);
        jBRecargarCarrito.setContentAreaFilled(false);
        jBRecargarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRecargarCarritoActionPerformed(evt);
            }
        });
        jPanel1.add(jBRecargarCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));

        jBCarritoComprar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gustavo\\Desktop\\img\\verTicket.png")); // NOI18N
        jBCarritoComprar.setText("Ver ticket");
        jBCarritoComprar.setBorder(null);
        jBCarritoComprar.setBorderPainted(false);
        jBCarritoComprar.setContentAreaFilled(false);
        jBCarritoComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCarritoComprarActionPerformed(evt);
            }
        });
        jPanel1.add(jBCarritoComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 780, 170, 30));

        jBLimpiarCarrito.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gustavo\\Desktop\\img\\Limpiar Carrito.png")); // NOI18N
        jBLimpiarCarrito.setBorder(null);
        jBLimpiarCarrito.setBorderPainted(false);
        jBLimpiarCarrito.setContentAreaFilled(false);
        jBLimpiarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarCarritoActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiarCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 780, 170, 30));

        jBCancelarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/Cancelar Compra.png"))); // NOI18N
        jBCancelarCompra.setBorder(null);
        jBCancelarCompra.setBorderPainted(false);
        jBCancelarCompra.setContentAreaFilled(false);
        jBCancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarCompraActionPerformed(evt);
            }
        });
        jPanel1.add(jBCancelarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 778, 170, 30));

        jBEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/Eliminar producto de la lista.png"))); // NOI18N
        jBEliminarProducto.setBorder(null);
        jBEliminarProducto.setBorderPainted(false);
        jBEliminarProducto.setContentAreaFilled(false);
        jBEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(jBEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 780, 170, 30));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 170, 10));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 820, 170, 10));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 820, 170, 10));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 820, 170, 10));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 820, 170, 10));

        jBComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/AceptarCompra.png"))); // NOI18N
        jBComprar.setBorder(null);
        jBComprar.setBorderPainted(false);
        jBComprar.setContentAreaFilled(false);
        jBComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprarActionPerformed(evt);
            }
        });
        jPanel1.add(jBComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 780, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 840));

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar2.setBorder(null);
        jMenuBar2.setForeground(new java.awt.Color(102, 153, 255));
        jMenuBar2.setToolTipText("");
        jMenuBar2.setName(""); // NOI18N

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setBorder(null);
        jMenu3.setForeground(new java.awt.Color(153, 153, 153));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_menu_26px.png"))); // NOI18N
        jMenu3.setText("Productos");
        jMenu3.setBorderPainted(false);

        Prevencion.setBackground(new java.awt.Color(255, 255, 255));
        Prevencion.setForeground(new java.awt.Color(153, 153, 153));
        Prevencion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_doctors_bag_40px.png"))); // NOI18N
        Prevencion.setText("Prevención");
        Prevencion.setBorder(null);
        Prevencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevencionActionPerformed(evt);
            }
        });
        jMenu3.add(Prevencion);

        Medicamentos.setBackground(new java.awt.Color(255, 255, 255));
        Medicamentos.setForeground(new java.awt.Color(153, 153, 153));
        Medicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_pill_40px.png"))); // NOI18N
        Medicamentos.setText("Medicamentos");
        Medicamentos.setBorder(null);
        Medicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicamentosActionPerformed(evt);
            }
        });
        jMenu3.add(Medicamentos);

        Dermocosmetica.setBackground(new java.awt.Color(255, 255, 255));
        Dermocosmetica.setForeground(new java.awt.Color(153, 153, 153));
        Dermocosmetica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_cosmetic_brush_40px.png"))); // NOI18N
        Dermocosmetica.setText("Dermocosmética");
        Dermocosmetica.setBorder(null);
        Dermocosmetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DermocosmeticaActionPerformed(evt);
            }
        });
        jMenu3.add(Dermocosmetica);

        InfantilMaternidad.setBackground(new java.awt.Color(255, 255, 255));
        InfantilMaternidad.setForeground(new java.awt.Color(153, 153, 153));
        InfantilMaternidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_mother_40px_1.png"))); // NOI18N
        InfantilMaternidad.setText("Infantil y maternidad");
        InfantilMaternidad.setBorder(null);
        InfantilMaternidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfantilMaternidadActionPerformed(evt);
            }
        });
        jMenu3.add(InfantilMaternidad);

        CuidadoPersonal.setBackground(new java.awt.Color(255, 255, 255));
        CuidadoPersonal.setForeground(new java.awt.Color(153, 153, 153));
        CuidadoPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_bandage_40px.png"))); // NOI18N
        CuidadoPersonal.setText("Cuidado personal");
        CuidadoPersonal.setBorder(null);
        CuidadoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuidadoPersonalActionPerformed(evt);
            }
        });
        jMenu3.add(CuidadoPersonal);

        Sexualidad.setBackground(new java.awt.Color(255, 255, 255));
        Sexualidad.setForeground(new java.awt.Color(153, 153, 153));
        Sexualidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_gender_40px.png"))); // NOI18N
        Sexualidad.setText("Sexualidad");
        Sexualidad.setBorder(null);
        Sexualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexualidadActionPerformed(evt);
            }
        });
        jMenu3.add(Sexualidad);

        Belleza.setBackground(new java.awt.Color(255, 255, 255));
        Belleza.setForeground(new java.awt.Color(153, 153, 153));
        Belleza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_mirror_40px.png"))); // NOI18N
        Belleza.setText("Belleza");
        Belleza.setBorder(null);
        Belleza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BellezaActionPerformed(evt);
            }
        });
        jMenu3.add(Belleza);

        Nutricion.setBackground(new java.awt.Color(255, 255, 255));
        Nutricion.setForeground(new java.awt.Color(153, 153, 153));
        Nutricion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_pill_bottle_40px.png"))); // NOI18N
        Nutricion.setText("Nutrición y vitaminas");
        Nutricion.setBorder(null);
        Nutricion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NutricionActionPerformed(evt);
            }
        });
        jMenu3.add(Nutricion);

        AdultoMayor.setBackground(new java.awt.Color(255, 255, 255));
        AdultoMayor.setForeground(new java.awt.Color(153, 153, 153));
        AdultoMayor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_elderly_person_40px.png"))); // NOI18N
        AdultoMayor.setText("Adulto mayor");
        AdultoMayor.setBorder(null);
        AdultoMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdultoMayorActionPerformed(evt);
            }
        });
        jMenu3.add(AdultoMayor);

        jMenuBar2.add(jMenu3);

        IniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        IniciarSesion.setForeground(new java.awt.Color(153, 153, 153));
        IniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_user_40px.png"))); // NOI18N
        IniciarSesion.setText("Iniciar Sesión");
        IniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IniciarSesionMouseClicked(evt);
            }
        });
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });
        jMenuBar2.add(IniciarSesion);

        Carrito.setBackground(new java.awt.Color(255, 255, 255));
        Carrito.setForeground(new java.awt.Color(153, 153, 153));
        Carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_card_payment_40px_1.png"))); // NOI18N
        Carrito.setText("Carrito");
        Carrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarritoMouseClicked(evt);
            }
        });
        Carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarritoActionPerformed(evt);
            }
        });
        jMenuBar2.add(Carrito);

        Ofertas.setBackground(new java.awt.Color(255, 255, 255));
        Ofertas.setForeground(new java.awt.Color(153, 153, 153));
        Ofertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_discount_40px.png"))); // NOI18N
        Ofertas.setText("Ofertas");
        Ofertas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OfertasMouseClicked(evt);
            }
        });
        Ofertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OfertasActionPerformed(evt);
            }
        });
        jMenuBar2.add(Ofertas);

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(153, 153, 153));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_2/icons8_system_report_40px.png"))); // NOI18N
        jMenu1.setText("Reportes");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRecargarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRecargarCarritoActionPerformed

        DefaultTableModel modelo = new DefaultTableModel();
        ListaCarrito l = new ListaCarrito();

        modelo = (DefaultTableModel) jTCarrito.getModel();

        modelo.setRowCount(0);
        List<ListaCarrito> lista = ControladorCarrito.listarCarrito();
        Object[] object = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getPrecio();
            object[3] = lista.get(i).getPrecio_bruto();
            object[4] = lista.get(i).getCantidad();
            modelo.addRow(object);
        }
        jTCarrito.setModel(modelo);
    }//GEN-LAST:event_jBRecargarCarritoActionPerformed

    private void jBEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarProductoActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) jTCarrito.getModel();
        int dialogButton = JOptionPane.YES_NO_OPTION;

        int dialogResult = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el producto de la lista?");
        if (dialogResult == 0) {
            modelo.removeRow(row);
            ControladorCarrito.lista.remove(row);
            modelo.setRowCount(0);
        }
        for (int i = 0; i < ControladorCarrito.lista.size(); i++) {
            Object[] objs = {ControladorCarrito.lista.get(i).getId(), ControladorCarrito.lista.get(i).getNombre(), ControladorCarrito.lista.get(i).getPrecio(),
                ControladorCarrito.lista.get(i).getCantidad()};
            modelo.addRow(objs);
        }


    }//GEN-LAST:event_jBEliminarProductoActionPerformed

    private void jBLimpiarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarCarritoActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) jTCarrito.getModel();
        int dialogButton = JOptionPane.YES_NO_OPTION;

        int dialogResult = JOptionPane.showConfirmDialog(null, "¿Desea eliminar todos los productos de la lista?");
        if (dialogResult == 0) {
            modelo.removeRow(row);
            ControladorCarrito.lista.removeAll(lista);
            modelo.setRowCount(0);
        }
        for (int i = 0; i < ControladorCarrito.lista.size(); i++) {
            Object[] objs = {ControladorCarrito.lista.get(i).getId(), ControladorCarrito.lista.get(i).getNombre(), ControladorCarrito.lista.get(i).getPrecio(),
                ControladorCarrito.lista.get(i).getCantidad()};
            modelo.addRow(objs);
        }
    }//GEN-LAST:event_jBLimpiarCarritoActionPerformed

    private void jTCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCarritoMouseClicked

    }//GEN-LAST:event_jTCarritoMouseClicked

    private void jBCarritoComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCarritoComprarActionPerformed
        Carrito c = new Carrito();
        TicketDeCambio t = new TicketDeCambio();
        ControladorCompra con = new ControladorCompra(c);
        CompraSQL cs = new CompraSQL();
        List<ListaCarrito> listarCarrito = ControladorCarrito.listarCarrito();
        int total = 0;
        int cant_total = 0;
        for (ListaCarrito listarCarrito1 : listarCarrito) {
            total += listarCarrito1.getPrecio_bruto();
            cant_total += listarCarrito1.getCantidad();
        }
        try {
            t.jTNumBoleta.setText(String.valueOf(cs.buscarIdCompra()));
            t.jTPrecioTotal.setText(String.valueOf(total));
            t.jTCantidadDeProductos.setText(String.valueOf(cant_total));

            t.setVisible(true);
            t.setLocationRelativeTo(t);
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jBCarritoComprarActionPerformed

    private void jTFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFechaActionPerformed

    private void jBCancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarCompraActionPerformed

        DefaultTableModel modelo = new DefaultTableModel();

        modelo = (DefaultTableModel) jTCarrito.getModel();
        TicketDeCambio tick = new TicketDeCambio();
        Menú men = new Menú();
        int dialogResult = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere cancelar la compra?");
        try {
            if (dialogResult == 0) {
                modelo.removeRow(row);
                ControladorCarrito.lista.removeAll(lista);
                modelo.setRowCount(0);
            }
            for (int i = 0; i < ControladorCarrito.lista.size(); i++) {
                Object[] objs = {ControladorCarrito.lista.get(i).getId(), ControladorCarrito.lista.get(i).getNombre(), ControladorCarrito.lista.get(i).getPrecio(),
                    ControladorCarrito.lista.get(i).getCantidad()};
                modelo.addRow(objs);
            }
        } catch (Exception e) {
            System.out.println("No hay datos en el carrito");
        }

        tick.jTNumBoleta.setText(null);
        men.dispose();

        men.setVisible(true);

        dispose();

    }//GEN-LAST:event_jBCancelarCompraActionPerformed

    private void jCTipoPago1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTipoPago1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTipoPago1ActionPerformed

    private void jBComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprarActionPerformed
        
    }//GEN-LAST:event_jBComprarActionPerformed

    private void PrevencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevencionActionPerformed
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
        prev.setVisible(true);
        prev.setLocationRelativeTo(prev);
        dispose();
    }//GEN-LAST:event_PrevencionActionPerformed

    private void MedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicamentosActionPerformed
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
        med.setVisible(true);
        med.setLocationRelativeTo(med);
        dispose();
    }//GEN-LAST:event_MedicamentosActionPerformed

    private void DermocosmeticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DermocosmeticaActionPerformed
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
        der.setVisible(true);
        der.setLocationRelativeTo(der);
        dispose();
    }//GEN-LAST:event_DermocosmeticaActionPerformed

    private void InfantilMaternidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfantilMaternidadActionPerformed
        //Mostrar los datos en la tabla.
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
        Carrito car = new Carrito();
        InformacionProducto inprod = new InformacionProducto();

        ControladorProducto c = new ControladorProducto(cp, ad, adul, be, der, inf, med, nut, prev, sex);
        prev.setVisible(true);
        prev.setLocationRelativeTo(prev);
        dispose();
    }//GEN-LAST:event_InfantilMaternidadActionPerformed

    private void CuidadoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuidadoPersonalActionPerformed
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
        cp.setVisible(true);
        cp.setLocationRelativeTo(cp);
        dispose();
    }//GEN-LAST:event_CuidadoPersonalActionPerformed

    private void SexualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexualidadActionPerformed
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
        sex.setVisible(true);
        sex.setLocationRelativeTo(sex);
        dispose();
    }//GEN-LAST:event_SexualidadActionPerformed

    private void BellezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BellezaActionPerformed
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
        be.setVisible(true);
        be.setLocationRelativeTo(be);
        dispose();
    }//GEN-LAST:event_BellezaActionPerformed

    private void NutricionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NutricionActionPerformed
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
        nut.setVisible(true);
        nut.setLocationRelativeTo(nut);
        dispose();
    }//GEN-LAST:event_NutricionActionPerformed

    private void AdultoMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdultoMayorActionPerformed
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
        adul.setVisible(true);
        adul.setLocationRelativeTo(adul);
        dispose();
    }//GEN-LAST:event_AdultoMayorActionPerformed

    private void IniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarSesionMouseClicked
        IniciarSesion lg = new IniciarSesion();
        ControladorUsuario c = new ControladorUsuario(lg);
        lg.setVisible(true);
        lg.setLocationRelativeTo(lg);
        dispose();
    }//GEN-LAST:event_IniciarSesionMouseClicked

    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
        IniciarSesion lg = new IniciarSesion();
        ControladorUsuario c = new ControladorUsuario(lg);
        lg.setVisible(true);
        lg.setLocationRelativeTo(lg);
        dispose();

    }//GEN-LAST:event_IniciarSesionActionPerformed

    private void CarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarritoMouseClicked
        Carrito vista11 = new Carrito();
        ControladorCompra c = new ControladorCompra(vista11);
        vista11.setVisible(true);
        dispose();
    }//GEN-LAST:event_CarritoMouseClicked

    private void CarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarritoActionPerformed
        Carrito car = new Carrito();
        ControladorCompra controladorOfertas = new ControladorCompra(car);
        car.setVisible(true);
        car.setLocationRelativeTo(car);
        dispose();
    }//GEN-LAST:event_CarritoActionPerformed

    private void OfertasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfertasMouseClicked
        Ofertas of = new Ofertas();
        Admin adm = new Admin();
        ControladorOferta controladorOfertas = new ControladorOferta(adm, of);
        of.setVisible(true);
        of.setLocationRelativeTo(of);
        dispose();
    }//GEN-LAST:event_OfertasMouseClicked

    private void OfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OfertasActionPerformed
        Ofertas of = new Ofertas();
        Admin adm = new Admin();
        ControladorOferta controladorOfertas = new ControladorOferta(adm, of);
        of.setVisible(true);
        of.setLocationRelativeTo(of);
        dispose();
    }//GEN-LAST:event_OfertasActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

        ReporteVista r = new ReporteVista();
        r.setVisible(true);
        r.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenu1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdultoMayor;
    private javax.swing.JMenuItem Belleza;
    private javax.swing.JMenu Carrito;
    private javax.swing.JMenuItem CuidadoPersonal;
    private javax.swing.JMenuItem Dermocosmetica;
    private javax.swing.JMenuItem InfantilMaternidad;
    private javax.swing.JMenu IniciarSesion;
    private javax.swing.JMenuItem Medicamentos;
    private javax.swing.JMenuItem Nutricion;
    private javax.swing.JMenu Ofertas;
    private javax.swing.JMenuItem Prevencion;
    private javax.swing.JMenuItem Sexualidad;
    public javax.swing.JButton jBCancelarCompra;
    public javax.swing.JButton jBCarritoComprar;
    public javax.swing.JButton jBComprar;
    public javax.swing.JButton jBEliminarProducto;
    public javax.swing.JButton jBLimpiarCarrito;
    public javax.swing.JButton jBRecargarCarrito;
    public javax.swing.JComboBox jCTipoPago1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JTable jTCarrito;
    public javax.swing.JTextField jTFecha;
    // End of variables declaration//GEN-END:variables
}
