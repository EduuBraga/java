package Cofrinho;

public class Principal {
	public static void main(String[] args) {
		Cofre cofrinho = new Cofre();
		
		cofrinho.adicionar("euro", 0.50);
		cofrinho.adicionar("dolar", 2.50);
		cofrinho.adicionar("dolar", 2.70);
		cofrinho.adicionar("real", 5.8);
		cofrinho.adicionar("euro", 1.50);
		cofrinho.adicionar("euro", 2.50);
		
		cofrinho.remover("euro", 1.5);
		cofrinho.remover("real", 5.8);
		
		cofrinho.listagemMoedas();
	}
}
