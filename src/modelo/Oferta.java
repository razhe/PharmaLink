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
public class Oferta {
    private int id;
    private double descuento;
    private String fecha_inicio;
    private String fecha_fin;
    private int num_producto;
    private int id_producto;
    public Oferta() {
    }

    public Oferta(int id, double descuento, String fecha_inicio, String fecha_fin, int num_producto) {
        setId(id);        
        setDescuento(descuento);
        setFecha_inicio(fecha_inicio);
        setFecha_fin(fecha_fin);
        setNum_producto(num_producto);
        setId_producto(id_producto);
    }

    public int getId_producto(){
        return id_producto;
    }
    public void setId_producto(int id_producto){
        this.id_producto = id_producto;
    }
            
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getNum_producto() {
        return num_producto;
    }

    public void setNum_producto(int num_producto) {
        this.num_producto = num_producto;
    }
    
    
}
