
public class EstruturaRepeticaoCondicional {

	public static void main(String[] args) {
		
		int numeroMaximo = 1000;
		int i = 1001;
		
		while(i <= numeroMaximo) {
			System.out.print(" " + i);
			i = i + 2;
		}
		
		do {
			System.out.print(" " + i);
			i = i + 2;
		}while(i <=numeroMaximo);
		
		
		
		switch (i) {
		
		case 1: 
			System.out.println("Aba de Login");
			break;
		case 2:
			System.out.println("Aba Home");
			break;
		case 3:
			System.out.println("Aba de produtos");
			break;
		case 4:
			System.out.println("Aba de Compra");
			break;
		default:
			System.out.println("ERRO !! NAO TENHO ESSA OPÇÃO");
			break;
		
		}

	}

}
