
package Main;

import java.util.ArrayList;
import logica.Mascota;
import vista.Historia;

public class Main {
    
    
    public static void main(String[] args) {
        
        //ArrayList<Persona> personas = new ArrayList<Persona>();
    
        //Persona persona1 = new Persona("Juan Carlos", "Soto Rivas", "Masculino", "102114545", "25","Cra aaaaa", "32016548");
    
        //personas.add(persona1);
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historia().setVisible(true);
            }
        });
    }
}
