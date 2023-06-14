/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerigeri;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author guerig
 */
public class Ticket {
    private LocalDate fechaGenerar;
    private LocalTime horaGenerar;
    private Cinta cinta;
    private String texto;

    public Ticket(Cinta cinta) {
        this.fechaGenerar = LocalDate.now();
        this.horaGenerar = LocalTime.now();
        this.cinta = cinta;
        
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
    
    
    
        

    

    @Override
    public String toString() { 
        
//        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato para la fecha
//        LocalDate fecha = LocalDate.parse(fechaGenerar, formato);
        
        String fecha = fechaGenerar.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        

        texto = "--------------------------------------------------------------------------------\n" +
                "                               Supermercado Mercadona                         \n" +
                "   Fecha: " + fecha + "        Hora: " + horaGenerar.getHour() + ":" + horaGenerar.getMinute() +            "\n" +
                "   -----------------------------------------------------------------------------\n" +
                "   Producto        Precio      Cantidad        Iva     Precio sin IVA     \n" +
                "   -----------------------------------------------------------------------------\n" +
                    cinta                                                                   +
                "   -----------------------------------------------------------------------------\n" +
                "   Nº prod. iva 4%: " + cinta.prodIVA4() + "        Precio sin IVA: " + cinta.precioSinIVA4() + "        Precio con IVA: " + cinta.precioConIVA4() + "\n" +
                "   Nº prod. iva 10%: " + cinta.prodIVA10() + "        Precio sin IVA: " + cinta.precioSinIVA10() + "         Precio con IVA: " + cinta.precioConIVA10() + "\n" +
                "   Nº prod. iva 21%: " + cinta.prodIVA21() + "        Precio sin IVA: " + cinta.precioSinIVA21() + "         Precio con IVA " + cinta.precioConIVA21() + "\n" +          
                "   -----------------------------------------------------------------------------\n" +
                "   Total a pagar: " + cinta.totalPagar() + "      -- Gracias por su visita                       \n" +
                "   -----------------------------------------------------------------------------";
        
        return texto;
    }

    public LocalTime getHoraGenerar() {
        return horaGenerar;
    }

    public void setHoraGenerar(LocalTime horaGenerar) {
        this.horaGenerar = horaGenerar;
    }

    public LocalDate getFechaGenerar() {
        return fechaGenerar;
    }
    
    
    
    
    
    
    
}
