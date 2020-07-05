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
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/f1.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
        //        Centrar Jframe
        this.setLocationRelativeTo(null);
        //Establecer la fecha
        jTFecha.setText(ControladorCarrito.fecha());
        
        //Listar Carrito
        ControladorCarrito c = new ControladorCarrito();
        //
        DefaultTableModel modelo = new DefaultTableModel();
        ListaCarrito l = new ListaCarrito();
        
        modelo=(DefaultTableModel)jTCarrito.getModel();       
        modelo.setRowCount(0);
        
        List<ListaCarrito>lista=  ControladorCarrito.listarCarrito();
        Object[]object=new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0]= lista.get(i).getId();
            object[1]= lista.get(i).getNombre();
            object[2]= lista.get(i).getPrecio();
            object[3]= lista.get(i).getPrecio_bruto();
            object[4]=lista.get(i).getCantidad();            
            modelo.addRow(object);
        }       
        jTCarrito.setModel(modelo);             
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTCarrito = new javax.swing.JTable();
        jBRecargarCarrito = new javax.swing.JButton();
        jBEliminarProducto = new javax.swing.JButton();
        jBLimpiarCarrito = new javax.swing.JButton();
        jBCarritoComprar = new javax.swing.JButton();
        jTFecha = new javax.swing.JTextField();
        jBCancelarCompra = new javax.swing.JButton();
        jBComprar = new javax.swing.JButton();
        jCTipoPago1 = new javax.swing.JComboBox();
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

        jBRecargarCarrito.setText("Recargar");
        jBRecargarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRecargarCarritoActionPerformed(evt);
            }
        });

        jBEliminarProducto.setText("Eliminar Producto de la lista");
        jBEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarProductoActionPerformed(evt);
            }
        });

        jBLimpiarCarrito.setText("Limpiar carrito");
        jBLimpiarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarCarritoActionPerformed(evt);
            }
        });

        jBCarritoComprar.setText("Ver ticket");
        jBCarritoComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCarritoComprarActionPerformed(evt);
            }
        });

        jTFecha.setEditable(false);
        jTFecha.setBorder(null);
        jTFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFechaActionPerformed(evt);
            }
        });

        jBCancelarCompra.setText("Cancelar Compra");
        jBCancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarCompraActionPerformed(evt);
            }
        });

        jBComprar.setText("Aceptar compra");
        jBComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprarActionPerformed(evt);
            }
        });

        jCTipoPago1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Forma de pago", "Credito", "Debito", "Efectivo" }));
        jCTipoPago1.setToolTipText("");
        jCTipoPago1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTipoPago1ActionPerformed(evt);
            }
        });

        jMenuBar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));
        jMenuBar2.setName(""); // NOI18N

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto.png"))); // NOI18N
        jMenu3.setText("Productos");

        Prevencion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prevencion.png"))); // NOI18N
        Prevencion.setText("Prevención");
        Prevencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevencionActionPerformed(evt);
            }
        });
        jMenu3.add(Prevencion);

        Medicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medicamento.png"))); // NOI18N
        Medicamentos.setText("Medicamentos");
        Medicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicamentosActionPerformed(evt);
            }
        });
        jMenu3.add(Medicamentos);

        Dermocosmetica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dermocosmetica.png"))); // NOI18N
        Dermocosmetica.setText("Dermocosmética");
        Dermocosmetica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DermocosmeticaActionPerformed(evt);
            }
        });
        jMenu3.add(Dermocosmetica);

        InfantilMaternidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/infantil.png"))); // NOI18N
        InfantilMaternidad.setText("Infantil y maternidad");
        InfantilMaternidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfantilMaternidadActionPerformed(evt);
            }
        });
        jMenu3.add(InfantilMaternidad);

        CuidadoPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuidadopersonal.png"))); // NOI18N
        CuidadoPersonal.setText("Cuidado personal");
        CuidadoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuidadoPersonalActionPerformed(evt);
            }
        });
        jMenu3.add(CuidadoPersonal);

        Sexualidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sexualidad.png"))); // NOI18N
        Sexualidad.setText("Sexualidad");
        Sexualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexualidadActionPerformed(evt);
            }
        });
        jMenu3.add(Sexualidad);

        Belleza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/belleza.png"))); // NOI18N
        Belleza.setText("Belleza");
        Belleza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BellezaActionPerformed(evt);
            }
        });
        jMenu3.add(Belleza);

        Nutricion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vitamina.png"))); // NOI18N
        Nutricion.setText("Nutrición y vitaminas");
        Nutricion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NutricionActionPerformed(evt);
            }
        });
        jMenu3.add(Nutricion);

        AdultoMayor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adultomayor.png"))); // NOI18N
        AdultoMayor.setText("Adulto mayor");
        AdultoMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdultoMayorActionPerformed(evt);
            }
        });
        jMenu3.add(AdultoMayor);

        jMenuBar2.add(jMenu3);

        IniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logical_1.png"))); // NOI18N
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

        Carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito_1.png"))); // NOI18N
        Carrito.setText("Carrito");
        Carrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarritoMouseClicked(evt);
            }
        });
        jMenuBar2.add(Carrito);

        Ofertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descuento-nalgene-icon.png"))); // NOI18N
        Ofertas.setText("Ofertas");
        Ofertas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OfertasMouseClicked(evt);
            }
        });
        jMenuBar2.add(Ofertas);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/errores (1).png"))); // NOI18N
        jMenu1.setText("Reportes");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBRecargarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBCarritoComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(jCTipoPago1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBCancelarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBLimpiarCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBCancelarCompra)
                                .addGap(18, 18, 18)
                                .addComponent(jBLimpiarCarrito)
                                .addGap(18, 18, 18)
                                .addComponent(jBEliminarProducto))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBComprar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBCarritoComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jBRecargarCarrito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCTipoPago1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrevencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevencionActionPerformed
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
            ControladorProducto c = new ControladorProducto(cp, ad, adul, be, der, inf, med, nut, prev, sex);
            prev.setVisible(true);
            prev.setLocationRelativeTo(prev);
            dispose();
    }//GEN-LAST:event_PrevencionActionPerformed

    private void MedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicamentosActionPerformed
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
            ControladorProducto c = new ControladorProducto(cp, ad, adul, be, der, inf, med, nut, prev, sex);
            med.setVisible(true);
            med.setLocationRelativeTo(med);
            dispose();
    }//GEN-LAST:event_MedicamentosActionPerformed

    private void DermocosmeticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DermocosmeticaActionPerformed
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
            ControladorProducto c = new ControladorProducto(cp, ad, adul, be, der, inf, med, nut, prev, sex);
            inf.setVisible(true);
            inf.setLocationRelativeTo(inf);
            dispose();
    }//GEN-LAST:event_InfantilMaternidadActionPerformed

    private void CuidadoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuidadoPersonalActionPerformed
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
            ControladorProducto c = new ControladorProducto(cp, ad, adul, be, der, inf, med, nut, prev, sex);
            cp.setVisible(true);
            cp.setLocationRelativeTo(cp);
            dispose();
    }//GEN-LAST:event_CuidadoPersonalActionPerformed

    private void SexualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexualidadActionPerformed
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
            ControladorProducto c = new ControladorProducto(cp, ad, adul, be, der, inf, med, nut, prev, sex);
            sex.setVisible(true);
            sex.setLocationRelativeTo(sex);
            dispose();
    }//GEN-LAST:event_SexualidadActionPerformed

    private void BellezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BellezaActionPerformed
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
            ControladorProducto c = new ControladorProducto(cp, ad, adul, be, der, inf, med, nut, prev, sex);
            be.setVisible(true);
            be.setLocationRelativeTo(be);
            dispose();
    }//GEN-LAST:event_BellezaActionPerformed

    private void NutricionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NutricionActionPerformed
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
            ControladorProducto c = new ControladorProducto(cp, ad, adul, be, der, inf, med, nut, prev, sex);
            nut.setVisible(true);
            nut.setLocationRelativeTo(nut);
            dispose();
    }//GEN-LAST:event_NutricionActionPerformed

    private void AdultoMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdultoMayorActionPerformed
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
        IniciarSesion vista1 = new IniciarSesion();
        vista1.setVisible(true);
        dispose();
    }//GEN-LAST:event_IniciarSesionActionPerformed

    private void CarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarritoMouseClicked
        Carrito vista11 = new Carrito();
        ControladorCompra c = new ControladorCompra(vista11);
        vista11.setVisible(true);
        dispose();
    }//GEN-LAST:event_CarritoMouseClicked

    private void OfertasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfertasMouseClicked
    Ofertas of = new Ofertas();
    Admin adm = new Admin();
    ControladorOferta controladorOfertas = new ControladorOferta(adm, of);
    of.setVisible(true);
    of.setLocationRelativeTo(of);
    dispose();
    }//GEN-LAST:event_OfertasMouseClicked

    private void jBRecargarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRecargarCarritoActionPerformed
        
        DefaultTableModel modelo = new DefaultTableModel();
        ListaCarrito l = new ListaCarrito();
        
        modelo=(DefaultTableModel)jTCarrito.getModel();
        
        modelo.setRowCount(0);
        List<ListaCarrito>lista=  ControladorCarrito.listarCarrito();
        Object[]object=new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0]= lista.get(i).getId();
            object[1]= lista.get(i).getNombre();
            object[2]= lista.get(i).getPrecio();
            object[3]= lista.get(i).getPrecio_bruto();
            object[4]=lista.get(i).getCantidad();            
            modelo.addRow(object);
        }       
        jTCarrito.setModel(modelo);
    }//GEN-LAST:event_jBRecargarCarritoActionPerformed

    private void jBEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarProductoActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        modelo=(DefaultTableModel)jTCarrito.getModel();      
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
        modelo=(DefaultTableModel)jTCarrito.getModel();     
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
        t.jTNumBoleta.setText(String.valueOf(cs.buscarIdCompra()));
        t.jTPrecioTotal.setText(String.valueOf(total));
        t.jTCantidadDeProductos.setText(String.valueOf(cant_total));
       
        t.setVisible(true);
        t.setLocationRelativeTo(t);       
          
    }//GEN-LAST:event_jBCarritoComprarActionPerformed

    private void jTFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFechaActionPerformed

    private void jBCancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarCompraActionPerformed

        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo=(DefaultTableModel)jTCarrito.getModel();
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTCarrito;
    public javax.swing.JTextField jTFecha;
    // End of variables declaration//GEN-END:variables
}
