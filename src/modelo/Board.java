package modelo;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import vista.CasillasGUI;
import vista.imagenes.CargarImagenes;

public class Board {
	private Tile[][] tablero;
	private Entitys[] entidades;
	private int size;
	
	public Board(){
	}
	
	public void iniciar(int tamaño){
    	this.size = tamaño;
    	
    	tablero = new Tile[size][size];

    	
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
            	if (tablero[i][j] == null){
            		tablero[i][j] = new Tile(TileType.VACIO);
	                
	                }
                
            }
            
        }
        entidades = new Entitys[4];

    	entidades[0] = new Mouse("amarillo",new Position(0,0),"r_Amarillo.gif",size);
    	entidades[1] = new Mouse("rojo",new Position(9,9),"r_Rojo.gif",size);
    	entidades[2] = new Mouse("azul",new Position(0,9),"r_Azul.gif",size);
    	entidades[3] = new Mouse("verde",new Position(9,0),"r_Verde.gif",size);
    	
    	
        
        tablero[0][1].setType(TileType.OBSTACULO);
    	tablero[entidades[0].getPosicion().x][entidades[0].getPosicion().y].addThings(entidades[0]);
    	tablero[entidades[1].getPosicion().x][entidades[1].getPosicion().y].addThings(entidades[1]);
    	tablero[entidades[2].getPosicion().x][entidades[2].getPosicion().y].addThings(entidades[2]);
    	tablero[entidades[3].getPosicion().x][entidades[3].getPosicion().y].addThings(entidades[3]);
    	
    	for (Entitys mouse : entidades) {
			((Mouse)mouse).setBoard(tablero);
		}
	}
	
	public Tile getTile(int i, int j){
		return tablero[i][j];
	}
	
/*
	public CasillasGUI[][] getTablero() {
		return tablero;
	}


	public void setTablero(CasillasGUI[][] tablero) {
		this.tablero = tablero;
	}


	public Entitys[] getEntidades() {
		return entidades;
	}


	public void setEntidades(Entitys[] entidades) {
		this.entidades = entidades;
	}

	*/
	public int getSize() {
		return size;
	}
	

	public void setSize(int size) {
		this.size = size;
	}
	
	public void moverRatones(int i, char direccion){
		
		Mouse r = (Mouse) entidades[i];
		tablero[r.getPosicion().x][r.getPosicion().y].removeThings(r);
		switch(direccion){
    	case 'w':
    		r.moverArriba();
    		break;
    	case 's':
    		r.moverAbajo();
    		break;
    	case 'a':
    		r.moverIzquierda();
    		break;
    	case 'd':
    		r.moverDerecha();
    		break;
		}
		
		tablero[r.getPosicion().x][r.getPosicion().y].addThings(r);
		/*String clase = tablero[r.getPosicion().x][r.getPosicion().y].getEntidad().getClass().getName();
		if(clase.equals("modelo.Obstaculo")){
			r.setPosicion(p);
		}
		else{
			c.setEntidad(new Vacio("vacio.gif"));
			tablero[r.getPosicion().x][r.getPosicion().y].setEntidad(r);
		}*/
		
	}

	
}
