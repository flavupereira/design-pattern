package state;

public class Aberta implements State{

public void doAction(PortaContext context) {
		
		System.out.println(" A porta esta Aberta");
		
		context.setState(this);
	}
	
	
	@Override
	public String toString() {
		
		return "Posta Aberta";
	}
}
//https://www.tutorialspoint.com/design_pattern/state_pattern.htm