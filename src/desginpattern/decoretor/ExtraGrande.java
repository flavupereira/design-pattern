package desginpattern.decoretor;

public class ExtraGrande extends pizzaDecorator {

	ExtraGrande(Pizza p) {
		super(p);
		
	}

	@Override
	public int preco() {
		
		return (int) (pizzadecoratorada.preco() * 1.3);
	}

}
