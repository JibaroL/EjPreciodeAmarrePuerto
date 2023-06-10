
package Entidades;

import java.time.LocalDate;

public class AlquilerBarcoMotor extends Alquiler {

    public AlquilerBarcoMotor(String nombreCliente, int documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posicionAmarre, Barco barco) {
        super(nombreCliente, documentoCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
    }
    

public double calcularAlquilerbar(){
    
    double modulob = super.calcuarPrecio();
    
    BarcoMotor barco = (BarcoMotor) getBarco ();
    double potenciaCV = barco.getPotenciaCV(); 
    return modulob + potenciaCV; 
    
    
}
}
