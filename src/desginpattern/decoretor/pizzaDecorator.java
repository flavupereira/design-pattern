package desginpattern.decoretor;
public abstract class  pizzaDecorator implements Pizza {

	Pizza pizzadecoratorada;
	
	pizzaDecorator(Pizza pizza){
		pizzadecoratorada = pizza;
	}
}
