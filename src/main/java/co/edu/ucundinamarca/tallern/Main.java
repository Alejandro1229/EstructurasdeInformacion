
package co.edu.ucundinamarca.tallern;
import static co.edu.ucundinamarca.tallern.Juego1.log;
import org.apache.log4j.Logger;

/**
Jorge Alejandro Manrique Molina
Grado: 401
 */

public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        
        Juego1 objJuego1 = new Juego1();
        objJuego1.muestraVidasRestantes();
        
        
    }

}
