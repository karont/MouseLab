package modelo;


import java.util.ArrayList;

import modelo.artificialinteligent.AIType;
import modelo.entity.Cheese;
import modelo.entity.Mouse;
import modelo.entity.Shoji;

public class BoardControler {
	private Board board;
	private Mouse[] mice;
	private Cheese cheese;

	
	public BoardControler(){
	}
	
	public void start(int w,int h){ 	
        board = new Board(w,h);   
	}
	
	public void setMouse(Mouse[] m){
		mice= m.clone();
		for(Mouse mouse : mice){
			board.getTile(mouse.getPosition().x,mouse.getPosition().y).addThings(mouse);
		}
    	for (Mouse mouse : mice) {
			mouse.setBoard(board);
		}
	}
	
	public void setObstacles(ArrayList<Position> position){
    	for (Position p : position) {
    		board.getTile(p.x,p.y).setType(TileType.OBSTACLE);

		}
	}
	
	public void setCheese(Cheese c){
		this.cheese = c;
		board.getTile(c.getPosition().x,c.getPosition().y).addThings(c);
	}
	
	public void setShojis(ArrayList<Position> position){
    	for (Position p : position) {
    		board.getTile(p.x,p.y).addThings(new Shoji(p));

		}
	}
	
	public Tile getTile(int x, int y){
		return board.getTile(x,y);
	}
	
	public int getWidth(){
		return board.getWidth();
	}
	public int getHeight(){
		return board.getHeight();
	}
	
	
	public void moveMouse(int i, char direction){
		
		Mouse r = (Mouse) mice[i];
		switch(direction){
    	case 'w':
    		r.moveUp();
    		break;
    	case 's':
    		r.moveDown();
    		break;
    	case 'a':
    		r.moveLeft();
    		break;
    	case 'd':
    		r.moveRight();
    		break;
		}
		
		
	}
	
	public void moveMices(){
		for (Mouse m : mice) {
			if(m.getAI() == AIType.RANDOM)
				m.getAI().getAI().run(m);
			
		}
	}
	
	public void eatCheese(int i){
		Mouse r = (Mouse) mice[i];
		r.eatCheese();
	}

	
}
