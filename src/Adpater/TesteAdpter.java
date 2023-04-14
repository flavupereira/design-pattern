package Adpater;

public class TesteAdpter {

	public static void RecarregaUsb(MicroUsbPhone phone) {
      phone.recarrega();
      phone.useMicroUsbPhone();
	}

	public static void RecarregaLingthFone(LingthFone phone) {
		phone.recarrega();
		phone.useLingthing();
	}

	public static void main(String[] args) {
		
		
		Android android = new Android();
		Iphone   iphone = new Iphone();
		
		System.out.println("Recarrega Android com USb");
		RecarregaUsb(android);
		
		System.out.println("Recarrega Iphone com lingthFone");
		RecarregaLingthFone(iphone);
		
		
		System.out.println("Recarrega Iphone com USB");
		RecarregaUsb(new CarregadoAdapter(iphone));
		
		
		
		
	}
}
