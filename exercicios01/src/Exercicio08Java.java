import java.util.Scanner;

public class Exercicio08Java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double carroNovo, custoFabricacao, distribuidor;
		double imposto, distribuidorEImposto1, distribuidorEImposto2;
		double distribuidorEImpostoFinal;
		
		System.out.print("Pre�o de F�brica: ");
		custoFabricacao = leia.nextDouble();
		
		imposto = 0.45;
		distribuidor = 0.28;
		
		distribuidorEImposto1 = custoFabricacao * imposto;
		distribuidorEImposto2 = custoFabricacao * distribuidor;
		distribuidorEImpostoFinal = distribuidorEImposto1 + distribuidorEImposto2;
		
		carroNovo = distribuidorEImpostoFinal + custoFabricacao;
		
		System.out.println("Pre�o do consumidor: R$" + carroNovo);
					
		
		leia.close();
	}

}
