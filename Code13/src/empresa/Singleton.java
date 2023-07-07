package empresa;

public class Singleton {
	public int numero;
	private static Singleton instancia = null;
	
	public Singleton() {
		this.numero = 20;
	}
	
	@Override
	public String toString() {
		return "Singleton [numero=" + numero + "]";
	}

	public static Singleton getInstance() {
		if(instancia == null) {
			instancia = new Singleton();
		}
		return instancia;
	}
}
