import java.util.Scanner;

public class Exercicio02Java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idadeAnos, idadeDias, idadeMeses, totalDias;
		
		System.out.print("Quantidade de dias vividos: ");
		totalDias = leia.nextInt();
		
		idadeAnos = totalDias / 365;
		totalDias = totalDias % 365;
		idadeMeses = totalDias / 30;
		totalDias = totalDias % 30;
		
		idadeDias = totalDias;
		
		System.out.println("Sua idade: " + idadeAnos + " Anos, " + idadeMeses + " Meses e " + idadeDias + " Dias");
			
		leia.close();
	}
}
