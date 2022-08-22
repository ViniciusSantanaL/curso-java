package br.com.cursoJava.bancoCentral.modelo;

public class Cliente implements Autenticavel{
	
	private String nome;
	private String cpf;
	private int numeroAgencia = 19;
	private int idade;
	private double saldo = 0;
	public static int TOTAL_DE_CONTAS = 0;

	
	public Cliente(String nome, String cpf, int idade, double saldo) {
		TOTAL_DE_CONTAS++;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.saldo = saldo;
	}
	
	public Cliente(String nome, String cpf, int idade) {
		TOTAL_DE_CONTAS++;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public Cliente() {
		TOTAL_DE_CONTAS++;
//		System.out.println("Estou Criando meu cliente 2");
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
//		System.out.println("Estou chamandop o hash: " + super.hashCode());
		return super.hashCode();
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo - valor >= 0) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public Cliente atualizarCliente(Cliente cliente) {
		Cliente novoCliente = new Cliente();
		novoCliente.nome = "Rodolfo";
		novoCliente.idade = 21;
		return novoCliente;
	}
	
	public static Cliente criarClienteRonaldo() {
		Cliente novoCliente = new Cliente();
		novoCliente.setNome("Ronaldo");
		novoCliente.setIdade(18);
		
		return novoCliente;
	}
	
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public boolean transferencia(double saldo, Cliente cliente2) {
//		this.saldo = this.saldo - saldo; 
		
		boolean statusTransferencia = this.sacar(saldo);
		
		if(statusTransferencia) {
			cliente2.depositar(saldo);
		}
		
		return statusTransferencia;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public int getNumeroAgencia() {
		return this.numeroAgencia;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getNome() {
		return this.nome;
	}

	@Override
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

//	@Override
//	public String toString() {
//		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", numeroAgencia=" + numeroAgencia + ", idade=" + idade
//				+ ", saldo=" + saldo + "]";
//	}
	
}
