
package Herencia;

public class Reptiles extends Animal {
    
  
    
    public Reptiles(String Reproduccion,String Alimentacion){
        
       super(Reproduccion, Alimentacion);
       
    }
    
    public void mostrarDatos(){
        
        System.out.println("\nReproduccion de Reptiles: "+getReproduccion()+"\nAlimentacion: "+getAlimentacion());
    }
}
