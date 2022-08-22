package br.com.cursoJava.bancoCentral.teste;

import java.util.ArrayList;

import br.com.cursoJava.bancoCentral.modelo.Cliente;

public class TesteArrayList {
	public static void main(String[] args) {
//		ArrayList<String> nomes = new ArrayList<String>();
//		nomes.add("Vinicius");
//		nomes.add("Rafael");
//		nomes.add("Diego");
//		nomes.add("Neiva");
//		
//		for(String nome: nomes) {
//			System.out.println(nome);
//		}
		
//		for(int i = 0; i < 1000; i ++) {
			//nomes.add("Teste " + i);
//		}
//		System.out.println(nomes.contains("Teste 0"));
//		System.out.println(nomes);
		
		ArrayList<Cliente> contas = new ArrayList<Cliente>();
		
		Cliente cliente = new Cliente("Vinicius", "03432423", 20);
		Cliente cliente1 = new Cliente("Vinicius", "03432423", 20);
		
		if(cliente == cliente1) {
			System.out.println("SAO IGUAIS");
			System.out.println(cliente);
			System.out.println(cliente1);
		} else {
			System.out.println("SAO DIFERENTES");
			System.out.println(cliente);
			System.out.println(cliente1);
		}
		
		contas.add(cliente);
//		for(int i = 0; i < 100; i++) {
//			Cliente cliente1 = new Cliente("Teste " + i, "423", 18);
//			contas.add(cliente1);
//		}
		System.out.println(contas);
//		for(Cliente cli : contas) {
//			System.out.println(cli);
//		}
		
		contas.add(cliente);
	}
}
