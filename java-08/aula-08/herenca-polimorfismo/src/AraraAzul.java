
public class AraraAzul extends Aves implements AvesQueVoam, AvesQueComemFrutas{

	@Override
	public void voar() {
		System.out.println("SOU UM ARARA AZUL, ESTOU VOANDO");
		
	}

	@Override
	public void descandoBanana() {
		System.out.println("Hmmmm, essa banana parece estar boa");
		
	}

	@Override
	public void abrindoAmendoin() {
		System.out.println("Não estou conseguindo abrir esse amendoin");
	}

}
