package estudo;

public class Livro {
	public String autor, titulo;
	public float precoVenda, precoCusto;
	public int numPaginas;
	
	public Livro(String autor, String titulo) {
		this.autor = autor;
		this.titulo = titulo;		
	}
	
	public float custo() {
		return precoVenda - precoCusto;
	}
	
	public float imposto() {
		return 0.2f * custo();
	}
}
