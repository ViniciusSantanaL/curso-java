
public class EstruturaRepeticaoSimples {

	public static void main(String[] args) {
		
/*		for(inicializacao; condicao; acao(incremento/decremento)) {
			//implemetacao ou acao
			//implemetacao
			//implemetacao
			//implemetacao
		}
*/
		
		int numero = 3;
		int potencia = 3;
		
		for(int i = 1; i < potencia; i = i + 1) {
			numero *= 3; 
			System.out.println("O resultado da potencia eh:" + numero);
		}
		
		System.out.println("O resultado da potencia eh:" + numero);

	}

}
