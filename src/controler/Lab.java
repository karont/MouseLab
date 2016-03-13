package controler;

import java.util.ArrayList;

import modelo.BoardControler;
import modelo.Position;
import modelo.TileType;
import modelo.artificialinteligent.AIType;
import modelo.entity.Cheese;
import modelo.entity.Mouse;
import view.WindowGUI;

public class Lab {
	private BoardControler boardcontroler;
	
	private int width;
	private int height;
	private int turns;
	private AIType myellow;
	private AIType mred;
	private AIType mblue;
	private AIType mgreen;
	
	public Lab(int width, int height, int turns, AIType my, AIType mr, AIType mb, AIType mg){
		
		this.width = width;
		this.height = height;
		this.turns = turns;
		this.myellow = my;
		this.mred = mr;
		this.mblue = mb;
		this.mgreen = mg;
		
	}
	
	public void start(){

		Mouse[] mice = new Mouse[4];
    	mice[0] = new Mouse("yellow",new Position(0,0),TileType.YELLOWMOUSE,myellow);
    	mice[1] = new Mouse("red",new Position(9,9),TileType.REDMOUSE,mred);
    	mice[2] = new Mouse("blue",new Position(0,9),TileType.BLUEWMOUSE,mblue);
    	mice[3] = new Mouse("green",new Position(9,0),TileType.GREENMOUSE,mgreen);
    	

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
    	boardcontroler = new BoardControler();
    	boardcontroler.start(width,height,turns);
    	boardcontroler.setMouse(mice);
    	boardcontroler.setObstacles(obstacles);
    	boardcontroler.setCheese(new Cheese(new Position(4,5)));
    	boardcontroler.setShojis(shojis);
    	
    	
    	
		new WindowGUI(boardcontroler).setVisible(true);
	}
	public BoardControler getBoard() {
		return boardcontroler;
	}
	public void setBoard(BoardControler board) {
		this.boardcontroler = board;
	}
	
}
