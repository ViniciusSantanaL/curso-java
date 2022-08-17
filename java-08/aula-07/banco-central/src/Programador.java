
public class Programador extends Funcionario{
	
	public Programador(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public double getBonificacao() {
		/// implementacao de Calculo expecifico
				//// implementacao de Calculo expecifico
				//// implementacao de Calculo expecifico
		return 900;
	}
}
