package modelo;

import javax.swing.ImageIcon;

public interface Entidad {
	public Posicion getPosicion();
	public void setPosicion(Posicion p);
	public ImageIcon getFondo();
	public void setFondo(ImageIcon f);
	public void cargarFondo(String ruta);
}
