package view.images;

import javax.swing.ImageIcon;

public  class LoadIcon {
	public static ImageIcon load(String ruta){
		
		java.net.URL localizacion = LoadIcon.class.getResource(ruta);
        if (localizacion != null) {
        	return new ImageIcon(localizacion);
        } else {
            System.err.println("No se ha encontrado el archivo: " + ruta);
            return null;
        }
		
	}
}
