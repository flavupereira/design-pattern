package desginpattern.factory;

public class OlimpcFactory {

	public static EsporteFactory<Esporte> getEsporte(String modalidade) {

		if ("Esporte".equalsIgnoreCase(modalidade)) {
			return new ModalidadeFactory();

		}
		return null;
	}

}
