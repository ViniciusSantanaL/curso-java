
public class CadastroCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Vinicius","43231231",18,800);
		
		cliente.nome = "Gabriel";
		System.out.println(cliente.nome);
		System.out.println(cliente.numeroAgencia);
		
		cliente.depositar(200);
		System.out.println(cliente.saldo);
		
		double valorSacar = 100;
		
		cliente.sacar(valorSacar);
		
		
		Cliente cliente2 = new Cliente();
		cliente2.cpf = "59485499548";
		cliente2.idade = 18;
		cliente2.nome = "Rafael";
		
		cliente.transferencia(500, cliente2);
		
		System.out.println(cliente2.saldo);
		
	}

}
