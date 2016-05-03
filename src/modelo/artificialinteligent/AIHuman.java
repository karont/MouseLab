package modelo.artificialinteligent;

import java.util.Random;

import modelo.entity.Mouse;

public class AIHuman implements AI {
	private Random r;
	public AIHuman(){
	}
	
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

	@Override
	public void observer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dameAccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ultimaAccion() {
		// TODO Auto-generated method stub
		
	}
}
