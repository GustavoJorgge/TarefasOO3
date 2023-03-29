package folhadepagamento;

public class FComissionado extends Funcionario {
	
	private double percentual;
	private double vendas;
	
	public FComissionado(int matricula, String nome, double salario, double percentual, double vendas) {
		super(matricula, nome, vendas);
		this.percentual = percentual;
		this.vendas = vendas;
	}
	
	
	
	public double getPercentual() {
		return percentual;
	}



	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}



	public double getVendas() {
		return vendas;
	}



	public void setVendas(double vendas) {
		this.vendas = vendas;
	}



	@Override
	public double calcularProventos() {
		// TODO Auto-generated method stub
		return getSalario() + (this.vendas * this.percentual);
	}



	@Override
	public String toString() {
		return "FComissionado \n Matricula: "+ matricula + "\n Nome:" + nome + "\n Salario = " + calcularProventos() +"\n[percentual=" + percentual + ", vendas=" + vendas + "]";
	}
	
	
	
	
	
}
