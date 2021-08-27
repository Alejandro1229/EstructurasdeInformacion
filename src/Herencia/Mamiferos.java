
package Herencia;

public class Mamiferos extends Animal{
    
 
    
    
    public Mamiferos(String Reproduccion,String Alimentacion){
        
        super(Reproduccion, Alimentacion);
       
      
    }
    
    public void mostrarDatos(){
        
        System.out.println("Reproduccion Mamiferos: "+getReproduccion()+"\nAlimentacion: "+getAlimentacion());
    }
    
    
}
