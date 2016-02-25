package modelo;

import javax.swing.ImageIcon;


public class Mouse implements Entity {
	
	private Position position;
	private ImageIcon background;
	private String color;
	private int size;
	private Tile[][] board;
	private TileType type;
	private Boolean eatcheese;
	
	public Mouse(String color, Position p, int size,TileType type){
		this.color = color;
		this.position = p;
		this.size = size;
		this.type = type;
		this.background = type.getBackground();
		this.setEatcheese(false);
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
		if(y > 0){
			y--;
			if(board[x][y].getType() == TileType.EMPTY)
				position.y--;
		}
	}
	public void moverDown(){
		int x = position.x;
		int y = position.y;
		if(y < size){
			y++;
			if(board[x][y].getType() == TileType.EMPTY)
				position.y++;
		}
			
		
	}
	public void moverLeft(){
		int x = position.x;
		int y = position.y;
		if(x > 0){
			x--;
			if(board[x][y].getType() == TileType.EMPTY)
				position.x--;
		}
			
		
	}
	public void moverRight(){
		int x = position.x;
		int y = position.y;
		if(y < size){
			x++;
			if(board[x++][y].getType() == TileType.EMPTY)
				position.x++;
		}
			
		
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

}
