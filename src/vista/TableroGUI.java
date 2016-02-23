package vista;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import modelo.SingletonBoard;
import modelo.Board;
import modelo.Position;
public class TableroGUI extends javax.swing.JPanel implements KeyListener{

    private int size; 
    private Board tablero;
    private CasillasGUI [][] casillas;
    public TableroGUI() {
    	
    	
    	tablero = (new SingletonBoard()).getInstance();
    	size = tablero.getSize();
        initComponents();
        addKeyListener(this);
        setFocusable(true);
        setLayout(new java.awt.GridLayout(size, size));
        this.casillas = new CasillasGUI [size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
            	casillas[i][j] = new CasillasGUI(tablero.getTile(i, j), new Position(i,j));
            	this.add(casillas[i][j]);
                
            }
            
        }

    }
    
    
//    public void pintar(int x, int y){
//        this.casillas[x][y].setFondo(tocado);
//        this.repaint();
//    }
    
  
    

    
    /*public int[] getCoordenadas(CasillasGUI casilla) {
        int [] coordenadas = new int[2];
        for (int i=0; i < this.casillas.length; i++) {
            for (int j=0; j < this.casillas.length; j++) {
                if (this.casillas[i][j] == casilla) {
                    coordenadas[0] = i;
                    coordenadas[1] = j;
                }
            }
        }
        return coordenadas;
    }*/

                              
    private void initComponents() {
        setLayout(null);
        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(size*35+1, size*35+1));
    }


    @Override
    public void keyPressed(KeyEvent e) {
    	switch(e.getKeyCode()){
    	case KeyEvent.VK_W:
    		tablero.moverRatones(0, 'w');
    		break;
    	case KeyEvent.VK_S:
    		tablero.moverRatones(0, 's');
        	break;
    	case KeyEvent.VK_A:
    		tablero.moverRatones(0, 'a');
        	break;
    	case KeyEvent.VK_D:
    		tablero.moverRatones(0, 'd');
        	break;
    	}
    	
    	this.repaint();
    	
    	
    }


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

          
                     
}
