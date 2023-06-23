package base;

import java.util.Scanner;

public class leonidas {

	public static void main(String[] args) {
		boolean controleLoop = true;
		int numberInput;
		
		System.out.println("A dúvida é: Quantos soldados os 300 iram infrentar?");
		Scanner userinput = new Scanner(System.in);
		
		while(controleLoop) {
			numberInput = userinput.nextInt();
			
			if(numberInput > 15000 || numberInput < 5000) 
				System.out.println("Você está longe.");
			
			else if(numberInput > 12000 || numberInput < 8000) 
				System.out.println("Você está chegando perto.");
			
			else if(numberInput < 9000 || numberInput > 11000) 
				System.out.println("Você está bem próximo!");
			
			else if(numberInput == 10000) {
				System.out.println("Parabéns! você matou sua dúvida.");
				controleLoop = false;
			}
		}
		
		userinput.close();
	}

}
