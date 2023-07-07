package empresa;

public class Principal {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		s1.numero += 30;
		
		System.out.println(s1.numero + " | " + s2.numero);
		
		s2.numero = 60;
		
		System.out.println(s1.numero + " | " + s2.numero);	
	}
}
