package state;

public class Fechado implements State{

	
	public void doAction(PortaContext context) {
		
		System.out.println(" A porta esta Fechada");
		
		context.setState(this);
	}
	
	
	@Override
	public String toString() {
		
		return "Posta Fechada";
	}
}
