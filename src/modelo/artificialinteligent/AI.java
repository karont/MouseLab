package modelo.artificialinteligent;



import modelo.Board;
import modelo.actions.Action;

public interface AI {
	
	public AIType getAIType();
	public void observer(Board b);
	public Action dameAccion();
	public void  ultimaAccion();
}
