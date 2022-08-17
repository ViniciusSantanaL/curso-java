
public class Fluxo {
 	public static void main(String[] args) {
		System.out.println("Iniciando metodo main");
		try {
			metodo1();
		} catch (ArithmeticException e) {
			String mensagemErro = e.getMessage();
			e.printStackTrace();
			System.out.println(mensagemErro);
			
		}
		System.out.println("Finalizando metodo main");
	}
	
	public static void metodo1() {
		System.out.println("Iniciando metodo1");
		
		metodo2();
		
		System.out.println("Finalizando metodo1");
	}
	
	public static void metodo2() {
		System.out.println("Iniciando metodo2");
		
		for(int i = 1; i <= 5; i++) {
//			int numero = 1 / 0;
			
			System.out.println(i);
		}
		System.out.println("Finalizando metodo2");
	}
}
