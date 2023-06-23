package estudo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
	    System.out.println("Qual sua idade? ");
	    int Idade = userinput.nextInt();
	    
	    System.out.println("Em que ano você nasceu?");
	    int dtNascimento = userinput.nextInt();
	    
	    System.out.printf("Você nasceu em %d \n", dtNascimento);
	    
	    for(int i = 1; i != Idade + 1; i++) {
	    	dtNascimento += 1; 
	    	
	    	if(i == 1) 
	    		System.out.printf("Em %d você fez %d ano \n", dtNascimento, i);
	    	else
	    		System.out.printf("Em %d você fez %d anos \n", dtNascimento, i);
	    	
	    	if(i == Idade)
	    		System.out.printf("Atualmente em %d você tem (ou vai fazer) %d anos", dtNascimento + 1, Idade + 1);
	    }
	}
}
