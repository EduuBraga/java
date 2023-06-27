package estudo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Iterator;

public class Principal {
	public static void main(String[] args) {
		/*
		Desafio: combine os tópicos abordados nesta aula e construa um HashMap 
		que irá mapear nomes (string) com seus respectivos aniversários representados 
		por um LocalDate. Registre ao menos três aniversários no mapa e depois,
		utilizando um loop, imprima todos os aniversários.
		*/
		
		HashMap<String, String> aniversarios = new HashMap<String, String>();
		DateTimeFormatter formatacaoDataAniversario = DateTimeFormatter.ofPattern("dd/MM");
		
		aniversarios.put("Eduardo", LocalDate.of(2023, 11, 11).format(formatacaoDataAniversario));
		aniversarios.put("Vitória", LocalDate.of(2023, 10, 24).format(formatacaoDataAniversario));
		aniversarios.put("Conceição", LocalDate.of(2023, 06, 30).format(formatacaoDataAniversario));
		
		Iterator it = aniversarios.entrySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
