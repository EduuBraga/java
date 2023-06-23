package escola;

public class sala {
	public static void main(String[] args) {
		aluno aluno1 = new aluno();
		aluno aluno2 = new aluno();
		
		aluno1.nome = "Eduardo";
		aluno1.CPF = 11028921;
		aluno1.idade = 19;
		
		aluno2.nome = "Vitória";
		aluno2.CPF = 1000021349;
		aluno2.idade = 19;
		
		aluno1.info();
		aluno2.info();
		
		aluno.quantidadeAluno();
	}
}
