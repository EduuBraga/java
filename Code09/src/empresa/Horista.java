package empresa;

public class Horista extends Funcionario{
	int horas;
	float valorHora;
	
	public Horista(String nome, float valorHora, int horas) {
		super(nome);
		this.valorHora = valorHora;
		this.horas = horas;
	}
	
	public float pagamento() {
		return horas * valorHora;
	}
}
