package desginpattern.decoretor;

import java.util.HashMap;

public class PizzaDaNona implements Pizza{

	HashMap<String,Integer> ingredientes;
	
	
	
	public PizzaDaNona() {
		
	}
	public PizzaDaNona(HashMap<String, Integer> ingredientes) {
		
		this.ingredientes = ingredientes;
	}
	
	public int preco() {
		int valor = 0;
		for (Integer i: ingredientes.values()) 
			valor += i;
			return valor;
		}
		
	
	
	
    
}
