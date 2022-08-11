import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanhoArray = sc.nextInt();
		int idadesTurma[] = new int[tamanhoArray];
		idadesTurma[0] = 204;
		idadesTurma[1] = 20;
		idadesTurma[2] = 18;
		idadesTurma[3] = 17;
		idadesTurma[4] = 22;
		idadesTurma[5] = 16;
		System.out.println(idadesTurma[0]);
		
		int idadesTurma2[] = {10,20,23828328,39439493,71,90};
		
		System.out.println(idadesTurma2[0]);
	}
}
