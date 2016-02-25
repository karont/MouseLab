package modelo;

import javax.swing.ImageIcon;

public interface Entity {
	public Position getPosition();
	public void setPosition(Position p);
	public ImageIcon getBackground();
	public TileType getType();
}
