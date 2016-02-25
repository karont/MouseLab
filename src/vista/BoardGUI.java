package vista;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import modelo.Board;
import modelo.Position;
public class BoardGUI extends javax.swing.JPanel implements KeyListener{

    private int size; 
    private Board board;
    private TileGUI [][] tiling;
    public BoardGUI(Board tab) {
    	
    	this.board = tab;
    	//tablero = (new SingletonBoard()).getInstance();
    	size = board.getSize();
        initComponents();
        addKeyListener(this);
        setFocusable(true);
        setLayout(new java.awt.GridLayout(size, size));
        this.tiling = new TileGUI [size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
            	tiling[i][j] = new TileGUI(board.getTile(i, j), new Position(i,j));
            	this.add(tiling[i][j]);
                
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
    		board.moveMouse(0, 'w');
    		break;
    	case KeyEvent.VK_S:
    		board.moveMouse(0, 's');
        	break;
    	case KeyEvent.VK_A:
    		board.moveMouse(0, 'a');
        	break;
    	case KeyEvent.VK_D:
    		board.moveMouse(0, 'd');
        	break;
    	case KeyEvent.VK_SPACE:
    		board.eatCheese(0);
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
