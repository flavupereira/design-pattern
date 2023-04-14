package Adpater;

public class Iphone implements LingthFone{

	private boolean conector;
	
	

	@Override
	public void useLingthing() {
		conector = true;
		System.out.println("Carregador conectado  ");
		
	}
	
	@Override
	public void recarrega() {
		if(conector) {
			System.out.println("Incio da recarga");
			System.out.println("Fim da recarga");
		}else {
			System.out.println("Conect o carregador do Iphone primeiro");
		}
		
	}


}
