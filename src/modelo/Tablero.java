package modelo;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import vista.CasillasGUI;
import vista.imagenes.CargarImagenes;

public class Tablero {
	private CasillasGUI [][] tablero;
	private Entidad[] entidades;
	private int size;
    private ImageIcon vacio, obstaculo;
	
	public Tablero(){
	}
	
	public void iniciar(int tamaño){
    	this.size = tamaño;
    	
        cargarImagenes();
        
        entidades = new Entidad[4];

    	entidades[0] = new Raton("amarillo",new Posicion(0,0),"r_Amarillo.gif",size);
    	entidades[1] = new Raton("rojo",new Posicion(9,9),"r_Rojo.gif",size);
    	entidades[2] = new Raton("azul",new Posicion(0,9),"r_Azul.gif",size);
    	entidades[3] = new Raton("verde",new Posicion(9,0),"r_Verde.gif",size);
    	
    	tablero = new CasillasGUI[size][size];

    	
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
            	if (tablero[i][j] == null){
            		tablero[i][j] = new CasillasGUI(new Vacio("vacio.gif"),new Posicion(i,j));
	                
	                }
                
            }
            
        }
        
        tablero[2][2].setEntidad(new Obstaculo("obstaculo.gif"));
    	tablero[entidades[0].getPosicion().x][entidades[0].getPosicion().y].setEntidad(entidades[0]);
    	tablero[entidades[1].getPosicion().x][entidades[1].getPosicion().y].setEntidad(entidades[1]);
    	tablero[entidades[2].getPosicion().x][entidades[2].getPosicion().y].setEntidad(entidades[2]);
    	tablero[entidades[3].getPosicion().x][entidades[3].getPosicion().y].setEntidad(entidades[3]);
	}
	
	public CasillasGUI getCasilla(int i, int j){
		return tablero[i][j];
	}
	
	 private void cargarImagenes() {
	        this.vacio = CargarImagenes.cargar("vacio.gif");
	        this.obstaculo = CargarImagenes.cargar("obstaculo.gif");
	    }

	public CasillasGUI[][] getTablero() {
		return tablero;
	}


	public void setTablero(CasillasGUI[][] tablero) {
		this.tablero = tablero;
	}


	public Entidad[] getEntidades() {
		return entidades;
	}


	public void setEntidades(Entidad[] entidades) {
		this.entidades = entidades;
	}


	public int getSize() {
		return size;
	}
	

	public void setSize(int size) {
		this.size = size;
	}
	
	public void moverRatones(int i, char direccion){
		
		Raton r = (Raton) entidades[i];
		CasillasGUI c =tablero[r.getPosicion().x][r.getPosicion().y];
		Posicion p = new Posicion(r.getPosicion().x,r.getPosicion().y);
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
		String clase = tablero[r.getPosicion().x][r.getPosicion().y].getEntidad().getClass().getName();
		if(clase.equals("modelo.Obstaculo")){
			r.setPosicion(p);
		}
		else{
			c.setEntidad(new Vacio("vacio.gif"));
			tablero[r.getPosicion().x][r.getPosicion().y].setEntidad(r);
		}
		
	}

	
}
