package modelo;

import modelo.interfaces.IBoard;

public class Board implements IBoard{
	private Tile[][] board;
	private Boolean cheese;
	int width;
	int height;
	
	public Board(){
	}
	public Board(int w,int h){
		this.width = w;
		this.height = h;
		
		
		board = new Tile[w][h];

        for (int i = 0; i < w; i++){
            for (int j = 0; j < h; j++){
            	if (board[i][j] == null){
            		board[i][j] = new Tile(TileType.EMPTY);
	                
	                }
            }           
        }
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setBoard(Tile[][] b){
		this.board = b;
	}
	
	public Tile getTile(int x, int y){
		return board[x][y];
	}
	public Board clone(){
		Board b= new  Board();
		b.setWidth(this.width);
		b.setHeight(this.height);
		b.setBoard(this.board.clone());
		
		return b;
		
	}
	public Boolean hasCheese() {
		return cheese;
	}
	@Override
	public boolean hasCheesse() {
		// TODO Auto-generated method stub
		return false;
	}

}
