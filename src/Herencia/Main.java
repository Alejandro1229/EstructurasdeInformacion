package Herencia;

public class Main {
    
    public static void main (String [] args ){
        
        Mamiferos mamiferos1 = new Mamiferos ("Los mamíferos habitan en toda clase de hábitats a lo largo de la superficie terrestre.","carnívoros se alimentan de la carne de otros animales");
        
        mamiferos1.mostrarDatos();
        
        Reptiles reptiles1 = new Reptiles ("Son ovíparos, es decir, se reproducen por huevos y su fecundación es interna. El macho se aparea con la hembra y se forman huevos fecundados.","La mayoría son carnívoros. En la boca suelen tener muchos dientes, todos del mismo tamaño, con los que retienen a sus presas.");
        
        reptiles1.mostrarDatos();
        
        Aves aves1 = new Aves ("Las aves son ovíparas","las aves pueden ser sumamente variada, oscilando entre néctar, frutas y vegetales, hojas y semillas.");
   
        aves1.mostrarDatos();
    }
    
    
}
