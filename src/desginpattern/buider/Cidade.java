package desginpattern.buider;

public class Cidade {
	private final int cep;
	private final String silga;
	private final String codigoIbge;
	private final String Rua;
	private final String Bairro;
	private final String Regiao;
	private final int numero;
	private final String nome;

	public Cidade(CidadeBuilder Builder) {
		this.cep = Builder.cep;
		this.silga = Builder.silga;
		this.codigoIbge = Builder.codigoIbge;
		this.Rua = Builder.Rua;
		this.Bairro = Builder.Bairro;
		this.Regiao = Builder.Regiao;
		this.numero = Builder.numero;
		this.nome = Builder.nome;
	}

	public int getCep() {
		return cep;
	}

	public String getSilga() {
		return silga;
	}

	public String getCodigoIbge() {
		return codigoIbge;
	}

	public String getRua() {
		return Rua;
	}

	public String getBairro() {
		return Bairro;
	}

	public String getRegiao() {
		return Regiao;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Cidade [cep=" + cep + ", silga=" + silga + ", codigoIbge=" + codigoIbge + ", Rua=" + Rua + ", Bairro="
				+ Bairro + ", Região=" + Regiao + ", numro=" + numero + ", nome=" + nome + "]";
	}

	public static class CidadeBuilder {
		final private int cep;
		final private String silga;
		private String codigoIbge;
		private String Rua;
		private String Bairro;
		private String Regiao;
		private int numero;
		private String nome;

		public CidadeBuilder(int cep, String silga) {
			this.cep = cep;
			this.silga = silga;
		}

		public CidadeBuilder codigoIbge (String codigoIbge) {
			this.codigoIbge = codigoIbge;
			return this;
		}
		
		public CidadeBuilder Rua(String Rua) {
			this.Rua = Rua;
			return this;
		}
		
		public CidadeBuilder Bairro (String Bairro) {
			this.Bairro = Bairro;
			return this;
		}
		
		public CidadeBuilder Regiao (String Regiao) {
			this.Regiao = Regiao;
			return this;
		}
		
		public CidadeBuilder numro(int numero) {
			this.numero = numero;
			return this;
		}
		
		public CidadeBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public Cidade build() {
			Cidade cidade =  new Cidade(this);
			return cidade;
		}
		
	}
}