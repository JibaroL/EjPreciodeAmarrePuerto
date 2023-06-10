
package Entidades;


public class Velero extends Barco {
    
    protected int numMastiles;

    public Velero(int numMastiles, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }
public double getModulo(){
    
    return getEslora()*10 + numMastiles; 
}
    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }
    
    
}
