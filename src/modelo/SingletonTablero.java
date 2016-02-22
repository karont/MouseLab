package modelo;

public class SingletonTablero {
	static private Tablero instance = null;
	
	public SingletonTablero(){
		
	}
	
	public Tablero getInstance(){
		
		if(instance == null)
			instance = new Tablero();
		
		return instance;
		
	}
}
