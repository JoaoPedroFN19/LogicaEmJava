import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double r, s, d;
		int a, b, c;
		
		System.out.print("Digite o primeiro n�mero: ");
		a = leia.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		b = leia.nextInt();
		
		System.out.print("Digite o terceiro n�mero: ");
		c = leia.nextInt();
		
		r = (a + b ) ^ 2;
		s = (b + c ) ^ 2;
		d = (r + s ) / 2;
		
		System.out.println("O resultado do c�lculo � " + d);
		
		leia.close();

	}

}
