package modelo;


import java.util.ArrayList;

import modelo.artificialinteligent.AIType;
import modelo.entity.Cheese;
import modelo.entity.Mouse;
import modelo.entity.Shoji;

public class Board {
	private Tile[][] board;
	private Mouse[] mice;
	private Cheese cheese;
	private int size;
	
	public Board(){
	}
	
	public void start(int s){
    	this.size = s;
    	
    	board = new Tile[size][size];

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
            	if (board[i][j] == null){
            		board[i][j] = new Tile(TileType.EMPTY);
	                
	                }
            }           
        }
        
        
	}
	public void setMouse(Mouse[] m){
		mice= m.clone();
		for(Mouse mouse : mice){
			board[mouse.getPosition().x][mouse.getPosition().y].addThings(mouse);
		}
    	for (Mouse mouse : mice) {
			mouse.setBoard(board);
		}
	}
	
	public void setObstacles(ArrayList<Position> position){
    	for (Position p : position) {
    		board[p.x][p.y].setType(TileType.OBSTACLE);

		}
	}
	
	public void setCheese(Cheese c){
		this.cheese = c;
		board[c.getPosition().x][c.getPosition().y].addThings(c);
	}
	
	public void setShojis(ArrayList<Position> position){
    	for (Position p : position) {
    		board[p.x][p.y].addThings(new Shoji(p));

		}
	}
	
	public Tile getTile(int i, int j){
		return board[i][j];
	}
	
	public int getSize() {
		return size;
	}
	

	public void setSize(int size) {
		this.size = size;
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
