package modelo.interfaces;

import javax.swing.ImageIcon;

import modelo.Position;
import modelo.TileType;

public interface IEntity {
	public  IPosition getPosition();
	public ImageIcon getBackground();
	public TileType getType();

}
