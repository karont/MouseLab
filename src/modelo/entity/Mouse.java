package modelo.entity;


import java.util.List;

import javax.swing.ImageIcon;

import modelo.Position;
import modelo.TileType;
import modelo.Tile;
import modelo.artificialinteligent.AIType;


public class Mouse implements Entity {
	
	private Position position;
	private ImageIcon background;
	private String color;
	private int size;
	private Tile[][] board;
	private TileType type;
	private Boolean eatcheese;
	private AIType ai;
	
	public Mouse(String color, Position p, int size,TileType type, AIType IA){
		this.color = color;
		this.position = p;
		this.size = size;
		this.type = type;
		this.ai = IA;
		this.background = type.getBackground();
		this.setEatcheese(false);
	}
	public AIType getAI() {
		return ai;
	}
	public void setAI(AIType iA) {
		ai = iA;
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
	
	public void eatCheese(){
		if (board[position.x][position.y].hasCheese()){
			if(board[position.x][position.y].eatCheese()){
				setEatcheese(true);
			}
		}
	}
	@Override
	public Position getPosition() {
		return position;
	}

	@Override
	public void setPosition(Position p) {
		this.position = p;
	}

	@Override
	public ImageIcon getBackground() {
		return background;
	}


	
	public void moveUp(){
		int x = position.x;
		int y = position.y;
		board[position.x][position.y].removeThings(this);
		if(y > 0){
			y--;
			if(board[x][y].getType() == TileType.EMPTY){
				position.y--;
				breakChoji(board[x][y].getThings());
			}
		}
		board[position.x][position.y].addThings(this);		
	}
	public void moveDown(){
		int x = position.x;
		int y = position.y;
		board[position.x][position.y].removeThings(this);
		if(y < size-1){
			y++;
			if(board[x][y].getType() == TileType.EMPTY){
				position.y++;
				breakChoji(board[x][y].getThings());
				
			}
		}
		board[position.x][position.y].addThings(this);		
		
	}
	public void moveLeft(){
		int x = position.x;
		int y = position.y;
		board[position.x][position.y].removeThings(this);
		if(x > 0){
			x--;
			if(board[x][y].getType() == TileType.EMPTY){
				position.x--;
				breakChoji(board[x][y].getThings());
			}
		}
		board[position.x][position.y].addThings(this);	
			
		
	}
	public void moveRight(){
		int x = position.x;
		int y = position.y;
		board[position.x][position.y].removeThings(this);
		if(x < size-1){
			x++;
			if(board[x][y].getType() == TileType.EMPTY){
				position.x++;
				breakChoji(board[x][y].getThings());
			}
		}
		board[position.x][position.y].addThings(this);		
			
		
	}
	@Override
	public TileType getType() {
		return type;
	}
	public Boolean getEatcheese() {
		return eatcheese;
	}
	public void setEatcheese(Boolean eatcheese) {
		this.eatcheese = eatcheese;
	}
	
	public void breakChoji(List<Entity> list){
		for (Entity entity : list) {
			if(entity.getType() == TileType.SHOJI)
				((Shoji) entity).breakShoji();
			
		}
	}

}
