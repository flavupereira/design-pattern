package Adpater;

public class Android implements MicroUsbPhone{
	private boolean conector;
	

	
	public void recarrega() {
		if(conector) {
			System.out.println("Incio da recarga");
			System.out.println("Fim da recarga");
		}else {
			System.out.println("Conect o carregador do Android primeiro");
		}
		
	}


	@Override
	public void useMicroUsbPhone() {
		conector = true;
		System.out.println(" Carregador Android conectado ");
		
	}

	
	

}
