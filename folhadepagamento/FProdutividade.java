package folhadepagamento;

public class FProdutividade extends Funcionario {

	private double valor;
	private int producao;
	
	
	
	public FProdutividade(int matricula, String nome, double salario, double valor, int producao) {
		super(matricula, nome, salario);
		this.valor = valor;
		this.producao = producao;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public int getProducao() {
		return producao;
	}



	public void setProducao(int producao) {
		this.producao = producao;
	}

	@Override
	public double calcularProventos() {
		// TODO Auto-generated method stub
		return getSalario()+ (this.valor*this.producao);
	}



	@Override
	public String toString() {
		return "FProdutividade \nMatricula:" + matricula + "\nNome:" + nome + "\nSalario = "+ calcularProventos()+ "\n[valor=" + valor + ", producao=" + producao + "]";
	}



	
	
	


}
