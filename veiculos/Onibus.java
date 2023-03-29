package veiculos;

import javax.swing.JOptionPane;

public class Onibus extends Veiculo{
	
	int assentos;
	
	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	@Override
	public void exibirDados() {
		JOptionPane.showMessageDialog(null,"Placa: " + this.placa + "\nAno: " + this.ano + "\nAssentos: " + this.assentos);
	}
	
}
