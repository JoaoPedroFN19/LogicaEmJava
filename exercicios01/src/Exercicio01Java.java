import java.util.Scanner;

public class Exercicio01Java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias, meses, anos, resultado1, resultado2, resultado3, resultado4;
		
		System.out.println("Digite sua idade");
		System.out.print("Anos: ");
		anos = leia.nextInt();
		
		System.out.print("Meses: ");
		meses = leia.nextInt();
		
		System.out.print("Dias: ");
		dias = leia.nextInt();
		
		resultado1 = anos * 365;
		resultado2 = meses * 30;
		resultado3 = resultado1 + resultado2;
		resultado4 = resultado3 + dias;
		
		System.out.println("Sua idade em dias é: " + resultado4);
		
		leia.close();

	}

}
