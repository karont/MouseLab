package modelo.actions;

public enum ActionType {
	WAIT, MOVE, EAT;
	
	private static double elements = 3;
	
	public static ActionType random() {
		double value = Math.random() * elements;
		if (value < 1)
			return WAIT;
		if (value < 2)
			return MOVE;
		return EAT;
		
	}
}
