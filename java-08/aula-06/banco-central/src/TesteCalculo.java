
public class TesteCalculo {
	
	public static void main(String[] args) {
		
		
		CalculaBonificacao cal = new CalculaBonificacao();
		
		Funcionario joaozin = new Funcionario("Joaozin","432342", 800);
		joaozin.setSalario(800);
		
		Gerente ricardo = new Gerente("Teste","34243",321312,"Login","senha123");
		 
		ricardo.setSalario(1500);
		
		
		Programador vinicin = new Programador("Vinicin","123123",15000);
		vinicin.setSalario(1500);
		
		vinicin.getBonificacao();
//		ricardo.getBonificacao();
//		
//		
//		Designer enzin = new Designer();
//		enzin.setSalario(1200);
//		
//		cal.adicionaBonificacao(joaozin);
//		cal.adicionaBonificacao(ricardo);
//		cal.adicionaBonificacao(vinicin);
//		cal.adicionaBonificacao(enzin);
		
//		System.out.println(cal.getTotalBonificacao());
		
	}
}
