package br.com.cursoJava.bancoCentral.teste;

import br.com.cursoJava.bancoCentral.modelo.*;
public class TesteCalculo {
	
	public static void main(String[] args) {
		
		
		CalculaBonificacao cal = new CalculaBonificacao();
		
		Gerente ricardo = new Gerente();
		 
		ricardo.setSalario(1500);
		
		
		Programador vinicin = new Programador("Vinicin","123123",15000);
		vinicin.setSalario(1500);
		
		vinicin.getBonificacao();
//		ricardo.getBonificacao();
//		
//		
//		Designer enzin = new Designer();
//		enzin.setSalario(1200);
//		
//		cal.adicionaBonificacao(joaozin);
//		cal.adicionaBonificacao(ricardo);
//		cal.adicionaBonificacao(vinicin);
//		cal.adicionaBonificacao(enzin);
		
//		System.out.println(cal.getTotalBonificacao());
		
	}
}
