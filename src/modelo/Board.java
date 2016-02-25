package modelo;


import java.util.ArrayList;

public class Board {
	private Tile[][] board;
	private Entity[] entities;
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
	public void setMouse(Entity[] enti){
		entities= enti.clone();
		for(Entity entity : entities){
			board[entity.getPosition().x][entity.getPosition().y].addThings(entity);
		}
    	for (Entity mouse : entities) {
			((Mouse)mouse).setBoard(board);
		}
	}
	
	public void setObstaculos(ArrayList<Position> position){
    	for (Position p : position) {
    		board[p.x][p.y].setType(TileType.OBSTACLE);

		}
	}
	
	public void setCheese(Cheese c){
		this.cheese = c;
		board[c.getPosition().x][c.getPosition().y].addThings(c);
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
		
		Mouse r = (Mouse) entities[i];
		board[r.getPosition().x][r.getPosition().y].removeThings(r);
		switch(direction){
    	case 'w':
    		r.moveUp();
    		break;
    	case 's':
    		r.moverDown();
    		break;
    	case 'a':
    		r.moverLeft();
    		break;
    	case 'd':
    		r.moverRight();
    		break;
		}
		
		board[r.getPosition().x][r.getPosition().y].addThings(r);
		
	}
	
	public void eatCheese(int i){
		Mouse r = (Mouse) entities[i];
		r.eatCheese();
	}

	
}
