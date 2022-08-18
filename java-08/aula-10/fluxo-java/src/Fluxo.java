
public class Fluxo {
 	public static void main(String[] args) {
		System.out.println("Iniciando metodo main");
		BancoDeDados db = new BancoDeDados();
		try {
			db.abreConexao();
			db.salva();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			db.fechaConexao();
		}
		
		
		System.out.println("Finalizando metodo main");
	}
	
	public static void metodo1() throws MinhaException {
		System.out.println("Iniciando metodo1");
		
		metodo2();
		
		System.out.println("Finalizando metodo1");
	}
	
	public static void metodo2() throws MinhaException {
		System.out.println("Iniciando metodo2");
		
			
		for(int i = 1; i <= 5; i++) {
			
			
			System.out.println(i);
		}
		
		System.out.println("Finalizando metodo2");
		Conta conta1 = null;
		if(conta1 == null) {
			throw new MinhaException("ERRO NO SISTEMA !!");
		}
//		try {
//			metodo2();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
