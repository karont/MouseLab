package modelo.entity;


import java.util.List;

import javax.swing.ImageIcon;

import modelo.Board;
import modelo.Position;
import modelo.TileType;
import modelo.actions.Action;
import modelo.actions.Eat;
import modelo.actions.Move;
import modelo.actions.Wait;
import modelo.Tile;
import modelo.artificialinteligent.AI;
import modelo.artificialinteligent.AIType;
import modelo.interfaces.Direction;
import modelo.interfaces.IEntity;
import modelo.interfaces.IPosition;


public class Mouse implements IEntity {
	
	private Position position;
	private ImageIcon background;
	private String color;
	private Board board;
	private TileType type;
	private Boolean eatcheese;
	private AI ai;
	
	public Mouse(String color, Position p,TileType type, AI IA){
		this.color = color;
		this.position = p;
		this.type = type;
		this.ai = IA;
		this.background = type.getBackground();
		this.setEatcheese(false);
	}
	public AI getAI() {
		return ai;
	}
	public void setAI(AI iA) {
		ai = iA;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void setBoard(Board board){
		this.board = board.clone();
	}
	
	public void eatCheese(){
		if (board.getTile(position.getX(),position.getY()).hasCheese()){
			if(board.getTile(position.getX(),position.getY()).eatCheese()){
				setEatcheese(true);
			}
		}
	}
	@Override
	public IPosition getPosition() {
		return position;
	}

	public void setPosition(Position p) {
		this.position = p;
	}

	@Override
	public ImageIcon getBackground() {
		return background;
	}


	
	private void moveUp(){
		int x = position.getX();
		int y = position.getY();
		board.getTile(position.getX(),position.getY()).removeThings(this);
		if(y > 0){
			y--;
			if(board.getTile(x,y).getType() == TileType.EMPTY){
				position.setY(y);
				breakChoji(board.getTile(x,y).getThings());
			}
		}
		board.getTile(position.getX(),position.getY()).addThings(this);		
	}
	private void moveDown(){
		int x = position.getX();
		int y = position.getY();
		board.getTile(position.getX(),position.getY()).removeThings(this);
		if(y < board.getHeight()-1){
			y++;
			if(board.getTile(x,y).getType() == TileType.EMPTY){
				position.setY(y);
				breakChoji(board.getTile(x,y).getThings());
				
			}
		}
		board.getTile(position.getX(),position.getY()).addThings(this);		
		
	}
	private void moveLeft(){
		int x = position.getX();
		int y = position.getY();
		board.getTile(position.getX(),position.getY()).removeThings(this);
		if(x > 0){
			x--;
			if(board.getTile(x,y).getType() == TileType.EMPTY){
				position.setX(x);
				breakChoji(board.getTile(x,y).getThings());
			}
		}
		board.getTile(position.getX(),position.getY()).addThings(this);	
			
		
	}
	private void moveRight(){
		int x = position.getX();
		int y = position.getY();
		board.getTile(position.getX(),position.getY()).removeThings(this);
		if(x < board.getWidth()-1){
			x++;
			if(board.getTile(x,y).getType() == TileType.EMPTY){
				position.setX(x);
				breakChoji(board.getTile(x,y).getThings());
			}
		}
		board.getTile(position.getX(),position.getY()).addThings(this);		
			
		
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
	
	public void breakChoji(List<IEntity> list){
		for (IEntity entity : list) {
			if(entity.getType() == TileType.SHOJI)
				((Shoji) entity).breakShoji();
			
		}
	}
	
	private void move(Direction dir){
		switch (dir) {
		case NORTH:
			moveUp();
			break;
		case SOUTH:
			moveDown();
			break;
		case EAST:
			moveRight();
			break;
		case WEST:
			moveLeft();
			break;
		default:
			break;
		}
	}
	public void cambiarEstado (Action a){
		switch (a.getType()) {
		case WAIT:
			break;
		case EAT:
			eatCheese();
			break;
		case MOVE:
			move(((Move) a).getDir());
			break;
		default:
			break;
		
		}
	}
	public void action(){
		ai.observer(board);
		Action action = ai.dameAccion();
		cambiarEstado(action);
		
	}
	

}
