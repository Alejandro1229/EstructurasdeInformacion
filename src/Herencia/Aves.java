
package Herencia;

public class Aves extends Animal {
    
    
    public Aves(String Reproduccion,String Alimentacion){
        
        super(Reproduccion, Alimentacion);
       
    }
    
    public void mostrarDatos(){
        
        System.out.println("\nReproduccion Aves: "+getReproduccion()+"\nAlimentacion: "+getAlimentacion());
    }
    
    
}
