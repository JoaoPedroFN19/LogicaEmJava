import java.util.Scanner;
import java.math.*;

public class Exercicio06Java {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2, total, p1, p2;
		
		System.out.print("Digite o primeiro n�mero: ");
		x1 = leia.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		x2 = leia.nextDouble();
		
		System.out.print("Digite o terceiro n�mero: ");
		y1 = leia.nextDouble();
		
		System.out.print("Digite o quarto n�mero: ");
		y2 = leia.nextDouble();
		
		p1 = Math.pow((x1-x2), 2);
		p2 = Math.pow((y2-y1), 2);
		
		total = Math.sqrt((p1+p2));
		
		System.out.println("A dist�ncia entre eles �: " + total);
		
		leia.close();

	}

}
