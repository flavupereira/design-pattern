package desginpattern.decoretor;

import java.util.HashMap;

public class Teste {

	public static void main(String[] args) {
		
		HashMap<String,Integer> ingredientes = new HashMap<>();
		
		ingredientes.put("Massa", 10);
		ingredientes.put("Mussarela", 20);
		ingredientes.put("Tomate", 5);
		ingredientes.put("Majericão", 5);
		
		Pizza margerita = new PizzaDaNona(ingredientes);
		
		Pizza ExtraGrandemargerita = new ExtraGrande(new BordaRecheada(new MassaIntegral(margerita)));
		
		System.out.println("A Pizza Custa " + ExtraGrandemargerita.preco());
	}
}
