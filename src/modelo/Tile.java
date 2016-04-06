package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import modelo.interfaces.IEntity;
import modelo.interfaces.ITile;


public class Tile implements ITile{
	private TileType type;
	private List<IEntity> things;
	private Position position;
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Tile(TileType type){
		this.type = type;
		this.things = new ArrayList<IEntity>();
	}

	public TileType getType() {
		return type;
	}

	public void setType(TileType type) {
		this.type = type;
	}

	public List<IEntity> getThings() {
		return things;
	}
	public void addThings(IEntity entity){
		things.add(entity);
	}
	public void removeThings(IEntity entity){
		things.remove(entity);
	}

	public void setThings(ArrayList<IEntity> things) {
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
		for(IEntity entity: things ){
			if(entity.getType() == TileType.CHEESE)
				return true;
		}
		return false;
	}
	
	public Boolean eatCheese(){
		for(IEntity entity: things ){
			if(entity.getType() == TileType.CHEESE){
				removeThings(entity);
				entity = null;
				return true;
			}
		}
		return false;
	}
}
