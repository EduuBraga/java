package empresa;

public class Principal {
	public static void main(String[] args) {
		//Igualdade && equals
		Usuario u1 = new Usuario(66, "Kenji", "111222333");
		Usuario u2 = new Usuario(677, "Kanna", "111222333");
		Usuario u3 = u1;
		
		System.out.println(u1 == u2);
		System.out.println(u1 == u3);
		
		//toString()
		System.out.println(u1);
		System.out.println(u2);
	}
}
