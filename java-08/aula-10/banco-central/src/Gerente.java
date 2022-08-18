
public class Gerente extends Funcionario implements Autenticavel {
	
	private String login;
	private String senha;
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public boolean logar(String login, String senha) {
		if(this.login.equals(login) && this.senha.equals(senha)) {
			System.out.println("GERENTE LOGADO COM SUCESSO!!");
			return true;
		}
		System.out.println("LOGIN OU SENHA INCORRETOS!!");
		
		return false;
	}

	

	@Override
	public String getLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSenha() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
