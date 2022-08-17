
public class TesteInterface {
	public static void main(String[] args) {
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		FotoDAO fotoDAO = new FotoDAO();
		
		final int numero = 1;
		
		
		
		if(funcionarioDAO instanceof BasicDAO) {
			System.out.println("Eu estou implementando o BASIC DAO 1");
			funcionarioDAO.salvar();
		}
		
		
	}
}
