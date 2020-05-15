/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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

    public Producto() {
    }

    public Producto(int codigo, String nombre, String marca, int valor_peso, String fecha_fabri, String fecha_venc, String dosis) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.valor_peso = valor_peso;
        this.fecha_fabri = fecha_fabri;
        this.fecha_venc = fecha_venc;
        this.dosis = dosis;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getValor_peso() {
        return valor_peso;
    }

    public void setValor_peso(int valor_peso) {
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

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    
    
    

}
