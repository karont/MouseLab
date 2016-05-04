package modelo.artificialinteligent;

import java.util.Random;

import modelo.Board;
import modelo.actions.Action;
import modelo.actions.ActionType;
import modelo.actions.Eat;
import modelo.actions.Move;
import modelo.actions.Wait;
import modelo.entity.Mouse;
import modelo.interfaces.Direction;

public class AIRandom implements AI {
	private Random r;
	private AIType type = AIType.HUMAN;
	public AIRandom(){
		this.r = new Random();
	}
/*	
	@Override
	public void run(Mouse m){
		
		switch(r.nextInt(5)){
		case 0:
			m.moveUp();
			break;
		case 1:
			m.moveDown();
			break;
		case 2:
			m.moveLeft();
			break;
		case 3:
			m.moveRight();
			break;
		case 4:
			m.eatCheese();
			break;
		default:
			break;
			
		}

	}
*/
	@Override
	public void observer(Board b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Action dameAccion() {
		Action a = null;
		switch(ActionType.random()){
		case WAIT:
			a = new Wait();		
			break;
		case EAT:
			a = new Eat();
			break;
		case MOVE:
			a = new Move(Direction.random());
			break;
		default:
			break;
		}
		
		return a;
	}

	@Override
	public void ultimaAccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AIType getAIType() {
		// TODO Auto-generated method stub
		return type;
	}
}
