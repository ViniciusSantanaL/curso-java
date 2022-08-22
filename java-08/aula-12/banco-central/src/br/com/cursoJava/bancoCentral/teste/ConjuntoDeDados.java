package br.com.cursoJava.bancoCentral.teste;

import java.util.ArrayList;

import br.com.cursoJava.bancoCentral.modelo.ArrayCliente;
import br.com.cursoJava.bancoCentral.modelo.Cliente;

public class ConjuntoDeDados {

	public static void main(String[] args) {
		
//		int numeros[] = new int[10];
		
		ArrayCliente array = new ArrayCliente(4);
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Vincius");
		
		
		for(int i = 0; i < array.getQuantidadeCliente(); i++) {
//			Cliente cliente = new Cliente();
//			cliente.setNome("Teste");
			//array.adicionArray(i, cliente1);
		}
		
//		cliente.setNome("Pedro");
//		Cliente clienteTeste1 = array.getClienteByIndex(0);
//		Cliente clienteTeste2 = array.getClienteByIndex(1);
//		array.imprimirArray();
//		
		Cliente joao = new Cliente();
		joao.setNome("Joao");
		
		Cliente joao2 = joao;
		
		if(joao == joao2) {
			System.out.println("SÃO IGUAIS, objeto 1: " + joao + "// objeto 2: " + joao2);
		} else {
			System.out.println("SÃO DIFERENTES, objeto 1: " + joao + "// objeto 2: " + joao2);
		}
		
//		for(int i = 0; i < array.getQuantidadeCliente(); i++) {
//			System.out.println(numeros[i]);
//		}
		
	}

}
