package escola;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		sala turma1 = new sala();
		
		turma1.prof = new Professor();
		turma1.prof.nome = "Tatá";
		
		turma1.alunos = new ArrayList<aluno>();
		turma1.alunos.add(new aluno());
		turma1.alunos.get(0).nome = "Eduardo";
		turma1.alunos.get(0).CPF = 456464;
		turma1.alunos.get(0).idade = 19;

		turma1.alunos.get(0).info();
		System.out.println("Total de alunos: " + turma1.alunos.size());
	}
}
