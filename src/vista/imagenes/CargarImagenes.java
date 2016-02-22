package vista.imagenes;

import javax.swing.ImageIcon;

public  class CargarImagenes {
	public static ImageIcon cargar(String ruta){
		
		java.net.URL localizacion = CargarImagenes.class.getResource(ruta);
        if (localizacion != null) {
        	return new ImageIcon(localizacion);
        } else {
            System.err.println("No se ha encontrado el archivo: " + ruta);
            return null;
        }
		
	}
}
