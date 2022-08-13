
public class Designer extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Estou no metodo Bonificacao do Designer");
		return super.getBonificacao() + 600;
	}
}
