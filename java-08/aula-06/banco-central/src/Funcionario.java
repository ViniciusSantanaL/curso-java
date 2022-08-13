
public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public Funcionario() {
		
	}
	
	public double getBonificacao() {
		System.out.println("Estou no metodo Bonificacao do Funcionario");
		return this.salario * 0.3;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
