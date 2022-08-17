
public class FuncionarioDAO implements BasicDAO{
	
	private static final String ENDERECO_BANCO_DE_DADOS = "http://localhost:8080";
	
	@Override
	public boolean salvar() {
		System.out.println("Salvando Objeto Funcionario");
		return false;
	}

	@Override
	public boolean excluir() {
		System.out.println("Excluindo Objeto Funcionario");
		return false;
	}

	@Override
	public boolean atualizar() {
		System.out.println("Atualizar Objeto Funcionario");
		return false;
	}

	@Override
	public boolean consultar() {
		System.out.println("Consultando Objeto Funcionario");
		return false;
	}

}
