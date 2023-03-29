package questaocarnaval;

import java.text.NumberFormat;

public class Vip extends Ingresso{
	
	private double valorAdicional;
	NumberFormat z = NumberFormat.getCurrencyInstance();
	
	public Vip(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	
	
	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public String ImprimeValor() {
		return "Valor: " + z.format(getValorAdicional() + this.valor);
		
	}

}
