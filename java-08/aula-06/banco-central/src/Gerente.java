
public class Gerente extends Funcionario {
	
	private String login;
	private String senha;
	
	public Gerente(String nome, String cpf, double salario, String login, String senha) {
		super(nome,cpf,salario);
//		super();
		this.login = login;
		this.senha = senha;
	}
	
	public double getBonificacao() {
		System.out.println("Estou no metodo Bonificacao do Gerente");
		return super.getBonificacao() + this.getSalario();
	}
	public boolean logar(String login, String senha) {
		if(this.login.equals(login) && this.senha.equals(senha)) {
			System.out.println("GERENTE LOGADO COM SUCESSO!!");
			return true;
		}
		System.out.println("LOGIN OU SENHA INCORRETOS!!");
		
		return false;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
