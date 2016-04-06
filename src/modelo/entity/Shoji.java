package modelo.entity;

import javax.swing.ImageIcon;

import modelo.Position;
import modelo.TileType;
import modelo.interfaces.IEntity;

public class Shoji implements IEntity {
	
	private Position position;
	private TileType type;
	private ImageIcon background;
	
	public Shoji(Position p){	
		this.position=p;
		this.type = TileType.SHOJI;
		this.background = this.type.getBackground();
	}
	
	public void breakShoji(){
		this.type = TileType.BROKENSHOJI;
		this.background = this.type.getBackground();
	}
	@Override
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position p) {
		this.position = p;
	}

	@Override
	public ImageIcon getBackground() {
		return background;
	}


	@Override
	public TileType getType() {
		return type;
	}

}
