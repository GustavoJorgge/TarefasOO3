package questaocarnaval;

import javax.swing.JOptionPane;

public class CarnavalPrincipal {

	public static void main(String[]args) {
		
		double valor;
		double adicional;
		String localizacao;
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Entre com a sua escolha:\n 1 - Ingresso Normal\n 2 - Area VIP\n 3 - Camarote "));
		
		switch(escolha) {
		case 1:
			valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));
			Normal ingressoNormal = new Normal(valor);
			JOptionPane.showMessageDialog(null,ingressoNormal.imprimeValor(),"Pedido Pista",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));
			adicional = Double.parseDouble(JOptionPane.showInputDialog("Entre com valor adicional:"));
			Vip ingressoVip = new Vip (valor,adicional);
			JOptionPane.showMessageDialog(null,ingressoVip.ImprimeValor(),"Pedido Vip",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));
			adicional = Double.parseDouble(JOptionPane.showInputDialog("Entre com valor adicional:"));
			localizacao = JOptionPane.showInputDialog("Entre com valor adicional:");
			Camarote ingressoCamarote = new Camarote(valor,localizacao, adicional);
			JOptionPane.showMessageDialog(null, ingressoCamarote.ImprimeValor(),"Pedido Camarote",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Saindo!","Pedido Camarote",JOptionPane.ERROR);
			default:
		}
		
		
	}
	
}
