package empresa;

public class Comissionado extends Funcionario{
	int venda;
	float comissao;
	
	public Comissionado(String nome, int venda, float comissao) {
		super(nome);
		this.comissao = comissao;
		this.venda = venda;
	}
	
	public float pagamento() {
		return venda * comissao;
	}
}
