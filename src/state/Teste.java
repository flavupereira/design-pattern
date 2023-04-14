package state;

public class Teste {

	
	public static void main(String[] args) {
         PortaContext context = new PortaContext();

         State startState = new Aberta();
	      startState.doAction(context);

	      System.out.println(context.getState().toString());

	      State stopState = new Fechado();
	      stopState.doAction(context);

	      System.out.println(context.getState().toString());
	}
}
