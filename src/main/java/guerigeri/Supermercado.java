/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerigeri;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ERICK
 */
public class Supermercado {
    public static void main(String[] args) {
        
        // Añadir productos
        Productos p1 = new Productos("Yogurt", 3, 3, Iva.CUATRO);
        Productos p2 = new Productos("Leche", 0.9, 2, Iva.DIEZ);
        Productos p3 = new Productos("Champú", 3.5, 1, Iva.VEINTIUNO);
        Productos p4 = new Productos("Galleta", 0.75, 2, Iva.VEINTIUNO);
        
        //Producto para añadir
        Productos p5 = new Productos("Nutella", 4, 2, Iva.DIEZ);
        
        
        List<Productos> lista = new ArrayList();
        
        // Añadir los productos en la lista
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        
//        for (Productos productos : lista) {
//            System.out.println(productos);
//        }        
        
        Cinta c = new Cinta(lista);
        
        // Método para añadir producto
        c.anadirProducto(p5);
        
        // Método para eliminar producto
        c.quitarProducto(p2);
        
        // Método para comprobar si esta vacio
        System.out.println("Productos vacios: " + c.estaVacio());
        
        // Apartado de crear la caja 
        Caja caja = new Caja(1, c);       
//        System.out.println(caja);
        
        // Método toString del ticket
//        System.out.println("sout del Ticket: ");
//        Ticket t = caja.generarTicket();
//
//        System.out.println(t.toString());
        
        // Ticket creado a partir del método statico de esta clase
        System.out.println(generarTicket(caja));        
        
    }
    
    public static Ticket generarTicket(Caja c){
        return c.generarTicket();
    }
    
}
