package br.com.cursoJava.bancoCentral.teste;

import br.com.cursoJava.bancoCentral.modelo.*;

public class CalculaBonificacao {
	
	private double totalBonificacao;
	
	public void adicionaBonificacao(Funcionario funcionario) {
		this.totalBonificacao += funcionario.getBonificacao();
	}
	
	
	public void setTotalBonificacao(double totalBonificacao) {
		this.totalBonificacao = totalBonificacao;
	}
	
	public double getTotalBonificacao() {
		return totalBonificacao;
	}
}
