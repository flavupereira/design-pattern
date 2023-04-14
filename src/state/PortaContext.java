package state;

public class PortaContext {

	private State state;
	
	public PortaContext(){
		this.state = null;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
}
