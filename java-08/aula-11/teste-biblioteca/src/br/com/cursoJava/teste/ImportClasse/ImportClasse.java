package br.com.cursoJava.teste.ImportClasse;

import br.com.cursoJava.bancoCentral.modelo.Cliente;
import br.com.cursoJava.bancoCentral.modelo.Funcionario;
import br.com.cursoJava.bancoCentral.modelo.Programador;

public class ImportClasse {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Vinicius", "405345345", 20);
		Programador programador = new Programador("Vincius", "31231", 800);
		System.out.println(cliente1.toString());
		Object teste = new Object();
		println(cliente1);
		
		println(programador);
		
	}
	public static void println(boolean tipo) {
		
	}
	
	public static void println(String tipo) {
		
	}
	public static void println(int tipo) {
	
	}
	
	public static void println(Cliente cliente) {
		
	}
	
	public static void println(Object fun) {
		
	}

}
