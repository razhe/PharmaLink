/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorOferta;
import controlador.ControladorProducto;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.TableModel;
import modelo.Producto;
import modelo.ProductoDAO;

/**
 *
 * @author Eduardo
 */
public class Prevencion extends javax.swing.JFrame {

    /**
     * Creates new form Prevencion
     */
    public Prevencion() {
        initComponents();
        
        //        Icono
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconox.png")).getImage());
        
        //        Titulo
        setTitle("PREVENCIÓN");
        
        //        Fondo del Jframe
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/f1.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
        //        Centrar Jframe
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTPrevencion = new javax.swing.JTable();
        jBPrev = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTPrevencion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo producto", "Nombre", "Marca", "Precio", "Fecha de Elaboración", "Fecha de vencimiento", "Dosis"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTPrevencion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPrevencionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTPrevencion);
        if (jTPrevencion.getColumnModel().getColumnCount() > 0) {
            jTPrevencion.getColumnModel().getColumn(0).setResizable(false);
            jTPrevencion.getColumnModel().getColumn(1).setResizable(false);
            jTPrevencion.getColumnModel().getColumn(2).setResizable(false);
            jTPrevencion.getColumnModel().getColumn(3).setResizable(false);
            jTPrevencion.getColumnModel().getColumn(4).setResizable(false);
            jTPrevencion.getColumnModel().getColumn(5).setResizable(false);
            jTPrevencion.getColumnModel().getColumn(6).setResizable(false);
        }

        jBPrev.setText("Cargar");

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

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jBPrev)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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
        IniciarSesion vista1 = new IniciarSesion();
        vista1.setVisible(true);
        dispose();
    }//GEN-LAST:event_IniciarSesionMouseClicked

    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
        IniciarSesion vista1 = new IniciarSesion();
        vista1.setVisible(true);
        dispose();
    }//GEN-LAST:event_IniciarSesionActionPerformed

    private void CarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarritoMouseClicked
        Carrito vista11 = new Carrito();
        vista11.setVisible(true);
        dispose();
    }//GEN-LAST:event_CarritoMouseClicked

    private void jTPrevencionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPrevencionMouseClicked
        // TODO add your handling code here:
        InformacionProducto vistaInfProd = new InformacionProducto();
        
        int rowIndex = jTPrevencion.getSelectedRow();
        int selectedRow = jTPrevencion.getSelectedRow();
        
        TableModel tm = jTPrevencion.getModel();
        
        String codigo = tm.getValueAt(selectedRow, 0).toString();
        String nombre = tm.getValueAt(selectedRow, 1).toString();
        String marca = tm.getValueAt(selectedRow, 2).toString();
        String precio = tm.getValueAt(selectedRow, 3).toString();
        String dosis = tm.getValueAt(selectedRow, 6).toString();
        
        Producto prod = new Producto();
        ProductoDAO pDAO = new ProductoDAO();
        try {
            prod.setCodigo(Integer.parseInt(codigo));
            pDAO.buscarDescripcion(prod);  

            vistaInfProd.jTCodigo.setText(codigo);
            vistaInfProd.jTNomProductoInf.setText(nombre);
            vistaInfProd.jTMarcaInf.setText(marca);
            vistaInfProd.jTPrecioInf.setText(precio);
            vistaInfProd.jTDosisInf.setText(dosis);
            vistaInfProd.jTDescInfProd.setText(prod.getDescripcion_prod());
            vistaInfProd.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jTPrevencionMouseClicked

    private void OfertasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfertasMouseClicked
        Ofertas of = new Ofertas();
        Admin adm = new Admin();
        ControladorOferta controladorOfertas = new ControladorOferta(adm, of);
        of.setVisible(true);
        of.setLocationRelativeTo(of);
    }//GEN-LAST:event_OfertasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
    public javax.swing.JButton jBPrev;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTPrevencion;
    // End of variables declaration//GEN-END:variables
}
