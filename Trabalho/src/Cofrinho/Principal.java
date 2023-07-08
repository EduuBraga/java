package Cofrinho;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		Cofre cofrinho = new Cofre();
		cofrinho.listaMoedas = new ArrayList<Moeda>();
		
		cofrinho.adicionar("euro", 0.50);
		
		cofrinho.listaMoedas.get(0).info();
	}
}
