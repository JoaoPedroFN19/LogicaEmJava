package ExerciciosLacos;

/*
 * Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int soma = 0, numero;
		double media;

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			if(numero % 3 == 0) {
				soma = soma + numero;
			}

		}while(numero != 0);
				media = soma / 2;

		System.out.println("A média dos números é: " + media);

		leia.close();

	}

}
