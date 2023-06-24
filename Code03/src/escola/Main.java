package escola;

public class Main {
	public static void main(String[] args) {
		/*
		sala turma1 = new sala();
		
		turma1.prof = new Professor();
		turma1.prof.nome = "Tatá";
		
		turma1.alunos = new ArrayList<aluno>();
		turma1.alunos.add(new aluno());

		turma1.alunos.get(0).info();
		System.out.println("Total de alunos: " + turma1.alunos.size());
		*/
		
		aluno aluno1 = new aluno();
		aluno1.nome = "Eduardo";
		
		aluno aluno2 = new aluno("Eduardo braga", "000-555-999-88", 109);
		
		aluno1.info();
		aluno2.info();
		
		aluno.quantidadeDeAlunos();
	}
}
