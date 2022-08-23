package br.com.cursoJava.estrutura.TesteAlunos;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SalaDeAula {
	private Set<Aluno> alunos = new HashSet<Aluno>();
	public static int QUANTIDADE_ALUNO = 0;
	
	public void matriculaAluno(Aluno aluno) {
		QUANTIDADE_ALUNO++;
		this.alunos.add(aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}
	
	public boolean isMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
}
