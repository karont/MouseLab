package vista;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import modelo.Entidad;
import modelo.Posicion;
public class CasillasGUI extends javax.swing.JPanel implements MouseListener{
    private ImageIcon fondo;
    private Posicion posicion;
    private Entidad entidad;
    
    public CasillasGUI(Posicion p) {
    	this.posicion = p;
    	initComponents(); 
    	
    }
    
    public CasillasGUI(Entidad entidad) {	
    	this.entidad = entidad;
    	this.posicion = entidad.getPosicion();
    	initComponents(); 
    	//this.addMouseListener(this);
    	
    }
    
    public CasillasGUI(Entidad entidad,Posicion p) {	
    	this.entidad = entidad;
    	this.posicion = p;
    	initComponents(); 
    	//this.addMouseListener(this);
    	
    }
    
    public Entidad getEntidad() {
		return entidad;
	}

	public void setEntidad(Entidad entidad) {
		if(entidad != null){
			this.entidad = entidad;
			//this.posicion = entidad.getPosicion();
		}
		else{
			this.entidad = null;
		}
	
	}

	public void setFondo(ImageIcon fondo){
        this.fondo = fondo;
    }
    
    public ImageIcon getFondo(){        
        return this.fondo;
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
        if(posicion.x==2 && posicion.y==2){
        	int i;
        	i=1;}
        if(entidad == null)
        	g.drawImage(fondo.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
        else
        	g.drawImage(entidad.getFondo().getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }
    
   public Posicion getPosicion(){
	return this.posicion;   
   }
   
   public void setPosicion(Posicion p) {
	   this.posicion = p;
   }

@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent arg0) {
	System.out.println("ola");
	
}

@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

   
}