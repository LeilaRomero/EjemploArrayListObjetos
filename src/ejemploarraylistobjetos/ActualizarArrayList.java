package ejemploarraylistobjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Leila
 */
public class ActualizarArrayList {

    public Jugador crearJugador() {
        Jugador x = new Jugador(pedirDato.pedirString("nombre: "), pedirDato.pedirInt("Dorsal:"));
        return x;

    }

    public void mostar(ArrayList<Jugador> lista) {

        Iterator ju = lista.iterator();
        while (ju.hasNext()) {
            System.out.println(ju.next());
        }
    }

    public void buscarElemento(ArrayList<Jugador> lista) {
        String nombre = JOptionPane.showInputDialog("");
        for (Jugador x : lista) {
            if (nombre.equals(x.nombre)) {
                System.out.println("El jugador " + nombre + " Tiene el dorsal: " + x.dorsal);
            }
        }
    }

    /*public void buscarElementoDorsal(ArrayList<Jugador> lista) {
        int dorsal = JOptionPane.showInputDialog("");
        for (Jugador x : lista) {
            if (dorsal.equals(x.dorsal)) {
                System.out.println("El dorsal " + dorsal + " es el jugador: " + x.nombre);
            }
        }
    }*/
    
    public void darDeBaja(ArrayList<Jugador> lista) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Dorsal jugador"));
        for (int i = 0; i < lista.size(); i++) {
            if (num == lista.get(i).dorsal) {
                lista.remove(lista.get(i));
            }
        }
    }

    public void ordenar(ArrayList<Jugador> lista) {
        Collections.sort(lista);
        
    }

    public void salir() {
        System.exit(0);
    }
}
