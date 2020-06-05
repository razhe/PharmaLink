/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import vista.Carrito;

/**
 *
 * @author Gustavo
 */
public class Compra {
    private int id_compra;
    private String fecha;
    private int bruto;
    private int neto;
    private int cod_tipo_pago;
    private int cod_desc;
    private int idusuario;
    

    public Compra() {
    }

    public Compra(int id_compra, String fecha, int bruto, int neto, int cod_tipo_pago, int cod_desc, int idusuario) {
        setId_compra(id_compra);
        setFecha(fecha);
        setBruto(bruto);
        setNeto(neto);
        setCod_tipo_pago(cod_tipo_pago);
        setCod_desc(cod_desc);
        setIdusuario(idusuario);      
    }


    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {       
        this.fecha = fecha;
    }

    public int getBruto() {
        return bruto;
    }

    public void setBruto(int bruto) {
        this.bruto = bruto;
    }

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }

    public int getCod_tipo_pago() {            
        return cod_tipo_pago;
    }

    public void setCod_tipo_pago(int cod_tipo_pago) {
        
        this.cod_tipo_pago = cod_tipo_pago;
        
    }

    public int getCod_desc() {
        return cod_desc;
    }

    public void setCod_desc(int cod_desc) {
        this.cod_desc = cod_desc;
    }

    public int getIdusuario() {
        return 1;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    
    
    
}
