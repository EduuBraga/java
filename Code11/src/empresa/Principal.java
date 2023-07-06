package empresa;

public class Principal {
	public static void main(String[] args) {
		String users[] = {"edu", "vivi99", "bolinha123", "helloMyPi", "Dr. Misterio"};
		
		try {
			//Não tem sentido, mas estou aprendendo :)
			for(int i = 0; i < users.length; i++) {
				System.out.println(i);
				if(users[i] == "vivi99") {
					System.out.println("User existe.");
					break;
				}else {
					throw new UserInexistenteException("Usuário não existe.");
				}
			}
		}
		catch (UserInexistenteException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Processo finalizado.");
		}
	}
}
