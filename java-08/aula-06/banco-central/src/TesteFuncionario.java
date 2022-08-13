
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Vinicius");
		funcionario.setCpf("204234234");
		funcionario.setSalario(800);
		
		System.out.println(funcionario.getBonificacao());
		
		Gerente gerente = new Gerente("Teste","34243",321312,"Login","senha123");
		gerente.setNome("Gerente Clodosvaldo");
		gerente.setSalario(1200);
		gerente.setLogin("admin");
		gerente.setSenha("admin123");
		System.out.println(gerente.logar("admin", "admin123"));
		System.out.println(gerente.getBonificacao());
		Programador programador = new Programador("Vinicin","123123",15000);
		programador.setCpf("32423423");
		programador.setNome("Rafael");
		programador.setSalario(3000);
		
		System.out.println(programador.getBonificacao());
		
	
		
		
	}

}
