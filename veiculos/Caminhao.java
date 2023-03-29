package veiculos;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo{
	
	int eixos;

	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	@Override
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Placa:" + this.placa + "\nAno: " + this.ano,"Caminhao",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Numero de eixos:" + this.eixos,"Caminhao",JOptionPane.INFORMATION_MESSAGE);
	}
}
