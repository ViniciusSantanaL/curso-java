package br.com.cursoJava.bancoCentral.teste;

import br.com.cursoJava.bancoCentral.modelo.*;

public class CadastroCliente {

	public static void main(String[] args) {
		
		int totalCliente  = 0;
		Cliente cliente = new Cliente("Vinicius","43231231",18);
			
		cliente.depositar(200);
		
		System.out.println(Cliente.TOTAL_DE_CONTAS);
		
		double valorSacar = 100;
		
		cliente.sacar(valorSacar);	
		 
		
		Cliente cliente2 = new Cliente();
		System.out.println(Cliente.TOTAL_DE_CONTAS);
		cliente2.setCpf("59485499548");
		cliente2.setIdade(18);
		cliente2.setNome("Rafael");
		System.out.println(cliente2.getNome());
		
		
		Cliente cliente3 = new Cliente();
		
		System.out.println(Cliente.TOTAL_DE_CONTAS);
		cliente.transferencia(500, cliente2);
		
		Cliente ronaldao = Cliente.criarClienteRonaldo();
		
		
		int resultado = Cliente.soma(3, 4);
		
		System.out.println(resultado);
		
	}

}
