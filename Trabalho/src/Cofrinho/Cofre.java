package Cofrinho;

import java.util.HashMap;

enum tipoDeMoeda{
	real,
	dolar,
	euro
}

public class Cofre {
	public HashMap<String, Moeda> listaMoedas;
	
	public void adicionar(String moeda, double valor) {	
		if(moeda == "dolar") {
			listaMoedas.put("Dolar", new Dolar(valor));
		}
		else if(moeda == "euro") {
			listaMoedas.put("Euro", new Euro(valor));
		}
		else if(moeda == "real") {
			listaMoedas.put("real", new Real(valor));
		}
		else {
			System.out.println("Tipo de moeda não encontrada");		
		}
	}
	
	public void remover(String moeda, double valor) {
		if(moeda == "dolar") {
			
		}
		else if(moeda == "euro") {
			
		}
		else if(moeda == "real") {
			
		}
		else {
				
		}
	}
}
