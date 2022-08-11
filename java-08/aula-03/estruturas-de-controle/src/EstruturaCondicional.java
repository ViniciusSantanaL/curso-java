
public class EstruturaCondicional {
	public static void main(String[] args) {
		 
		// && -> E
		// || -> OU
		// ! -> Negação
		 
//		 if(jaChoveuHoje) {
//			 System.out.println("Ebaaa já choveu !!");
//			 
//		 } else if(jaTomouBanhoHoje) {
//			 System.out.println("Hmmm To de banho tomado");
//		 } else if(jaTomouAguaHoje) {
//			 System.out.println("O pai ta hidratado");
//		 } else {
//			 System.out.println("Aff Não Choveu !!");
//		 }
		 
		 boolean jaTomouBanhoHoje = true;
//		 if(jaChoveuHoje && jaTomouBanhoHoje) {
//			 System.out.println("O Banho de Chuva foi muito bom !!");
//		 }
		 boolean jaChoveuHoje = true;
		 boolean jaTomouAguaHoje = false;

		 if(jaTomouAguaHoje || jaChoveuHoje) {
//			 System.out.println("Preciso tomar mais agua de chuva");
		 } 
//		 && V - V = V
//		 && V - F = F
//		 && F - F = F
//		 && F - V = F
		 
//		 || V - V = V
//		 || V - F = V
//		 || F - V = V
//		 || F - F = F
//		 if((jaTomouAguaHoje && jaChoveuHoje) || jaTomouBanhoHoje) {
//			 System.out.println("Ja fiz tudo do meu dia");
//		 }
		 
		 int idade = 18;
		 if(idade > 18) {
			 System.out.println("Eu sou maior de 18 anos");
		 }else if(idade == 18) {
			 System.out.println("Dizoitou");
		 } else {
			 System.out.println("Xiii, não poder tchuma uma");
		 }
		

		 
//		 System.out.println("Mas as flores estão lindas");
//		 System.out.println("E o dia ta ótimo");
		 
	}
}
