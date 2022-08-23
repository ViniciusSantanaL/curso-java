package br.com.cursoJava.estrutura.TesteAlunos;

public class Aluno {
	
	private String nome;
	private int matricula;
	private int idade;
	
	
	public Aluno(String nome, int matricula, int idade) {
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
	}
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno aluno = (Aluno) obj;
		System.out.println(this.nome.contains("c"));
		return this.nome.contains("c");
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
	}
	
}
