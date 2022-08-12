
public class CadastroCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.cpf = "3912312312";
		cliente.idade = 20;
		cliente.nome = "Vinicius";
		
		Cliente cliente2 = null;
//		cliente2.cpf ="004324423";
//		cliente2.nome = "Gabriel";
//		cliente.cpf = "ERRO!!";
		if(cliente2 == null) {
			System.out.println("Este usuario não existe");
		}
//		System.out.println(cliente);
//		System.out.println(cliente.cpf);
//		System.out.println(cliente2);
		
	}

}
