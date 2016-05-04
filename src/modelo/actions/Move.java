package modelo.actions;

import modelo.interfaces.Direction;

public class Move extends Action {
	private Direction dir;

	public Move(Direction dir) {
		super(ActionType.MOVE);
		this.dir = dir;
	}
	public Direction getDir(){
		return dir;
	}

}
