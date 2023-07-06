package empresa;

public class UserInexistenteException extends Exception{
	public UserInexistenteException(String message){
		super(message);
	}
}
