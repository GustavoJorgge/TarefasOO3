package folhadepagamento;

public class FPadrao extends Funcionario{
	
	public FPadrao(int matricula, String nome, double salario) {
		super(matricula,nome,salario);
	}
	
	@Override
	public double calcularProventos() {
		// TODO Auto-generated method stub
		return getSalario();
	}

	@Override
	public String toString() {
		return "FPadrao \n Matricula:" + matricula + "\nNome:" + nome + "\n Salario =" + calcularProventos();
	}
	
	

}
