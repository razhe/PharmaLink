/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import vista.InformacionProducto;

/**
 *
 * @author Gustavo
 */
public class ListaCarrito {
    private String id;
    private String nombre;
    private int precio;
    private int precio_bruto;
    private int cantidad;

    public ListaCarrito() {
    }
    public ListaCarrito(String id,String nombre, int precio,int precio_bruto ,int cantidad) {
        setId(id);
        setNombre(nombre);
        setPrecio(precio);
        setPrecio_bruto(precio_bruto);
        setCantidad(cantidad);
           
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {            
        this.precio =  (int) (precio - (precio*0.19));
    }
    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio_bruto(int precio_bruto) {
              
        this.precio_bruto = precio_bruto;
    }

    public int getPrecio_bruto() {
        return precio_bruto;
    }
    


    
}
