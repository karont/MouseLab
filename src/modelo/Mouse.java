package modelo;

import javax.swing.ImageIcon;


import vista.imagenes.CargarImagenes;

public class Mouse implements Entitys {
	
	private Position posicion;
	private ImageIcon fondo;
	private String color;
	private int size;
	private Tile[][] board;
	
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
	public void setBoard(Tile[][] board){
		this.board = board;
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
		int x = posicion.x;
		int y = posicion.y;
		if(y > 0){
			y--;
			if(board[x][y].getType() == TileType.VACIO)
				posicion.y--;
		}
	}
	public void moverAbajo(){
		int x = posicion.x;
		int y = posicion.y;
		if(y < size){
			y++;
			if(board[x][y].getType() == TileType.VACIO)
				posicion.y++;
		}
			
		
	}
	public void moverIzquierda(){
		int x = posicion.x;
		int y = posicion.y;
		if(x > 0){
			x--;
			if(board[x][y].getType() == TileType.VACIO)
				posicion.x--;
		}
			
		
	}
	public void moverDerecha(){
		int x = posicion.x;
		int y = posicion.y;
		if(y < size){
			x++;
			if(board[x++][y].getType() == TileType.VACIO)
				posicion.x++;
		}
			
		
	}

}
