package empresa;

public class Principal {
	public static void main(String[] args) {
		Funcionario funcionarios[] = {
				new Horista("Douglas", 5, 8), 
				new Comissionado("Silas", 10000, 0.1f),
				new Assalariado("Eduardo", 1355)
		};
		
		Funcionario f;
		for (int i = 0; i < funcionarios.length; i++) {
			f = funcionarios[i];
			
			System.out.println(f.nome + " ganha: " + f.pagamento());
		}
	}
}
