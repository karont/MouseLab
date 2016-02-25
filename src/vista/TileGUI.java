package vista;


import java.awt.*;

import modelo.Position;
import modelo.Tile;
public class TileGUI extends javax.swing.JPanel{
    private Position posicion;
    private Tile tile;
    
   
    public TileGUI(Position p) {	
    	this.posicion = p;
    	initComponents(); 
    	//this.addMouseListener(this);
    	
    }
    public TileGUI(Tile tile,Position p) {	
    	this.tile = tile;
    	this.posicion = p;
    	initComponents(); 
    	//this.addMouseListener(this);
    	
    }
    
    public Tile getTile() {
		return tile;
	}

	public void setTile(Tile tile) {
			this.tile = tile;

	
	}

                          
    private void initComponents() {
    	this.setBounds((posicion.x * 35)+1, (posicion.y* 35)+1, 34, 34);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
        );     }          
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
       g.drawImage(tile.getBackground().getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }
    
   public Position getPosicion(){
	return this.posicion;   
   }
   
   public void setPosicion(Position p) {
	   this.posicion = p;
   }


   
}