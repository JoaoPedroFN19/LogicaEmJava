import java.util.Scanner;

public class Exercicio07Java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.print("Digite o valor de A: ");
		a = leia.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		b = leia.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		c = leia.nextDouble();
		
		System.out.print("Digite o valor de D: ");
		d = leia.nextDouble();
		
		System.out.print("Digite o valor de E: ");
		e = leia.nextDouble();
		
		System.out.print("Digite o valor de F: ");
		f = leia.nextDouble();
		
		x = ((c*f)-(b*e))/((a*f)-(b*d));
		
		y = ((a*e)-(c*d))/((a*f)-(b*d));
		
		System.out.println("O valor de X é: " + x);
		
		System.out.println("O valor de Y é: " + y);
		
		leia.close();

	}

}
