
public class Cliente {
	String nome;
	String cpf;
	int numeroAgencia = 19;
	int idade;
	double saldo = 20;
	
	public Cliente(String nome, String cpf, int idade, double saldo) {
		System.out.println("Estou Criando meu cliente 1");
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.saldo = saldo;
	}
	
	public Cliente(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		
	}
	
	public Cliente() {
		System.out.println("Estou Criando meu cliente 2");
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
	
	public boolean transferencia(double saldo, Cliente cliente2) {
//		this.saldo = this.saldo - saldo; 
		
		boolean statusTransferencia = this.sacar(saldo);
		
		if(statusTransferencia) {
			cliente2.depositar(saldo);
		}
		
		return statusTransferencia;
	}
	
	
}
