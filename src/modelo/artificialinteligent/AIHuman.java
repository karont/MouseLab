package modelo.artificialinteligent;

import java.util.Random;



import modelo.Board;
import modelo.actions.Action;
import modelo.entity.Mouse;

public class AIHuman implements AI {
	private Random r;
	private AIType type = AIType.RANDOM;
	public AIHuman(){
	}
	
/*	@Override
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

	}*/

	@Override
	public void observer(Board b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Action dameAccion() {

		return null;
		
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
