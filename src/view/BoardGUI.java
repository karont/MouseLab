package view;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import modelo.BoardControler;
import modelo.Position;
public class BoardGUI extends javax.swing.JPanel implements KeyListener{

    private int width;
    private int height;
    private BoardControler boardcontroler;
    private TileGUI [][] tiling;
    public BoardGUI(BoardControler tab) {
    	
    	this.boardcontroler = tab;
    	//tablero = (new SingletonBoard()).getInstance();
    	width = boardcontroler.getWidth();
    	height = boardcontroler.getHeight();
    	
        initComponents();
        addKeyListener(this);
        setFocusable(true);
        setLayout(new java.awt.GridLayout(width, height));
        this.tiling = new TileGUI [width][height];
        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
            	tiling[i][j] = new TileGUI(boardcontroler.getTile(i, j), new Position(i,j));
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
        setPreferredSize(new java.awt.Dimension(width*35+1, height*35+1));
    }


    @Override
    public void keyPressed(KeyEvent e) {
    	switch(e.getKeyCode()){
    	case KeyEvent.VK_W:
    		//boardcontroler.moveMouse(0, 'w');
    		//boardcontroler.moveMices();
    		break;
    	case KeyEvent.VK_S:
    		//boardcontroler.moveMouse(0, 's');
    		//boardcontroler.moveMices();
        	break;
    	case KeyEvent.VK_A:
    		//boardcontroler.moveMouse(0, 'a');
    		//boardcontroler.moveMices();
        	break;
    	case KeyEvent.VK_D:
    		//boardcontroler.moveMouse(0, 'd');
    		//boardcontroler.moveMices();
        	break;
    	case KeyEvent.VK_SPACE:
    		//boardcontroler.eatCheese(0);
    		//boardcontroler.moveMices();
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
