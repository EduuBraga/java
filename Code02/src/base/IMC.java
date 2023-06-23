package base;

import java.util.*;

public class IMC {

	public static void main(String[] args) {
		/* CAUCULANDO IMC */
		Scanner userinput = new Scanner(System.in);
		int peso;
		double altura;
		
		System.out.print("Qual o seu peço? ");
		peso = userinput.nextInt();
	
	
		System.out.print("Qual a sua altura? ");
		altura = userinput.nextDouble();  
		
		double calcIMC = peso / (altura * altura); 
		System.out.println(calcIMC);
		System.out.printf("Seu IMC é: %.2f", calcIMC);
		
		userinput.close();
	}

}
