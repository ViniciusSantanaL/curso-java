
public class OperadoresAtribuicao {

	public static void main(String[] args) {
		// +=
		// -=
		// *=
		// /=
		// %=
		byte idade = 127;
		++idade;
		System.out.println(idade);
		short testeOverflow = 32767;
		testeOverflow += 1000;
		System.out.println(testeOverflow);
		idade += 1;
		System.out.println(idade);
		idade -= 3;
		System.out.println(idade);
		double salario = 600;
		salario *= 3;
		System.out.println(salario);
		salario /= 2;
		System.out.println(salario);
		int idade2 = 10;
		idade2 %= 2;
		System.out.println(idade2);

	}

}
