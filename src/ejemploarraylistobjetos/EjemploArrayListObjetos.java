package ejemploarraylistobjetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Leila
 */
public class EjemploArrayListObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Opcion;
        ArrayList <Jugador>listaJugadores = new ArrayList();
        ActualizarArrayList obj= new ActualizarArrayList();

        do {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***"
                    + "\n 1 -- Crear jugador"
                    + "\n 2 -- Visualizar jugadores"
                    + "\n 3 -- Buscar por dorsal"
                    + "\n 4 -- Dar de baja"
                    + "\n 5 -- "
                    + "\n 6 -- "
                    + "\n 7 -- "
                    + "\n 8 -- "
                    + "\n 9 -- "
                    + "\n 10 -- Salir"));
            switch (Opcion) {
                case 1:
                    listaJugadores.add(obj.crearJugador());
                    break;
                case 2:
                    obj.mostar(listaJugadores);
                    break;
                case 3:
                    obj.buscarElemento(listaJugadores);
                    break;
                case 4:
                    obj.darDeBaja(listaJugadores);
                    break;
                case 5:
                    
                    break;
                /*case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 10:
                    */
            }
        } while (Opcion < 10);
        
        
    }
    
}
