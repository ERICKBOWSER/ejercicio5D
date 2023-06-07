/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerigeri;

import java.time.LocalDate;

/**
 *
 * @author guerig
 */
public class Ticket {
    private LocalDate fechaGenerar;
    private Cinta cinta;

    public Ticket(LocalDate fechaGenerar, Cinta cinta) {
        this.fechaGenerar = fechaGenerar;
        this.cinta = cinta;
    }

    public LocalDate getFechaGenerar() {
        return fechaGenerar;
    }

    public void setFechaGenerar(LocalDate fechaGenerar) {
        this.fechaGenerar = fechaGenerar;
    }

    public Cinta getCinta() {
        return cinta;
    }

    public void setCinta(Cinta cinta) {
        this.cinta = cinta;
    }
    
    String texto = """
                   ---------------------------------------------------------
                                        Supermercado Mercadona
                   Fecha:               Hora:
                   ---------------------------------------------------------
                   Producto     Precio      Cantidad        Iva     Precio sin IVA
                   ---------------------------------------------------------
                   
                   
                   
                   
                   ---------------------------------------------------------
                   Nº prod. iva 4%:         Precio sin IVA:         Precio con IVA: 
                   Nº prod. iva 10%:        Precio sin IVA:         Precio con IVA: 
                   Nº prod. iva 21%:        Precio sin IVA:         Precio con IVA:              
                   ---------------------------------------------------------
                   Total a pagar:       -- Gracias por su visita
                   ---------------------------------------------------------                   
                   """;
    
}
