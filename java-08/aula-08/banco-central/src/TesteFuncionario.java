
public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		Gerente gerente = new Gerente();
		
		Autenticavel usuarioLogin = new Gerente();
		
		Funcionario gerente2 = new Gerente();
		
		
		Autenticavel admFinanceiro = new AdministradorFinanceiro();
		CalculaBonificacao cal = new CalculaBonificacao();
		
		cal.adicionaBonificacao(gerente);
		
		
		gerente.setNome("Gerente Clodosvaldo");
		gerente.setSalario(1200);
	
		System.out.println(gerente.logar("admin", "admin123"));
		System.out.println(gerente.getBonificacao());
		
		Programador programador = new Programador("Vinicin","123123",15000);
		programador.setCpf("32423423");
		programador.setNome("Rafael");
		programador.setSalario(3000);
		
		System.out.println(programador.getBonificacao());
		
	
		
		
	}

}
