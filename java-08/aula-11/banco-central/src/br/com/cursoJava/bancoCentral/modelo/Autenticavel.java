package br.com.cursoJava.bancoCentral.modelo;
// Eh um contrato que deve ser seguido conforme escrito
public interface Autenticavel {
	
	public abstract boolean logar(String login, String senha);
	

	public abstract String getLogin();


	String getSenha();
	
}
