package br.com.cursoJava.bancoCentral.teste;

import br.com.cursoJava.bancoCentral.modelo.Cliente;
import br.com.cursoJava.bancoCentral.modelo.Programador;

public class TesteClassObject {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Vinicius", "405345345", 20);
		Programador programador = new Programador("Vincius", "31231", 800);
		System.out.println(cliente1);
	}
}
