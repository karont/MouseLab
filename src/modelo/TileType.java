package modelo;

import javax.swing.ImageIcon;

import vista.imagenes.CargarImagenes;

public enum TileType {
		VACIO("vacio","vacio.gif"),OBSTACULO("obstaculo","obstaculo.gif");
		
		private String name;
		private ImageIcon background;
		
		private TileType(String name,String route){
			this.name = name;
			loadBackgroud(route);
			
		}
		
		
		private void loadBackgroud(String ruta) {
			background = CargarImagenes.cargar(ruta);
			
		}


		public String getName() {
			return name;
		}


		public ImageIcon getBackground() {
			return background;
		}
		
}
