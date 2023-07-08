package Cofrinho;

import java.util.ArrayList;
import java.util.Iterator;

enum tipoDeMoeda{
	real,
	dolar,
	euro
}

public class Cofre {
	public ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(String moeda, double valor) {	
		if(moeda == "dolar") {
			listaMoedas.add(new Dolar(valor));
		}
		else if(moeda == "euro") {
			listaMoedas.add(new Euro(valor));
		}
		else if(moeda == "real") {
			listaMoedas.add(new Real(valor));
		}
	}
	
	void test() {
		Iterator<Moeda> iteratorMoedas = listaMoedas.iterator();
		
		while(iteratorMoedas.hasNext()) {
			Moeda moedaDaVez = iteratorMoedas.next();
			System.out.print("é Dolar? ");
			System.out.print(moedaDaVez instanceof Dolar);
			System.out.println();
			
			System.out.print("é Euro? ");
			System.out.print(moedaDaVez instanceof Euro);
			System.out.println();
			
			System.out.print("é Real? ");
			System.out.print(moedaDaVez instanceof Real);
			System.out.println();
		}
	}
	
	private void removerMoeda(Moeda moedaDaVez, double valor, int indexDoArray) {
		if(moedaDaVez.valor == valor) {
			listaMoedas.remove(indexDoArray);
		}
	}
	
	public void remover(String moedaParam, double valorParam) {
		for(int i = 0; i < listaMoedas.size(); i++) {
			Moeda moedaDaVez = listaMoedas.get(i);
			
			if(moedaDaVez instanceof Dolar && moedaParam == "dolar") {
				removerMoeda(moedaDaVez, valorParam, i);
			}
			else if(moedaDaVez instanceof Real && moedaParam == "real") {
				removerMoeda(moedaDaVez, valorParam, i);
			}
			else if(moedaDaVez instanceof Euro && moedaParam == "euro") {
				removerMoeda(moedaDaVez, valorParam, i);
			}
		}
	}
	
	public void listagemMoedas() {
		Iterator<Moeda> it = listaMoedas.iterator();
		
		while(it.hasNext()) {
			Moeda moeda = it.next();
			moeda.info();
		}
	}
}
