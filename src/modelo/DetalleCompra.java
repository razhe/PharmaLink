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
public class DetalleCompra {
    private int id;
    private int cantidad;
    private double precio_neto;
    private int precio_bruto;
    private int cod_producto;
    private int cod_compra;   
    public DetalleCompra() {
    }
    public DetalleCompra(int id,int cantidad,double precio_neto,int precio_bruto,int cod_producto,int cod_compra) {
        setCantidad(cantidad);
        setId(id);
        setCod_producto(cod_producto);
        setCod_compra(cod_compra);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public int getCod_compra() {
        return cod_compra;
    }

    public void setCod_compra(int cod_compra) {
        this.cod_compra = cod_compra;
    }   

    public double getPrecio_neto() {
        return precio_neto;
    }

    public void setPrecio_neto(double precio_neto) {
        this.precio_neto = precio_neto;
    }

    public int getPrecio_bruto() {
        return precio_bruto;
    }

    public void setPrecio_bruto(int precio_bruto) {
        this.precio_bruto = precio_bruto;
    }
    
}
