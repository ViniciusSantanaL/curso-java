
public class OperadoresAritimeticos {
	
	public static void main(String[] args) {
		// soma (+)
		// subtração (-)
		// multiplicação (*)
		// divisão ( / )
		// modulo ( % ) 
		
		int idade = 20; // idade = 20
		double salario = 800.50; // salario = 800.50
		double reducaoSalario = 200; // reducaoSalario = 600
		salario = salario - reducaoSalario; // (salario)800.5 - 600(reducaoSalario) -> salario = 200.5
		double aumentoSalario = 400.90; // aumentoSalario = 400.90
		salario = salario + aumentoSalario; // 200.5 + 400.90 -> salario = 601.4
//		System.out.println("Meu salario eh: R$ " + salario);
//		System.out.println("------------------------------");
		double bonificacaoJunior = 3;
		salario = salario * bonificacaoJunior;
//		System.out.println("Meu salario eh: R$ " + salario);
//		System.out.println("------------------------------");
		salario = salario / 2;
//		System.out.println("Meu salario eh: R$ " + salario);
		int testeNumeroNegativo = 100;
//		System.out.println(testeNumeroNegativo);
		testeNumeroNegativo = -testeNumeroNegativo;
//		System.out.println(testeNumeroNegativo);
		
		int restoDaDivisao = 10%2;
		System.out.println(restoDaDivisao);
		++restoDaDivisao;
		System.out.println(restoDaDivisao);
		int restoDaDivisao2 = 10%3;
		--restoDaDivisao2;
		System.out.println(restoDaDivisao2);
		
		
		
	
		
		
	}
}
