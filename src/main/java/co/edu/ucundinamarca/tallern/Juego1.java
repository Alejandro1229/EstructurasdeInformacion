
package co.edu.ucundinamarca.tallern;

import java.util.logging.Logger;

/**
Jorge Alejandro Manrique Molina 
Grado: 401
 */

public class Juego1 {
    
    static Logger log = Logger.getLogger(Juego1.class.getName());
    
    public int numvidas, record;
    
    private int numvidasI = 5;
    
    public void vidasIniciales (){
        numvidas = numvidasI;
    }
    public void quitarVidas(){
        
        numvidas = numvidas - 1;
        
        if ( numvidas == 0){
            log.info("Juego a terminado");
        }
        
    }
    public void reiniciaPartida(){
        vidasIniciales();
    }
    public void actualizaRecord(){
        if (numvidas == record){
            log.info("alcanzo record");
        }
        if(numvidas > record){
            log.info("pasa el record");
        }
    }

    public void muestraVidasRestantes (){
            
            log.info("vidas restantes = "+ numvidas);
    }
        
        public void setJuego(){
            
        }
    
}
