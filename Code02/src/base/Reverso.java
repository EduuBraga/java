package base;

import java.util.*;

public class Reverso {
	public static void main(String[] args) {
		int qtd;
		String nameInput;
		Scanner userInput = new Scanner(System.in);
		ArrayList<String> listNames = new ArrayList<String>();
		
		System.out.println("Indique o número de nomes que você irá ditar:");
		qtd = userInput.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			System.out.printf("%dº número: ", i + 1);
			nameInput = userInput.next();
			listNames.add(nameInput);
		}
		
		Collections.reverse(listNames);
		System.out.println("Ordem ao contrário:");
		
		for(int i = 0; i < qtd; i++) {
			System.out.printf("%dº número: ", i + 1);
			System.out.printf("%s \n", listNames.get(i));
		}
		
		userInput.close();
	}
}
