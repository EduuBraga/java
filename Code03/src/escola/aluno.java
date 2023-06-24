package escola;

public class aluno {
	String nome, cpf;
	int matricula;
	static int qtdAlunos = 0;
	
	aluno(){
		qtdAlunos++;
		
		System.out.println("Aluno cadastrado sem parâmetros");
		this.nome = "Vazio";
		this.matricula = 0000;
		this.cpf = "000-000-000-00";		
	}
	
	aluno(String nome, String cpf, int matricula){
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		
		qtdAlunos++;
	}
	
	void info() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Matricula: " + matricula);
		System.out.println("---------------------------------");
	}
	
	static void quantidadeDeAlunos() {
		System.out.println("Foram cadastrados: " + qtdAlunos);
	}
}
