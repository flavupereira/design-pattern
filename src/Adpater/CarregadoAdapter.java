package Adpater;

public class CarregadoAdapter implements MicroUsbPhone {

	private final LingthFone lingthFone;

	public CarregadoAdapter(LingthFone lingthFone) {
		this.lingthFone = lingthFone;
	}

	public void useMicroUsbPhone() {
     System.out.println("Micro Usb Connect");
     lingthFone.useLingthing();
	}

	public void recarrega() {
		lingthFone.recarrega();
	}

	

}
