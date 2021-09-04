
package co.edu.ucundinamarca.tallern;

/**
Jorge Alejandro Manrique Molina
Grado: 401
 */


import org.apache.log4j.Logger;

public class Main2 {
    
    static Logger log = Logger.getLogger(Juego1.class.getName());
    
    public static  void main (String[] args){
        
        
        
        Juego1 objMuestraVidas = new Juego1 ();
        objMuestraVidas.muestraVidasRestantes();
        
        Juego1 objQuitaVida = new Juego1();
        objQuitaVida.quitarVidas();
        
        Juego1 objMuestraVidasW = new Juego1 ();
        objMuestraVidasW = new Juego1 ();
        
        Juego1 objActualR = new Juego1 ();
        objActualR.actualizaRecord();
        
        Juego1 objreiniciaPartida = new Juego1 ();
        objreiniciaPartida = new Juego1 ();
        
        
    }
    
    
}
