package br.com.cursoJava.bancoCentral.modelo;

public class ArrayCliente {
	
	private Cliente clientes[];
	
	public ArrayCliente(int quantidadeCliente) {
		clientes = new Cliente[quantidadeCliente];
	}
	
	public void adicionArray(int index, Cliente cliente) {
		this.clientes[index] = cliente;
	}
	
	public void removeArray(int index) {
		this.clientes[index] = null;
	}
	
	public int getQuantidadeCliente() {
		return clientes.length;
	}
	
	public Cliente getClienteByIndex(int index) {
		return this.clientes[index];
	}
	
	public void imprimirArray() {
		for(int i = 0; i < this.clientes.length; i++) {
			System.out.println(this.clientes[i]);
		}
	}
}
