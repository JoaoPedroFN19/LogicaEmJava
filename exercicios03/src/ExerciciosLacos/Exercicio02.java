package ExerciciosLacos;

import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, numeroPar = 0, numeroImpar = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "� n�mero: ");
			numero = entrada.nextInt();
			
			if (numero % 2 == 0) {
				numeroPar++;
			}
			if (numero % 2 == 1) {
				numeroImpar++;
			}
		}
		System.out.println();
		System.out.println("Foram digitados " + numeroPar + " n�meros pares!");
		System.out.println();
		System.out.println("Foram digitados " + numeroImpar + " n�meros �mpares!");
		entrada.close();
	}

}
