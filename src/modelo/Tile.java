package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;


public class Tile {
	private TileType type;
	private List<Entitys> things;
	
	public Tile(TileType type){
		this.type = type;
		this.things = new ArrayList<Entitys>();
	}

	public TileType getType() {
		return type;
	}

	public void setType(TileType type) {
		this.type = type;
	}

	public List<Entitys> getThings() {
		return things;
	}
	public void addThings(Entitys entity){
		things.add(entity);
	}
	public void removeThings(Entitys entity){
		things.remove(entity);
	}

	public void setThings(ArrayList<Entitys> things) {
		this.things = things;
	}
	public ImageIcon getBackground(){
		
		if(things.isEmpty()){
			return type.getBackground();
		}
		else{
			return things.get(0).getFondo();
		}
		
	}
}
