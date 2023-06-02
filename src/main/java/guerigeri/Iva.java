/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerigeri;

/**
 *
 * @author guerig
 */
public enum Iva {
    CUATRO("4"), DIEZ("10"), VEINTIUNO("21");
    
    // Constructor
    private Iva(String porcentaje){ // Los enum no permiten la creación de objetos 
        this.porcentaje = porcentaje;
    }

    public String getPorcentaje(){
        return porcentaje;
    }

    private String porcentaje;
    
}
