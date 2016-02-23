package modelo;

import javax.swing.ImageIcon;


import vista.imagenes.CargarImagenes;

public class Mouse implements Entitys {
	
	private Position posicion;
	private ImageIcon fondo;
	private String color;
	private int size;
	
	public Mouse(String color, Position p, String fondo, int size){
		this.color = color;
		this.posicion = p;
		this.size = size;
		cargarFondo(fondo);
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public Position getPosicion() {
		return posicion;
	}

	@Override
	public void setPosicion(Position p) {
		this.posicion = p;
	}

	@Override
	public ImageIcon getFondo() {
		return fondo;
	}

	@Override
	public void setFondo(ImageIcon f) {
		this.fondo = f;

	}

	@Override
	public void cargarFondo(String ruta) {
		fondo = CargarImagenes.cargar(ruta);
		
	}
	
	public void moverArriba(){
		if(posicion.y > 0)
			posicion.y--;
		
	}
	public void moverAbajo(){
		if(posicion.y < size)
			posicion.y++;
		
	}
	public void moverIzquierda(){
		if(posicion.x > 0)
			posicion.x--;
		
	}
	public void moverDerecha(){
		if(posicion.y < size)
			posicion.x++;
		
	}

}
