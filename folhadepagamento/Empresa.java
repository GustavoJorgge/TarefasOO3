package folhadepagamento;

public class Empresa {
	
	public static void main(String[]args) {
		
		FPadrao padrao = new FPadrao(123,"Guilherme",1000);
		System.out.printf("\n------------------------------\n");
		System.out.println(padrao.toString());
		
		FProdutividade prod = new FProdutividade(1234,"Fernanda",1000,500,2);
		System.out.printf("\n------------------------------\n");
		System.out.println(prod.toString());
		
		FComissionado comissao = new FComissionado (12345,"Guilherme",1000,3,1000);		
		System.out.printf("\n------------------------------\n");
		System.out.println(comissao.toString());
	}
	
}
