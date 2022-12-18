package ExerciciosLacos;

import java.util.Scanner;

/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */

public class Exercicio03 {

	public static void main(String[] args) {
		 
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, menosDe21 = 0, maisDe50 = 0;
		
		while (idade != -99) {
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Digite -99 para parar!");
			System.out.println();
			
			if (idade < 21) {
				menosDe21++;
			}
			if (idade > 50) {
				maisDe50++;
			}
		}
		System.out.println("Quantidade de pessoas com menos de 21 anos: " + (menosDe21-1));
		System.out.println("Quantidade de pessoas com mais de 50 anos: " + maisDe50);
		leia.close();
	}

}
