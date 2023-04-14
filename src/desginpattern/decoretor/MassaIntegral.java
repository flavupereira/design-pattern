package desginpattern.decoretor;

public class MassaIntegral extends pizzaDecorator{

	MassaIntegral(Pizza p) {
		super(p);
		
	}

	
	public int preco() {
		// TODO Auto-generated method stub
		return pizzadecoratorada.preco() + 5;
	}

	
}
