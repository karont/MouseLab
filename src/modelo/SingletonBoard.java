package modelo;

public class SingletonBoard {
	static private Board instance = null;
	
	public SingletonBoard(){
		
	}
	
	public Board getInstance(){
		
		if(instance == null)
			instance = new Board();
		
		return instance;
		
	}
}
