/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static java.lang.Integer.toString;
import static java.lang.Integer.toString;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.ListaCarrito;
import vista.Carrito;


/**
 *
 * @author Gustavo
 */
public class ControladorCarrito {
    public static List<ListaCarrito>lista = new ArrayList<ListaCarrito>();
    
    public static void agregarCarrito(ListaCarrito listaCarrito){
        lista.add(listaCarrito);
    }
    
    public static List<ListaCarrito> listarCarrito(){
        return lista;
    }
    public static String fecha(){
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        return formatoFecha.format(fechaActual);
    }
    
    


}
