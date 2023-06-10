package Entidades;

import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.localDate;

public class AlquilerYate extends Alquiler {

    public AlquilerYate(String nombreCliente, int documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posicionAmarre, Barco barco) {
        super(nombreCliente, documentoCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
    }

    public double calcularAlquiler() {

        double moduloy = super.calcuarPrecio();
        Yate yate = (Yate) getBarco();
        double potenciaCV = yate.getPotenciaCV();
        int numCamarotes = yate.getNumCamarotes();
        return moduloy + potenciaCV + numCamarotes;
        

    }

}
