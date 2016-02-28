package controler;

import java.util.ArrayList;

import modelo.Board;
import modelo.Position;
import modelo.TileType;
import modelo.artificialinteligent.AIType;
import modelo.entity.Cheese;
import modelo.entity.Mouse;
import view.WindowGUI;

public class Lab {
	private Board board;
	public Lab(){
		
		int size = 10;
		Mouse[] mice = new Mouse[4];
    	mice[0] = new Mouse("amarillo",new Position(0,0),size,TileType.YELLOWMOUSE,AIType.HUMAN);
    	mice[1] = new Mouse("rojo",new Position(9,9),size,TileType.REDMOUSE,AIType.RANDOM);
    	mice[2] = new Mouse("azul",new Position(0,9),size,TileType.BLUEWMOUSE,AIType.RANDOM);
    	mice[3] = new Mouse("verde",new Position(9,0),size,TileType.GREENMOUSE,AIType.RANDOM);
    	

    	ArrayList<Position> obstacles = new ArrayList<Position>();
    	obstacles.add(new Position(0,3));
    	obstacles.add(new Position(1,3));
    	obstacles.add(new Position(3,0));
    	obstacles.add(new Position(3,1));
    	obstacles.add(new Position(3,3));
    	
    	obstacles.add(new Position(0,6));
    	obstacles.add(new Position(1,6));
    	obstacles.add(new Position(3,6));
    	obstacles.add(new Position(3,9));
    	obstacles.add(new Position(3,8));
    	
    	obstacles.add(new Position(6,0));
    	obstacles.add(new Position(6,1));
    	obstacles.add(new Position(6,3));
    	obstacles.add(new Position(8,3));
    	obstacles.add(new Position(9,3));
    	
    	obstacles.add(new Position(6,6));
    	obstacles.add(new Position(6,8));
    	obstacles.add(new Position(6,9));
    	obstacles.add(new Position(8,6));
    	obstacles.add(new Position(9,6));
    	
    	ArrayList<Position> shojis = new ArrayList<Position>();
    	shojis.add(new Position(3,2));
    	shojis.add(new Position(2,3));
    	
    	shojis.add(new Position(6,2));
    	shojis.add(new Position(7,3));
    	
    	shojis.add(new Position(2,6));
    	shojis.add(new Position(3,7));
    	
    	shojis.add(new Position(7,6));
    	shojis.add(new Position(6,7));
    	
		//Board tablero = (new SingletonBoard()).getInstance();
    	board = new Board();
    	board.start(size);
    	board.setMouse(mice);
    	board.setObstacles(obstacles);
    	board.setCheese(new Cheese(new Position(4,5)));
    	board.setShojis(shojis);
    	
    	
    	
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
