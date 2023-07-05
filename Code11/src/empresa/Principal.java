package empresa;

public class Principal {
	public static void main(String[] args) {
		int numeros[] = {1, 3, 5, 7, 9};
		
		try {
			System.out.println(numeros[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Ocorreu um erro com o valor. " + e.getMessage());
		}
		finally {
			System.out.println("Processo finalizado.");
		}
	}
}
