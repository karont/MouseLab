package modelo.artificialinteligent;


public enum AIType {
	HUMAN(null),RANDOM(new AIRandom());
	
	AI ai;
	private AIType(AI ai){
		this.ai = ai;
	}
	
	public AI getAI(){
		return ai;
	}
}
