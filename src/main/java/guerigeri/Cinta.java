/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerigeri;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guerig
 */
public class Cinta {
    
    // Método para añadir productos
    public List<Productos> anadirProducto(Productos p){
        // List para añadir los productos
        List<Productos> lista = new ArrayList();
        
        // Añadir productos
        lista.add(p);
        
        return lista;
    }
    
    // Método para quitar productos
    public List<Productos> quitarProductos(List<Productos> p, Productos prod){
        List<Productos> lista = p;
        
        // Usamos el método remove para eliminar el producto que se le ha pasado de la lista
        lista.remove(prod);
        
        return lista;
    }
    
    public boolean estaVacio(List<Productos> p){
        List<Productos> lista = p;
        boolean resultado = false; // Para almacenar el resultado
        
        // Dependiendo de si la lista esta vacía o no devuelve un resultado u otro
        if(lista.isEmpty()){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
        
        
        
        
}
