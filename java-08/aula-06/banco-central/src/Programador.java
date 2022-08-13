
public class Programador extends Funcionario{
	
	public Programador(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public double getBonificacao() {
		System.out.println("Estou no metodo sobrescrito da classe Programador");
		double teste = 900;
		return teste;
	}
}
