package modelo;

import javax.swing.ImageIcon;

public interface Entitys {
	public Position getPosicion();
	public void setPosicion(Position p);
	public ImageIcon getFondo();
	public void setFondo(ImageIcon f);
	public void cargarFondo(String ruta);
}
