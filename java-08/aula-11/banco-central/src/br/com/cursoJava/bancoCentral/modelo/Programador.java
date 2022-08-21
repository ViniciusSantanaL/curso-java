package br.com.cursoJava.bancoCentral.modelo;

/**
 * Classe Progamador que precisa herdar de Funcionario
 * @version 0.1v
 * @author vinic
 *
 */
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
