package horario;

public class Principal {
	public static void main(String[] args) {
		/*
		EXERCÍCIO - Crie uma classe Horario com os atributos inteiros, hora, minuto e segundo. 
		Crie três construtores, um que recebe três parâmetros e inicia os três 
		atributos com os valores passados, outro que recebe apenas a hora e 
		outro vazio. Caso algum dos valores inicializados não esteja no intervalo 
		adequado (hora entre 0 e 23, minutos e segundos entre 0 e 59), inicialize 
		o valor em questão em zero e emita uma mensagem de erro.
		*/
		
		
		Horario novoHorario = new Horario(22, 02, 25);
		Horario novoHorario2 = new Horario(16);
		Horario novoHorario3 = new Horario(25);
		
		novoHorario.qualHorario();
		novoHorario2.qualHorario();
		novoHorario3.qualHorario();
	}
}
