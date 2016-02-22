package modelo;

import javax.swing.ImageIcon;

import vista.imagenes.CargarImagenes;

public class Vacio implements Entidad {
	private ImageIcon fondo;
	//private Posicion posicion;

	
	public Vacio( String fondo){		
		cargarFondo(fondo);
		//this.posicion = p;
	}
	

	@Override
	public ImageIcon getFondo() {
		return fondo;
	}

	@Override
	public void setFondo(ImageIcon f) {
		this.fondo = f;

	}


	@Override
	public Posicion getPosicion() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setPosicion(Posicion p) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void cargarFondo(String ruta) {
		fondo = CargarImagenes.cargar(ruta);
		
	}


}
