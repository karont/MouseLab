package controlador;


import modelo.SingletonBoard;
import modelo.Board;
import vista.VentanaGUI;



public class Main {

    public static void main(String args[]) {
    	
    	Board tablero = (new SingletonBoard()).getInstance();
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
