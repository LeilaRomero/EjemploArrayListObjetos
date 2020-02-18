package ejemploarraylistobjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Leila
 */
public class pedirDato {
    
    private final int numero=0;
    
    public static int pedirInt(){
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Pon un numero"));
        return numero;
    }
    
     public static int pedirInt(String mensaje){
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return numero;
    }
    
    public static String pedirString(){
        
       String datos = (JOptionPane.showInputDialog("Pon un dato"));
        return datos; 
    }
    
     public static String pedirString(String mensaje){
        
       String datos = (JOptionPane.showInputDialog(mensaje));
        return datos; 
    }
}
