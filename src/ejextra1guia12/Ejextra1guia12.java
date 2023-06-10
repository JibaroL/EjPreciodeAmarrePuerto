/*En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler*/
package ejextra1guia12;

import Entidades.AlquilarVelero;
import Entidades.Alquiler;
import Entidades.AlquilerBarcoMotor;
import Entidades.AlquilerYate;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.time.Month;

public class Ejextra1guia12 {

    public static void main(String[] args) {

        Velero velero = new Velero(3, "1234", 30, 1994);
        BarcoMotor barcoMotor = new BarcoMotor("V54", 10.5, 2000, 2);
        Yate yate = new Yate("z254", 15.0, 2017, 400.0, 3);

    AlquilarVelero alquilerVelero = new AlquilarVelero("Jony Perez", 264515455, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 8), "Amarre 1", velero);
    
    AlquilerBarcoMotor alquilerBarcoMotor = new AlquilerBarcoMotor("Marie Smith", 95245452, LocalDate.of(2023, 6, 1), LocalDate.of(2023,06, 8), "Amarre 2", barcoMotor); 
        
    AlquilerYate alquilerYate = new AlquilerYate("Pedrito Lacost", 27458785, LocalDate.of(2023,6,1), LocalDate.of(2023,6, 1), "Amarre 3", yate);     
        
     double precioVelero = alquilerVelero.calcularAlquiler();
     double precioBarcoMotor = alquilerBarcoMotor.calcularAlquilerbar();
     double precioYate = alquilerYate.calcularAlquiler();
     
        System.out.println("                 EL PRECIO POR DIA PARA AMARRAR EN PUERTO ES: ");
     
        System.out.println("Para Velero: $" + precioVelero); 
        System.out.println("------------");
        System.out.println("Para Barco a Motor:  $" + precioBarcoMotor);
        System.out.println("------------");
        System.out.println("Para amarrar Yate:  $" + precioYate);
        
        
      
        
        
    }
    

}
