package veiculos;

import javax.swing.JOptionPane;

public class veiculosMain {
	public static void main (String[]args) {
		
		String placaOnibus = JOptionPane.showInputDialog("Entre com a placa do onibus: ");
		int anoOnibus = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Ano do veiculo: "));
		int assentos = Integer.parseInt(JOptionPane.showInputDialog("Quantos assentos possui no veiculo:"));
		Onibus onibus = new Onibus(placaOnibus,anoOnibus,assentos);
		
		onibus.exibirDados();
		
		String placaCaminhao = JOptionPane.showInputDialog("Entre com a placa do caminhao: ");
		int anoCaminhao = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Ano do veiculo: "));
		int eixos = Integer.parseInt(JOptionPane.showInputDialog("Quantos eixos possui no caminhão: "));
		Caminhao caminhao = new Caminhao(placaCaminhao,anoCaminhao,eixos);
		
		caminhao.exibirDados();
	}
}
