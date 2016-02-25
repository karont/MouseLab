package controlador;

import java.util.ArrayList;

import modelo.Board;
import modelo.Cheese;
import modelo.Mouse;
import modelo.Position;
import modelo.TileType;
import vista.WindowGUI;

public class Lab {
	private Board board;
	public Lab(){
		
		int size = 10;
		Mouse[] mice = new Mouse[4];
    	mice[0] = new Mouse("amarillo",new Position(0,0),size,TileType.YELLOWMOUSE);
    	mice[1] = new Mouse("rojo",new Position(9,9),size,TileType.REDMOUSE);
    	mice[2] = new Mouse("azul",new Position(0,9),size,TileType.BLUEWMOUSE);
    	mice[3] = new Mouse("verde",new Position(9,0),size,TileType.GREENMOUSE);
    	

    	ArrayList<Position> p = new ArrayList<Position>();
    	p.add(new Position(0,3));
    	p.add(new Position(1,3));
    	p.add(new Position(3,0));
    	p.add(new Position(3,1));
    	p.add(new Position(3,3));
    	
    	p.add(new Position(0,6));
    	p.add(new Position(1,6));
    	p.add(new Position(3,6));
    	p.add(new Position(3,9));
    	p.add(new Position(3,8));
    	
    	p.add(new Position(6,0));
    	p.add(new Position(6,1));
    	p.add(new Position(6,3));
    	p.add(new Position(8,3));
    	p.add(new Position(9,3));
    	
    	p.add(new Position(6,6));
    	p.add(new Position(6,8));
    	p.add(new Position(6,9));
    	p.add(new Position(8,6));
    	p.add(new Position(9,6));
    	
    	
		//Board tablero = (new SingletonBoard()).getInstance();
    	board = new Board();
    	board.start(size);
    	board.setMouse(mice);
    	board.setObstaculos(p);
    	board.setCheese(new Cheese(new Position(4,4)));
    	
	}
	
	public void Iniciar(){
		new WindowGUI(board).setVisible(true);
	}
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	
}
