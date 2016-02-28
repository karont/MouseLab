package modelo.artificialinteligent;

import java.util.Random;

import modelo.entity.Mouse;

public class AIRandom implements AI {
	private Random r;
	public AIRandom(){
		this.r = new Random();
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
}
