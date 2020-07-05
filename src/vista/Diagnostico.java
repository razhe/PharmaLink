/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCompra;
import controlador.ControladorOferta;
import controlador.ControladorProducto;
import controlador.ControladorUsuario;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Gustavo
 */
public class Diagnostico extends javax.swing.JFrame {

    /**
     * Creates new form Diagnostico
     */
    public Diagnostico() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jBDolorCabeza = new javax.swing.JButton();
        jBDolorEst = new javax.swing.JButton();
        jBInfl = new javax.swing.JButton();
        jBDolorBoca = new javax.swing.JButton();
        jBDolorEspalda = new javax.swing.JButton();
        jBFiebre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPInformacion = new javax.swing.JTextPane();
        jBTos = new javax.swing.JButton();
        jBPiel = new javax.swing.JButton();
        lblAdv = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        jBDolorCabeza.setText("Dolor de cabeza");
        jBDolorCabeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDolorCabezaActionPerformed(evt);
            }
        });

        jBDolorEst.setText("Dolor estomacal");
        jBDolorEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDolorEstActionPerformed(evt);
            }
        });

        jBInfl.setText("Inflamación corporal");
        jBInfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInflActionPerformed(evt);
            }
        });

        jBDolorBoca.setText("Dolor de boca");
        jBDolorBoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDolorBocaActionPerformed(evt);
            }
        });

        jBDolorEspalda.setText("Dolor de espalda");
        jBDolorEspalda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDolorEspaldaActionPerformed(evt);
            }
        });

        jBFiebre.setText("Fiebre");
        jBFiebre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFiebreActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTPInformacion);

        jBTos.setText("Tos");
        jBTos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTosActionPerformed(evt);
            }
        });

        jBPiel.setText("Afección a la piel");
        jBPiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPielActionPerformed(evt);
            }
        });

        lblAdv.setForeground(new java.awt.Color(204, 0, 0));
        lblAdv.setText("ADVERTENCIA:");

        jLabel1.setText("La información proporcionada es la estimada por la farmacia,");

        jLabel2.setText("y recomendamos productos que no requieran medicación");

        jLabel3.setText("Para mas información consulte a un especialista.");

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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBDolorBoca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBInfl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(3, 3, 3))
                            .addComponent(jBDolorEspalda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBFiebre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBTos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBPiel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblAdv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(248, 248, 248))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBDolorCabeza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBDolorEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(837, 837, 837))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jBDolorCabeza)
                .addGap(27, 27, 27)
                .addComponent(jBDolorEst)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBInfl)
                        .addGap(35, 35, 35)
                        .addComponent(jBDolorBoca)
                        .addGap(35, 35, 35)
                        .addComponent(jBDolorEspalda)
                        .addGap(33, 33, 33)
                        .addComponent(jBFiebre))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdv)
                    .addComponent(jLabel1))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTos)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jBPiel)
                .addContainerGap(145, Short.MAX_VALUE))
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
        ControladorUsuario c = new ControladorUsuario(vista1);
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
    }//GEN-LAST:event_OfertasMouseClicked

    private void jBDolorCabezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDolorCabezaActionPerformed
        jTPInformacion.setText("");
        jTPInformacion.setText("Los dolores de cabeza pueden tener causas que no se deben a una enfermedad subyacente."
                            + " Por ejemplo, falta de sueño, aumento incorrecto de los anteojos recetados, exposición a"
                            + " ruidos fuertes o uso de gorros o sombreros ajustados.\n"
                            + " Recomendación:\n"
                            + " Si eres mayor de 16 años 1 comprimido (500 mg de ácido acetilsalicílico) cada 4 ó 6 horas,"
                            + " si fuera necesario.");
    }//GEN-LAST:event_jBDolorCabezaActionPerformed

    private void jBDolorEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDolorEstActionPerformed
        jTPInformacion.setText("");
        jTPInformacion.setText("El dolor abdominal puede tener causas que no se deben a una enfermedad subyacente. "
                            + "Por ejemplo, constipación, gases, comer en exceso, estrés o distensión muscular.\n"
                            + "Recomendación:\n"
                            + "Le recomendamos tomar Gaviscon.\n "
                            + "La dosis normal en adultos, incluyendo ancianos y adolescentes mayores de 12 años,"
                            + " es de 1 a 2 sobres, según necesidad, 1 hora después de las comidas y antes de acostarse."
                            + " Como máximo puede tomar 8 sobres en 24 horas. Cómo tomar: Este medicamento se toma por vía oral");
        
    }//GEN-LAST:event_jBDolorEstActionPerformed

    private void jBInflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInflActionPerformed
        jTPInformacion.setText("");
        jTPInformacion.setText("Recomendacion: El ibuprofeno es un antiinflamatorio no esteroideo, utilizado frecuentemente como antipirético,"
                            + " analgésico y antiinflamatorio. \n"                           
                            + "El uso del Ibuprofeno es sin exceder de los 2,4 g diarios. Para el alivio del dolor leve a moderado y cuadros febriles,"
                            + "la dosis usual en adultos es de 400 mg cada 4 a 6 horas");
    }//GEN-LAST:event_jBInflActionPerformed

    private void jBDolorBocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDolorBocaActionPerformed
        jTPInformacion.setText("");
        jTPInformacion.setText("Recomedación: Para el dolor de muelas es el Ibuprofeno y el Nefersil"
                            + "Se ha demostrado que el Nefersil es más eficaz contra dolores / inflamaciones "
                            + "ya que al igual que el Ibuprofeno inhibe la produccion de la encimas pero este ultimo requiere de"
                            + "receta médica.\n"
                            + "en caso de comprar ibuprofeno el uso del Ibuprofeno es sin exceder de los 2,4 g diarios. Para el alivio del dolor leve a moderado y cuadros febriles,"
                            + "la dosis usual en adultos es de 400 mg cada 4 a 6 horas");
    }//GEN-LAST:event_jBDolorBocaActionPerformed

    private void jBDolorEspaldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDolorEspaldaActionPerformed
        jTPInformacion.setText("");
        jTPInformacion.setText("El dolor de espalda puede tener causas que no se deben a una enfermedad subyacente. Por ejemplo, realizar demasiado ejercicio, "
                + "levantar peso excesivo, estar sentado o acostado durante mucho tiempo,"
                + " dormir en una posición incómoda o usar una mochila inadecuada.\n" 
                + "Se recomienda consumir un analgesico, como ibuprofeno, paracetamol o naproxeno (400mg cada 4 a 6 horas en adultos, 50mg en niños) para aliviar la molestia");
    }//GEN-LAST:event_jBDolorEspaldaActionPerformed

    private void jBFiebreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFiebreActionPerformed
        jTPInformacion.setText("");
        jTPInformacion.setText("Aumento temporal de la temperatura corporal promedio, que suele ser de 37 °C, genera sudoración, sensación de frio, dolor de cabeza, perdida de apetito, debilidad general, etc.\n" +
                                "\n" +
                                "Se recomienda consumir medicamentos de venta libre tales como paracetamol (cada 4 a 6 horas) o ibuprofeno (cada 6 a 8 horas), 400mg en adultos, 50mg en niños");
    }//GEN-LAST:event_jBFiebreActionPerformed

    private void jBTosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTosActionPerformed
        jTPInformacion.setText("");
        jTPInformacion.setText("La tos puede tener causas que no se deben a una enfermedad subyacente. Por ejemplo, despejar normalmente las vías respiratorias, los irritantes, como el humo o el gas, el uso de tabaco o tragar incorrectamente alimentos o líquido, genera dificultad al hablar,\n" +
                                "al respirar, al tragar.\n" +
                                "\n" +
                                "Se recomiendo consumir medicamentos tales como aerosoles para calmar el dolor (diclocina o fenol), Analgésicos (paracetamol, ibuprofeno, naproxeno)");
    }//GEN-LAST:event_jBTosActionPerformed

    private void jBPielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPielActionPerformed
        jTPInformacion.setText("");
        jTPInformacion.setText("Cualquier cosa que irrite, obstruya o inflame la piel puede causar síntomas como enrojecimiento, hinchazón, ardor y picazón. La alergia, irritantes, su composición genética y ciertas enfermedades y problemas del sistema inmunitario pueden provocar sarpullido, urticaria y otros problemas en la piel. Muchos problemas de la piel, como el acné, también afectan su apariencia. \n" +
"\n" +
"Se recomienda utilizar cremas humectantes para utilizar en la zona problematica.");
    }//GEN-LAST:event_jBPielActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

        ReporteVista r = new ReporteVista();
        r.setVisible(true);
        r.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMenu1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diagnostico().setVisible(true);
            }
        });
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
    public javax.swing.JButton jBDolorBoca;
    public javax.swing.JButton jBDolorCabeza;
    public javax.swing.JButton jBDolorEspalda;
    public javax.swing.JButton jBDolorEst;
    public javax.swing.JButton jBFiebre;
    public javax.swing.JButton jBInfl;
    public javax.swing.JButton jBPiel;
    public javax.swing.JButton jBTos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextPane jTPInformacion;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAdv;
    // End of variables declaration//GEN-END:variables
}
