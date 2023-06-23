package escola;

public class aluno {
	String nome;
	int idade;
	int CPF;
	static final String nomeEscola = "Tabelião";
	
	void info() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + CPF);
		System.out.println("Idade: " + idade);
		System.out.println();
	}
}
