/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ControladorProducto;
import java.awt.JobAttributes;
import javax.swing.JOptionPane;
import vista.Admin;
import vista.AdultoMayor;
import vista.Belleza;
import vista.CuidadoPersonal;
import vista.Dermocosmetica;
import vista.Infantil;
import vista.Medicamentos;
import vista.Nutricion;
import vista.Prevencion;
import vista.Sexualidad;

/**
 *
 * @author Gustavo
 */
public class Producto {
    private int codigo;
    private String nombre;
    private String marca;
    private int valor_peso;
    private String fecha_fabri;
    private String fecha_venc;   
    private String dosis;
    private String codigocategoria;
    private int codigo_oferta;
    private String descripcion_prod;
    public Producto() {
    }

    public Producto(int codigo, String nombre, String marca, int valor_peso, String fecha_fabri, String fecha_venc, String dosis, String codigocategoria,int codigo_oferta, String descripcion_prod) throws Exception {       
            setCodigo(codigo);
            setNombre(nombre);
            setMarca(marca);
            setValor_peso(valor_peso);
            setFecha_fabri(fecha_fabri);
            setFecha_venc(fecha_venc);
            setDosis(dosis);
            setCodigocategoria(codigocategoria);
            setCodigo_oferta(codigo_oferta);
            setDescripcion_prod(descripcion_prod);
             
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) throws Exception {
        if (codigo < 0 ) {
            throw new Exception ("~Error~ El Código no puede ser menor que 0.");
        }
        if (codigo > 999999999) {
            throw new Exception("~Error~ El Código es demasiado largo.");
        }
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.trim().length() > 31) {
            throw new Exception("~Error~ El nombre es muy largo.");
        }
        if (nombre.trim().length() < 1) {
            throw new Exception("~Error~ El nombre no puede ser vacio.");
        }
        this.nombre = nombre;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws Exception {
        if (marca.trim().length() > 30 ) {
            throw new Exception("~Error~ La marca es muy larga.");
        }
        if (marca.trim().length() < 1) {
            throw new Exception("~Error~ La marca no puede ser vacia.");
        }
        this.marca = marca;
 
    }

    public int getValor_peso() {
        return valor_peso;
    }

    public void setValor_peso(int valor_peso) throws Exception {
        if (valor_peso < 0) {
            throw new Exception("~Error~ El precio no puede ser negativo.");
        }
        if (valor_peso > 999999999) {
            throw new Exception("~Error~ El precio es muy alto.");
        }
        this.valor_peso = valor_peso;
    }
    public String getFecha_fabri() {
        return fecha_fabri;
    }
    public void setFecha_fabri(String fecha_fabri) {
        this.fecha_fabri = fecha_fabri;
    }
    public String getFecha_venc() {
        return fecha_venc;
    }
    public void setFecha_venc(String fecha_venc) {
        this.fecha_venc = fecha_venc;
    }
    public String getDosis() {
        
        return dosis;
    }
    public void setDosis(String dosis) throws Exception {
        if (dosis.trim().length() < 1) {
            throw new Exception("~Error~ La dosis no puede ser vacia.");
        }
        if (dosis.trim().length() > 20) {
            throw new Exception("~Error~ La dosis es muy larga.");
        }
        this.dosis = dosis;
    }
    public String getCodigocategoria() {
        return codigocategoria;
    }
    public void setCodigocategoria(String codigocategoria) throws Exception {
        this.codigocategoria = codigocategoria;    
    }
    public void setCodigo_oferta(int codigo_oferta) throws Exception {
        // quiero dejar que pueda ser null
        ProductoDAO pDAO = new ProductoDAO();
        if (codigo_oferta <= -1) {
            throw new Exception("~Error~ El código oferta no puede ser menor a 0");
        }
        if (codigo_oferta> pDAO.buscarCodOferta()) {
            throw new Exception("~Error~ El código de oferta es muy alto y no está afiliado a ninguna de estas.");
        }
        this.codigo_oferta = codigo_oferta;
    }
    public int getCodigo_oferta() {
        return codigo_oferta;
    }
    public void setDescripcion_prod(String descripcion_prod) throws Exception {
        if (descripcion_prod.trim().length() > 100) {
            throw new Exception("~Error~ La descripción excede el limite de carácteres permitidos.");
        }
        if (descripcion_prod.trim().length() <= 0) {
            throw new Exception("~Error~ La descripción no tiene carácteres suficientes.");
        }
        this.descripcion_prod = descripcion_prod;
    }
    public String getDescripcion_prod() {
        return descripcion_prod;
    }
    

    

    
    
    

}
