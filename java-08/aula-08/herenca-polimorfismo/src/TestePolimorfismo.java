
public class TestePolimorfismo {
	
	public static void main(String[] args) {
		
		AvesQueVoam ave = new AraraAzul();
		TrajetoDeVoo.voarPelaCidade(ave);
		AvesQueComemFrutas ave2 = new Tucano();
	}
}
