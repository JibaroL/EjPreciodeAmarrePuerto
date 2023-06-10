package Entidades;

import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.localDate;

public class AlquilarVelero extends Alquiler {
private Velero velero;
    public AlquilarVelero(String nombreCliente, int documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posicionAmarre, Velero velero) {
        super(nombreCliente, documentoCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, velero);
       this.velero = velero; 
    }

    
  public double calcularAlquiler(){
      
      
      double modulov = super.calcuarPrecio(); 
      Velero velero = (Velero) getBarco();
      int numMastiles = velero.getNumMastiles();
      return modulov + numMastiles; 
      
  }
      
  

}

    
