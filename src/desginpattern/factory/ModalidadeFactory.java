package desginpattern.factory;

public class ModalidadeFactory implements EsporteFactory<Esporte> {

	@Override
	public Esporte create(String esporteType) {
		if ("Ciclismo".equals(esporteType)) {
			return new Ciclismo();
		} else if ("Maratona".equals(esporteType)) {
			return new Maratona();
		}
		return null;
	}

}
