package modelo.entity;

import javax.swing.ImageIcon;

import modelo.Position;
import modelo.TileType;

public interface Entity {
	public Position getPosition();
	public void setPosition(Position p);
	public ImageIcon getBackground();
	public TileType getType();
}
