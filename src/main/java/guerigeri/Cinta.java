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
    
    /* Siguiendo mi logica esto tiene sentido ya que en la cinta se podrán varios productos, 
        los cuales serán almacenados en una lista que posteriormente pasara por el cajero
    */
    private List<Productos> prod;

//    public Cinta(List<Productos> prod) {
//        for (Productos productos : prod) {
//            this.prod.add(productos);
//        }
//    }

    public Cinta(List<Productos> prod) {
        this.prod = prod;
    }

    
    @Override
    public String toString() {
        
        String texto = """
                       """;
                
        // Los getter y setter de los record tienen el nombre del propio atributo
        for (Productos productos : prod) {
        texto += """
                          %s          %.2f            %.0f            %s          %.2f  \n
                      """.formatted(productos.nombre(), productos.precio(), productos.cantComprar(),
                      productos.iva().getPorcentaje(), productos.precio() * productos.cantComprar());
        }
        return texto;
    }
    
    // Métodos para el iva
    public Integer prodIVA4(){
        int contador = 0;
        for (Productos prod : prod) {
            if(prod.iva().getPorcentaje() == "4"){
                contador++;
            }
        }
        return contador;
    }
    
    public Integer prodIVA10(){
        int contador = 0;
        for (Productos prod : prod) {
            if(prod.iva().getPorcentaje() == "10"){
                contador++;
            }
        }
        return contador;
    }
    
    public Integer prodIVA21(){
        int contador = 0;
        for (Productos prod : prod) {
            if(prod.iva().getPorcentaje() == "21"){
                contador++;
            }
        }
        return contador;
    }
    
    // Método para el producto sin iva
    public double precioSinIVA4(){
        double total = 0;
        for (Productos productos : prod) {
            if(productos.iva().getPorcentaje() == "4"){
                total += productos.precio() * productos.cantComprar();
            }
        }
        
        return total;
    }
    
    public double precioSinIVA10(){
        double total = 0;
        for (Productos productos : prod) {
            if(productos.iva().getPorcentaje() == "10"){
                total += productos.precio() * productos.cantComprar();
            }
        }
        
        return total;
    }
    
    public double precioSinIVA21(){
        double total = 0;
        for (Productos productos : prod) {
            if(productos.iva().getPorcentaje() == "21"){
                total += productos.precio() * productos.cantComprar();
            }
        }
        
        return total;
    }
    
    // Métodos para los precios con iva
    public double precioConIVA4(){
        double total = 0;
        for (Productos productos : prod) {
            if(productos.iva().getPorcentaje() == "4"){
                total += (productos.precio() * productos.cantComprar()) * 1.04;
            }
        }
        
        return total;
    }
    
    public double precioConIVA10(){
        double total = 0;
        for (Productos productos : prod) {
            if(productos.iva().getPorcentaje() == "10"){
                total += (productos.precio() * productos.cantComprar()) * 1.10;
            }
        }
        
        return total;
    }
    
    public double precioConIVA21(){
        double total = 0;
        for (Productos productos : prod) {
            if(productos.iva().getPorcentaje() == "21"){
                total += (productos.precio() * productos.cantComprar()) * 1.21;
            }
        }
        
        return total;
    }
    
    public double totalPagar(){
        double total = precioConIVA4() + precioConIVA10() + precioConIVA21();
        
        return total;
    }
    
    
    // Método para añadir productos
    public void anadirProducto(Productos p){
        prod.add(p);
    }
    
    // Método para quitar productos
    public void quitarProducto(Productos p){
        prod.remove(p);
    }
    
    public boolean estaVacio(){
        boolean vacio = true;
        for (Productos productos : prod) {
            if(prod.size() > 0){
                vacio = false;
            }
        }
        return vacio;
    }

    public List<Productos> getProd() {
        return prod;
    }

    public void setProd(List<Productos> prod) {
        this.prod = prod;
    }
        
        
        
        
}
