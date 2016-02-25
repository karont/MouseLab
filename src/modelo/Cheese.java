package modelo;

import javax.swing.ImageIcon;


public class Cheese implements Entity {

	private Position position;
	private TileType type;
	private ImageIcon background;
	
	
	public Cheese(Position p){
		this.position=p;
		this.type = TileType.CHEESE;
		this.background = this.type.getBackground();
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

	@Override
	public void setBackground(ImageIcon f) {
		this.background = f;

	}
	@Override
	public TileType getType() {
		return type;
	}

}
