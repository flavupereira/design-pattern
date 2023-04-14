package desginpattern.buider;

import desginpattern.buider.Cidade.CidadeBuilder;

public class Teste {

	public static void main(String[] args) {

		Cidade cidade = new Cidade.CidadeBuilder(1245689, "RJ")
				.Bairro("Copacabana")
				.codigoIbge("0480")
				.Regiao("Sul")
				.build();
		
		System.out.println(cidade);
	}
}