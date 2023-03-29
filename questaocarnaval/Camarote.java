package questaocarnaval;

import java.text.NumberFormat;

public class Camarote extends Ingresso {
		
	private String localizacao;
	private double valorAdicional;
	NumberFormat z = NumberFormat.getCurrencyInstance();
	
	public Camarote(double valor, String localizacao, double valorAdicional) {
		super(valor);
		this.localizacao = localizacao;
		this.valorAdicional = valorAdicional;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public String ImprimeValor() {
		valor = valor + valorAdicional;
		return "Valor: " + z.format(valor) + "\nLocal:" + localizacao;
	}
	
	
}
