package estudo;

public class Principal {
	public static void main(String[] args) {
		Livro livroF1 = new Livro("Edward Finegan","OCA Java SE 8: Guia de Estudos");
		LivroDigital livroD1 = new LivroDigital("Código Limpo", "Robert C. Martin", "https://www.amazon.com.br/Código-limpo");
		
		livroD1.imprimirImposto();
		
		System.out.println(livroF1 instanceof Livro);
		System.out.println(livroD1 instanceof Livro);
		System.out.println(livroF1 instanceof LivroDigital);
		System.out.println(livroD1 instanceof LivroDigital);
	}
}
