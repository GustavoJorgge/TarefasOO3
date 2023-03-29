package questaocarnaval;

import java.text.NumberFormat;

public class Normal extends Ingresso{
	
	NumberFormat z = NumberFormat.getCurrencyInstance();
		
	public Normal(double valor) {
		super(valor);
		
	}
	
	
	public String imprimeValor() {
		return "Valor:" + z.format(valor);
		
	}
	

}
