/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

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
    
    public Oferta() {
    }

    public Oferta(int id, double descuento, String fecha_inicio, String fecha_fin, int num_producto) {
        try {           
                  
            setDescuento(descuento);
            setFecha_inicio(fecha_inicio);
            setFecha_fin(fecha_fin);
            setNum_producto(num_producto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }
    //Borré cod prod
    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if (id <= 0) {
            throw new Exception("~Error~ El código de la oferta no puede ser menor o igual a 0.");
        }
        if (id > 999999999) {
            throw new Exception("~Error~ El código es demaciado largo.");
        }
        this.id = id;
    }
    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) throws Exception {
        if (descuento >= 1) {
            throw new Exception("~Error~ El número debe ser decimal o es muy grande.");
        }
        if (descuento <= 0) {
            throw new Exception("~Error~ El descuento no puede ser igual o menor a un 0%");
        }
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

    public void setNum_producto(int num_producto) throws Exception {
        if (num_producto> 45) {
            throw new Exception("~Error~ la cantidad de productos excede el limite.");
        }
        if (num_producto <= 0) {
            throw new Exception("~Error~ la cantidad de productos está por debajo del minimo");
        }
        this.num_producto = num_producto;
    }
    
    
}
