package br.com.cursoJava.estrutura.TesteAlunos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteAlunos {
	public static void main(String[] args) {
		SalaDeAula sala = new SalaDeAula();
		Set<String> nomes = new HashSet<String>();
		nomes.add("Vinicius");
		nomes.add("Lucas");
		nomes.add("Neiva");
		nomes.add("Enzo");
		nomes.add("Enzo");
		nomes.add("Enzo");
		
		List<String> nomesArray = new ArrayList<String>();
		nomesArray.add("Vinicius");
		nomesArray.add("Lucas");
		nomesArray.add("Neiva");
		nomesArray.add("Enzo");
		nomesArray.add("Enzo");
		nomesArray.add("Enzo");
		nomesArray.get(0);
		
//		System.out.println(nomes);
//		System.out.println(nomesArray);
		
		Aluno aluno = new Aluno("Vinicus", 5471);
		Aluno aluno1 = new Aluno("Vinicus", 1234);
		Aluno aluno2 = new Aluno("Viviane", 1234);
		sala.matriculaAluno(aluno);
		sala.matriculaAluno(aluno1);
		sala.matriculaAluno(aluno2);
		System.out.println(aluno.equals(aluno1));
		System.out.println(aluno == aluno1);
		Set<Aluno> alunosMatriculados = sala.getAlunos();
		
		for (Aluno alun : alunosMatriculados) {
			System.out.println(alun);
		}
		
	}
}
