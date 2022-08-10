
public class OperadoresRelacionais {
	public static void main(String[] args) {
		//> maior que
		// < menor que
		// >= maior ou igual
		// <= menor ou igual
		// == igual
		// != diferente
		int idadeVinicius = 20;
		int idadeDiego = 25;
		boolean testeIdade = idadeVinicius < 25;
		testeIdade = idadeVinicius <= 20; // idadeVinicius = 20
//		System.out.println(testeIdade);
		
		boolean testeIdadeDiego = idadeDiego == 21;
		testeIdadeDiego = idadeDiego != 20;
		testeIdadeDiego = idadeDiego >= 25;
		System.out.println(testeIdadeDiego);
		
		
	}
}
