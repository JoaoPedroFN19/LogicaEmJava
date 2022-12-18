import java.util.Scanner;
import java.math.*;

public class Exercicio06Java {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2, total, p1, p2;
		
		System.out.print("Digite o primeiro número: ");
		x1 = leia.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		x2 = leia.nextDouble();
		
		System.out.print("Digite o terceiro número: ");
		y1 = leia.nextDouble();
		
		System.out.print("Digite o quarto número: ");
		y2 = leia.nextDouble();
		
		p1 = Math.pow((x1-x2), 2);
		p2 = Math.pow((y2-y1), 2);
		
		total = Math.sqrt((p1+p2));
		
		System.out.println("A distância entre eles é: " + total);
		
		leia.close();

	}

}
