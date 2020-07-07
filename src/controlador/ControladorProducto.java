/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.ListaCarrito;
import modelo.Producto;
import modelo.ProductoSQL;
import modelo.RenderTablas;
import vista.*;

/**
 *
 * @author Gustavo
 */
// Instanciando clases.
public class ControladorProducto implements ActionListener {

    ProductoSQL daoP = new ProductoSQL();
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
    InformacionProducto infProd = new InformacionProducto();

//Constructor para instanciar funciones de las vitas(botones de ejecucion de formularios).
    public ControladorProducto(CuidadoPersonal CuidP, Admin ad, AdultoMayor adMayor, Belleza belleza, Dermocosmetica dermo, Infantil infantil, Medicamentos medic,
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
        if (e.getSource() == admin.BTAgregar) {
            try {
                if (admin.jCCodCategoria.getSelectedItem() == "Seleccione") {
                    throw new Exception("~Error~ Debe ingresar una categoría");
                }
                if (admin.jCCodCategoria.getSelectedItem() == "Prevencion") {
                    prod.setCodigocategoria("1");
                }
                if (admin.jCCodCategoria.getSelectedItem() == "Medicamentos") {
                    prod.setCodigocategoria("2");
                }
                if (admin.jCCodCategoria.getSelectedItem() == "Dermocosmética") {
                    prod.setCodigocategoria("3");
                }
                if (admin.jCCodCategoria.getSelectedItem() == "Infantíl y maternidad") {
                    prod.setCodigocategoria("4");
                }
                if (admin.jCCodCategoria.getSelectedItem() == "Cuidado personal") {
                    prod.setCodigocategoria("5");
                }
                if (admin.jCCodCategoria.getSelectedItem() == "Sexualidad") {
                    prod.setCodigocategoria("6");
                }
                if (admin.jCCodCategoria.getSelectedItem() == "Belleza") {
                    prod.setCodigocategoria("7");
                }
                if (admin.jCCodCategoria.getSelectedItem() == "Nutrición y vitaminas") {
                    prod.setCodigocategoria("8");
                }
                if (admin.jCCodCategoria.getSelectedItem() == "Adulto mayor") {
                    prod.setCodigocategoria("9");
                }
            } catch (Exception ex) {
            }
            agregar();
        }
        //Listar productos
        if (e.getSource() == cp.BTListarProdCuidado) {
            try {
                //            listarCuid(cp.JTCuidadoPersonal);
                visualizar_tabla(cp.JTCuidadoPersonal);
            } catch (Exception ex) {
                System.out.println("Error al visualizar la tabla cuidado personal (Controlador)");
            }
        }
        if (e.getSource() == adul.jBAdulto) {
            try {
                visualizar_tabla_adul(adul.jTaAdultoMayor);
            } catch (Exception ex) {
                System.out.println("Error al visualizar la tabla Adulto mayor (Controlador)");
            }
        }
        if (e.getSource() == be.jBBelleza) {
            try {
                visualizar_tabla_bell(be.jTaBelleza);
            } catch (Exception ex) {
                System.out.println("Error al visualizar la tabla belleza (Controlador)");
            }
        }
        if (e.getSource() == der.jBDermo) {
            try {
                visualizar_tabla_der(der.jTaDermoCosmetica);
            } catch (Exception ex) {
                System.out.println("Error al visualizar la tabla Dermocosmetica (Controlador)");

            }

        }
        if (e.getSource() == inf.jBInfantil) {
            try {
                visualizar_tabla_inf(inf.jTaInfantil);
            } catch (Exception ex) {
                System.out.println("Error al visualizar la tabla infantil y maternidad (Controlador");
            }

        }
        if (e.getSource() == med.jBMeds) {
            try {
                visualizar_tabla_med(med.jTMedicamentos);
            } catch (Exception ex) {
                System.out.println("Error al visualizar la tabla medicamentos (Controlador)");
            }

        }
        if (e.getSource() == nut.jBNutri) {
            try {
                visualizar_tabla_nut(nut.jTNutricion);
            } catch (Exception ex) {
                System.out.println("Error al visualizar la tabla Nutrición (controlador)");
            }

        }
        if (e.getSource() == prev.jBPrev) {
            try {
                visualizar_tabla_prev(prev.jTPrevencion);
            } catch (Exception ex) {
                System.out.println("Error al visualizar la tabla prevencion (controlador)");
            }

        }
        if (e.getSource() == sex.jBSexualidad) {
            try {
                visualizar_tabla_sex(sex.jTSexualidad);
            } catch (Exception ex) {
                System.out.println("Error al visualizar la tabla sexualidad (controlador)");
            }

        }
        //Modificar productos
        if (e.getSource() == admin.BTModificar) {
            actualizar();
        }
        //Borrar productos
        if (e.getSource() == admin.BTEliminar) {
            eliminar();
        }
        //Buscar
        if (e.getSource() == admin.BtBuscar) {
            buscar();
            try {
                buscarImagen();
            } catch (Exception ex) {
                System.out.println("Error al cargar img al lbl (controlador)" + ex.getMessage());
            }
            
        }

    }

    //Experimental

    public void visualizar_tabla(JTable JTCuidadoPersonal) throws ClassNotFoundException, SQLException {

        JTCuidadoPersonal.setDefaultRenderer(Object.class, new RenderTablas());

        ResultSet rs = daoP.visualizar_cuid();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("marca");
        modelo.addColumn("precio");
        modelo.addColumn("Fecha elaboración");
        modelo.addColumn("Fecha de vencimiento");
        modelo.addColumn("dosis");
        modelo.addColumn("foto");
        try {
            while (rs.next()) {
                Object[] fila = new Object[8];
                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                fila[2] = rs.getObject(3);
                fila[3] = rs.getObject(4);
                fila[4] = rs.getObject(5);
                fila[5] = rs.getObject(6);
                fila[6] = rs.getObject(7);
                Blob blob = rs.getBlob(8);
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e) {

                }
                ImageIcon icono = new ImageIcon(img);
                fila[7] = new JLabel(icono);
                modelo.addRow(fila);
            }
            JTCuidadoPersonal.setModel(modelo);
            JTCuidadoPersonal.setRowHeight(150);
        } catch (Exception e) {
            System.out.println("Error al visualizar la tabla");
        }
    }

    public void visualizar_tabla_prev(JTable jTPrevencion) throws ClassNotFoundException, SQLException {

        jTPrevencion.setDefaultRenderer(Object.class, new RenderTablas());

        ResultSet rs = daoP.visualizar_prev();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("marca");
        modelo.addColumn("precio");
        modelo.addColumn("Fecha elaboración");
        modelo.addColumn("Fecha de vencimiento");
        modelo.addColumn("dosis");
        modelo.addColumn("foto");
        try {
            while (rs.next()) {
                Object[] fila = new Object[8];
                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                fila[2] = rs.getObject(3);
                fila[3] = rs.getObject(4);
                fila[4] = rs.getObject(5);
                fila[5] = rs.getObject(6);
                fila[6] = rs.getObject(7);
                Blob blob = rs.getBlob(8);
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e) {

                }
                ImageIcon icono = new ImageIcon(img);
                fila[7] = new JLabel(icono);
                modelo.addRow(fila);
            }
            jTPrevencion.setModel(modelo);
            jTPrevencion.setRowHeight(150);
        } catch (Exception e) {
            System.out.println("Error al visualizar la tabla");
        }
    }

    public void visualizar_tabla_med(JTable jTMedicamentos) throws ClassNotFoundException, SQLException {

        jTMedicamentos.setDefaultRenderer(Object.class, new RenderTablas());

        ResultSet rs = daoP.visualizar_med();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("marca");
        modelo.addColumn("precio");
        modelo.addColumn("Fecha elaboración");
        modelo.addColumn("Fecha de vencimiento");
        modelo.addColumn("dosis");
        modelo.addColumn("foto");
        try {
            while (rs.next()) {
                Object[] fila = new Object[8];
                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                fila[2] = rs.getObject(3);
                fila[3] = rs.getObject(4);
                fila[4] = rs.getObject(5);
                fila[5] = rs.getObject(6);
                fila[6] = rs.getObject(7);
                Blob blob = rs.getBlob(8);
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e) {

                }
                ImageIcon icono = new ImageIcon(img);
                fila[7] = new JLabel(icono);
                modelo.addRow(fila);
            }
            jTMedicamentos.setModel(modelo);
            jTMedicamentos.setRowHeight(150);
        } catch (Exception e) {
            System.out.println("Error al visualizar la tabla");
        }
    }

    public void visualizar_tabla_bell(JTable jTaBelleza) throws ClassNotFoundException, SQLException {

        jTaBelleza.setDefaultRenderer(Object.class, new RenderTablas());

        ResultSet rs = daoP.visualizar_bell();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("marca");
        modelo.addColumn("precio");
        modelo.addColumn("Fecha elaboración");
        modelo.addColumn("Fecha de vencimiento");
        modelo.addColumn("dosis");
        modelo.addColumn("foto");
        try {
            while (rs.next()) {
                Object[] fila = new Object[8];
                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                fila[2] = rs.getObject(3);
                fila[3] = rs.getObject(4);
                fila[4] = rs.getObject(5);
                fila[5] = rs.getObject(6);
                fila[6] = rs.getObject(7);
                Blob blob = rs.getBlob(8);
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e) {

                }
                ImageIcon icono = new ImageIcon(img);
                fila[7] = new JLabel(icono);
                modelo.addRow(fila);
            }
            jTaBelleza.setModel(modelo);
            jTaBelleza.setRowHeight(150);
        } catch (Exception e) {
            System.out.println("Error al visualizar la tabla");
        }
    }

    public void visualizar_tabla_adul(JTable jTaAdultoMayor) throws ClassNotFoundException, SQLException {

        jTaAdultoMayor.setDefaultRenderer(Object.class, new RenderTablas());

        ResultSet rs = daoP.visualizar_adul();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("marca");
        modelo.addColumn("precio");
        modelo.addColumn("Fecha elaboración");
        modelo.addColumn("Fecha de vencimiento");
        modelo.addColumn("dosis");
        modelo.addColumn("foto");
        try {
            while (rs.next()) {
                Object[] fila = new Object[8];
                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                fila[2] = rs.getObject(3);
                fila[3] = rs.getObject(4);
                fila[4] = rs.getObject(5);
                fila[5] = rs.getObject(6);
                fila[6] = rs.getObject(7);
                Blob blob = rs.getBlob(8);
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e) {

                }
                ImageIcon icono = new ImageIcon(img);
                fila[7] = new JLabel(icono);
                modelo.addRow(fila);
            }
            jTaAdultoMayor.setModel(modelo);
            jTaAdultoMayor.setRowHeight(150);
        } catch (Exception e) {
            System.out.println("Error al visualizar la tabla");
        }
    }

    public void visualizar_tabla_der(JTable jTaDermoCosmetica) throws ClassNotFoundException, SQLException {

        jTaDermoCosmetica.setDefaultRenderer(Object.class, new RenderTablas());

        ResultSet rs = daoP.visualizar_dermo();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("marca");
        modelo.addColumn("precio");
        modelo.addColumn("Fecha elaboración");
        modelo.addColumn("Fecha de vencimiento");
        modelo.addColumn("dosis");
        modelo.addColumn("foto");
        try {
            while (rs.next()) {
                Object[] fila = new Object[8];
                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                fila[2] = rs.getObject(3);
                fila[3] = rs.getObject(4);
                fila[4] = rs.getObject(5);
                fila[5] = rs.getObject(6);
                fila[6] = rs.getObject(7);
                Blob blob = rs.getBlob(8);
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e) {

                }
                ImageIcon icono = new ImageIcon(img);
                fila[7] = new JLabel(icono);
                modelo.addRow(fila);
            }
            jTaDermoCosmetica.setModel(modelo);
            jTaDermoCosmetica.setRowHeight(150);
        } catch (Exception e) {
            System.out.println("Error al visualizar la tabla");
        }
    }

    public void visualizar_tabla_inf(JTable jTaInfantil) throws ClassNotFoundException, SQLException {

        jTaInfantil.setDefaultRenderer(Object.class, new RenderTablas());

        ResultSet rs = daoP.visualizar_inf_mat();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("marca");
        modelo.addColumn("precio");
        modelo.addColumn("Fecha elaboración");
        modelo.addColumn("Fecha de vencimiento");
        modelo.addColumn("dosis");
        modelo.addColumn("foto");
        try {
            while (rs.next()) {
                Object[] fila = new Object[8];
                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                fila[2] = rs.getObject(3);
                fila[3] = rs.getObject(4);
                fila[4] = rs.getObject(5);
                fila[5] = rs.getObject(6);
                fila[6] = rs.getObject(7);
                Blob blob = rs.getBlob(8);
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e) {

                }
                ImageIcon icono = new ImageIcon(img);
                fila[7] = new JLabel(icono);
                modelo.addRow(fila);
            }
            jTaInfantil.setModel(modelo);
            jTaInfantil.setRowHeight(150);
        } catch (Exception e) {
            System.out.println("Error al visualizar la tabla");
        }
    }

    public void visualizar_tabla_nut(JTable jTNutricion) throws ClassNotFoundException, SQLException {

        jTNutricion.setDefaultRenderer(Object.class, new RenderTablas());

        ResultSet rs = daoP.visualizar_nut();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("marca");
        modelo.addColumn("precio");
        modelo.addColumn("Fecha elaboración");
        modelo.addColumn("Fecha de vencimiento");
        modelo.addColumn("dosis");
        modelo.addColumn("foto");
        try {
            while (rs.next()) {
                Object[] fila = new Object[8];
                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                fila[2] = rs.getObject(3);
                fila[3] = rs.getObject(4);
                fila[4] = rs.getObject(5);
                fila[5] = rs.getObject(6);
                fila[6] = rs.getObject(7);
                Blob blob = rs.getBlob(8);
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e) {

                }
                ImageIcon icono = new ImageIcon(img);
                fila[7] = new JLabel(icono);
                modelo.addRow(fila);
            }
            jTNutricion.setModel(modelo);
            jTNutricion.setRowHeight(150);
        } catch (Exception e) {
            System.out.println("Error al visualizar la tabla");
        }
    }

    public void visualizar_tabla_sex(JTable jTSexualidad) throws ClassNotFoundException, SQLException {

        jTSexualidad.setDefaultRenderer(Object.class, new RenderTablas());

        ResultSet rs = daoP.visualizar_sex();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("marca");
        modelo.addColumn("precio");
        modelo.addColumn("Fecha elaboración");
        modelo.addColumn("Fecha de vencimiento");
        modelo.addColumn("dosis");
        modelo.addColumn("foto");
        try {
            while (rs.next()) {
                Object[] fila = new Object[8];
                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                fila[2] = rs.getObject(3);
                fila[3] = rs.getObject(4);
                fila[4] = rs.getObject(5);
                fila[5] = rs.getObject(6);
                fila[6] = rs.getObject(7);
                Blob blob = rs.getBlob(8);
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e) {

                }
                ImageIcon icono = new ImageIcon(img);
                fila[7] = new JLabel(icono);
                modelo.addRow(fila);
            }
            jTSexualidad.setModel(modelo);
            jTSexualidad.setRowHeight(150);
        } catch (Exception e) {
            System.out.println("Error al visualizar la tabla");
        }
    }
    public void buscarImagen() throws Exception{        
         admin.lblimagen.setIcon(daoP.buscarImagen(Integer.parseInt(admin.jTextFieldCodigo.getText())));
    }

    //Actualizar registro de tabla.   

    public void actualizar() {

        try {
            prod.setCodigo(Integer.parseInt(admin.jTextFieldCodigo.getText()));
            prod.setNombre(admin.jTextFieldNombre.getText());
            prod.setMarca(admin.jTextFieldMarca.getText());
            prod.setValor_peso(Integer.parseInt(admin.jTextFieldPrecio.getText()));
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            prod.setFecha_fabri(formatoFecha.format(admin.jDFecha_fab.getDate()));
            prod.setFecha_venc(formatoFecha.format(admin.jDFecha_venc.getDate()));
            prod.setDosis(admin.jTextFieldDosis.getText());
            prod.setDescripcion_prod(admin.jTDescripcion.getText());
            prod.setCodigo_oferta(Integer.parseInt(admin.jTCodOferta.getText()));
            prod.setRuta(admin.lblurl.getText());
            daoP.actualizar(prod);
            //Limpiar casillas de texto
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            //Limpiar casillas de texto
            limpiar();
        }
    }

    //Eliminar registro de tabla.

    public void eliminar() {
        try {
            prod.setCodigo(Integer.parseInt(admin.jTextFieldCodigo.getText()));
            daoP.eliminar(prod);
            JOptionPane.showMessageDialog(null, "Registro eliminado");
            //Limpiar casillas de texto
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            //Limpiar casillas de texto
            limpiar();
        }
    }

    public void buscar() {
        try {

            prod.setCodigo(Integer.parseInt(admin.jTextFieldCodigo.getText()));

            daoP.buscar(prod);
            //De volviendo la información a las casillas
            admin.jTextFieldNombre.setText(prod.getNombre());
            admin.jTextFieldMarca.setText(prod.getMarca());
            admin.jTextFieldPrecio.setText(String.valueOf(prod.getValor_peso()));
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            admin.jDFecha_fab.setDate(formato.parse(prod.getFecha_fabri()));
            admin.jDFecha_venc.setDate(formato.parse(prod.getFecha_venc()));
            admin.jTextFieldDosis.setText(prod.getDosis());
            if (prod.getCodigocategoria().equals("1")) {
                admin.jCCodCategoria.setSelectedItem("Prevencion");
            }
            if (prod.getCodigocategoria().equals("2")) {
                admin.jCCodCategoria.setSelectedItem("Medicamento");
            }
            if (prod.getCodigocategoria().equals("3")) {
                admin.jCCodCategoria.setSelectedItem("Dermocosmética");
            }
            if (prod.getCodigocategoria().equals("4")) {
                admin.jCCodCategoria.setSelectedItem("Infantíl y maternidad");
            }
            if (prod.getCodigocategoria().equals("5")) {
                admin.jCCodCategoria.setSelectedItem("Cuidado personal");
            }
            if (prod.getCodigocategoria().equals("6")) {
                admin.jCCodCategoria.setSelectedItem("Sexualidad");
            }
            if (prod.getCodigocategoria().equals("7")) {
                admin.jCCodCategoria.setSelectedItem("Belleza");
            }
            if (prod.getCodigocategoria().equals("8")) {
                admin.jCCodCategoria.setSelectedItem("Nutrición y vitaminas");
            }
            if (prod.getCodigocategoria().equals("9")) {
                admin.jCCodCategoria.setSelectedItem("Adulto mayor");
            }
            admin.jTCodOferta.setText(String.valueOf(prod.getCodigo_oferta()));
            admin.jTDescripcion.setText(prod.getDescripcion_prod());
            
            admin.lblimagen.setIcon(new ImageIcon(prod.getRuta()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            //Limpiar casillas de texto
            
        }
    }

    //metodo Agregar productos
    public void agregar() {
        try {
            prod.setCodigo(Integer.parseInt(admin.jTextFieldCodigo.getText()));
            prod.setNombre(admin.jTextFieldNombre.getText());
            prod.setMarca(admin.jTextFieldMarca.getText());
            prod.setValor_peso(Integer.parseInt(admin.jTextFieldPrecio.getText()));
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            prod.setFecha_fabri(formatoFecha.format(admin.jDFecha_fab.getDate()));
            prod.setFecha_venc(formatoFecha.format(admin.jDFecha_venc.getDate()));
            prod.setDosis(admin.jTextFieldDosis.getText());
            prod.setCodigo_oferta(Integer.parseInt(admin.jTCodOferta.getText()));
            prod.setDescripcion_prod(admin.jTDescripcion.getText());
            prod.setRuta(admin.lblurl.getText());
            daoP.agregar(prod);
            JOptionPane.showMessageDialog(null, "Registro agregado");
            //Limpiar casillas de texto
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Error: " + e.getMessage());
            //Limpiar casillas de texto
            //limpiar();
        }

    }

    public void limpiar() {
        admin.jTextFieldCodigo.setText(null);
        admin.jTextFieldNombre.setText(null);
        admin.jTextFieldMarca.setText(null);
        admin.jTextFieldPrecio.setText(null);
        admin.jDFecha_fab.setCalendar(null);
        admin.jDFecha_venc.setCalendar(null);
        admin.jTextFieldDosis.setText(null);
        admin.jCCodCategoria.setSelectedItem("Seleccione");
        admin.jTCodOferta.setText(null);
        admin.jTDescripcion.setText(null);
        admin.lblimagen.setIcon(null);
        admin.lblurl.setText(null);
    }
    

}
