package Entidades;

public class BarcoMotor extends Barco {

    private double potenciaCV;

  
    public BarcoMotor(String matricula, double eslora, int anioFabricacion, double potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }
public double getModulo(){
    
    
    return getEslora()*10+ potenciaCV;
    
}
    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    }
