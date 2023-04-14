package desginpattern.decoretor;

public class BordaRecheada extends pizzaDecorator{

	BordaRecheada(Pizza p) {
		super(p);
		
	}

	@Override
	public int preco() {
		
		return pizzadecoratorada.preco() + 10;
	}

}
