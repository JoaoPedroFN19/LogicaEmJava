package Exercicio01;
 /*
  * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
  */
import java.util.Scanner;

public class Exercicio04Java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Informe um n�mero: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O n�mero � par! e o resultado da raiz quadrada desse n�mero �: " + Math.sqrt(numero));
		} 
		else {
			System.out.println("O n�mero � �mpar! e o resultado elevado ao quadrado desse n�mero �: " + Math.pow(numero, 2));
		}
		
		leia.close();

	}

}
