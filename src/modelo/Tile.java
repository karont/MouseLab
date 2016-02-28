package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import modelo.entity.Entity;


public class Tile {
	private TileType type;
	private List<Entity> things;
	
	public Tile(TileType type){
		this.type = type;
		this.things = new ArrayList<Entity>();
	}

	public TileType getType() {
		return type;
	}

	public void setType(TileType type) {
		this.type = type;
	}

	public List<Entity> getThings() {
		return things;
	}
	public void addThings(Entity entity){
		things.add(entity);
	}
	public void removeThings(Entity entity){
		things.remove(entity);
	}

	public void setThings(ArrayList<Entity> things) {
		this.things = things;
	}
	public ImageIcon getBackground(){
		
		if(things.isEmpty()){
			return type.getBackground();
		}
		else{
			return things.get(0).getBackground();
		}
		
	}
	public Boolean hasCheese(){
		for(Entity entity: things ){
			if(entity.getType() == TileType.CHEESE)
				return true;
		}
		return false;
	}
	
	public Boolean eatCheese(){
		for(Entity entity: things ){
			if(entity.getType() == TileType.CHEESE){
				removeThings(entity);
				entity = null;
				return true;
			}
		}
		return false;
	}
}
