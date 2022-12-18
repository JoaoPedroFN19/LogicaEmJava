package ExerciciosLacos;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, numeroPar = 0, numeroImpar = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número: ");
			numero = entrada.nextInt();
			
			if (numero % 2 == 0) {
				numeroPar++;
			}
			if (numero % 2 == 1) {
				numeroImpar++;
			}
		}
		System.out.println();
		System.out.println("Foram digitados " + numeroPar + " números pares!");
		System.out.println();
		System.out.println("Foram digitados " + numeroImpar + " números ímpares!");
		entrada.close();
	}

}
