package br.com.cursoJava.bancoCentral.modelo;

// br.com.cursoJava.bancoCentral.modelo.AdministradorFinanceiro - 
public class AdministradorFinanceiro extends Funcionario implements Autenticavel{

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public boolean logar(String login, String senha) {
		// TODO Auto-generated method stub
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
