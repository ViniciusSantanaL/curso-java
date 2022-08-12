import java.util.Scanner;

public class Char {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char nome[] = {'V','i','n','i','c','i','u','s'};
		System.out.println(nome.length);
//		for(inicializacao; condicao; acao(decrementacao/incrementacao))
		
		for(int i = nome.length - 1; i>=0 ; i--) {
			System.out.print(nome[i]);
		}
		System.out.println("");
		for(int i = 0; i < nome.length; i++) {
			System.out.print(nome[i]);
		}
		
	}
}
