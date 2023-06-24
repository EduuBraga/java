package horario;

public class Horario {
	int hora, minuto, segundo;
	
	Horario(int hora, int minuto, int segundo){
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		
		conferindoValores(hora, minuto, segundo);
	}
	
	Horario(int hora){
		this.hora = hora;
		conferindoValores(hora);
	}
	
	Horario(){
		System.out.println("Nenhum tempo definido.");
	}
	
	void qualHorario () {
		System.out.printf("são %d:%d:%d \n", hora, minuto, segundo);
	}
	
	void conferindoValores(int hora, int minuto, int segundo) {
		if(hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
			this.hora = 0;
			this.minuto = 0;
			this.segundo = 0;
			
			System.out.println("Ocorreu um erro, tente novamente");
		}
	}
	
	void conferindoValores(int hora) {
		int minutoZerado = 0;
		int segundoZerado = 0;
		
		conferindoValores(hora, minutoZerado, segundoZerado);
	}
}
