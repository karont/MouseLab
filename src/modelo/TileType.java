package modelo;

import javax.swing.ImageIcon;

import vista.imagenes.LoadIcon;

public enum TileType {
		EMPTY("empty","empty.gif"),OBSTACLE("obstacle","obstacle.gif"),CHEESE("cheese","cheese.gif"),
		YELLOWMOUSE("yellowmouse","m_Yellow.gif"),BLUEWMOUSE("bluemouse","m_Blue.gif"),
		REDMOUSE("redmouse","m_Red.gif"),GREENMOUSE("greenmouse","m_Green.gif");
		
		private String name;
		private ImageIcon background;
		
		private TileType(String name,String route){
			this.name = name;
			loadBackgroud(route);
			
		}
		
		
		private void loadBackgroud(String route) {
			background = LoadIcon.load(route);
			
		}


		public String getName() {
			return name;
		}


		public ImageIcon getBackground() {
			return background;
		}
		
}
