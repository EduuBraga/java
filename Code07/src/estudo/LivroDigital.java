package estudo;

public class LivroDigital extends Livro{
	public float MB;
	public String linkDownload;
	
	public LivroDigital(String autor, String titulo, String linkDownload) {
		super(autor, titulo);
		this.linkDownload = linkDownload;
	}
	
	public float imposto() {
		return 0.2f * custo() + 5;
	}
	
	public void imprimirImposto() {
		System.out.println(super.imposto());
		System.out.println(this.imposto());
	}
}
