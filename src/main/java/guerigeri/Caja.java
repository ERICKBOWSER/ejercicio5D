/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerigeri;

/**
 *
 * @author guerig
 */
public class Caja {
    private int identificador;
    private Cinta cinta; // Será donde los clientes coloquen los productos

    public Caja(int identificador, Cinta cinta) {
        this.identificador = identificador;
        this.cinta = cinta;
    }
    
    public Ticket generarTicket(){
        // Creamos el ticket pasandole el valor de la cinta
        Ticket t = new Ticket(this.cinta);        
        return t;
    }

    @Override
    public String toString() {
        return "Caja{" + "identificador=" + identificador + ", \ncinta=" + cinta + '}';
    }
    
    
    
}
