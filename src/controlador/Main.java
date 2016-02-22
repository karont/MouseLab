package controlador;


import modelo.SingletonTablero;
import modelo.Tablero;
import vista.VentanaGUI;



public class Main {

    public static void main(String args[]) {
    	
    	Tablero tablero = (new SingletonTablero()).getInstance();
    	tablero.iniciar(10);
    	
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGUI().setVisible(true);


            }
        });
        
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGUI().setVisible(true);


            }
        });*/
        
    }
                        
           
    
}
