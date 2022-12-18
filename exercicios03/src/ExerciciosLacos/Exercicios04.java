package ExerciciosLacos;

/*
 * Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 */

import java.util.Scanner;

public class Exercicios04 {

	public static void main(String[] args) {
		
		int idade = 0, sexo = 0, caracPsicologicas = 0;
		int numPessoas = 0, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0;
		int pessoasNervosasComMais40 = 0, pessoasCalmasComMenos18 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while(numPessoas < 150) { 
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println();
			
			while (idade <= 0 && idade >= 100) {
				System.out.print("Digite a idade: ");
				idade = leia.nextInt();
				System.out.println();
			}
			System.out.print("1- Feminino \n2- Masculino \n3- Outros \nDigite o Sexo: ");
			sexo = leia.nextInt();
			System.out.println();
			
			while (sexo < 1 && sexo > 3) {
				System.out.print("1- Feminino \n2- Masculino \n3- Outros \nDigite o Sexo: ");
				sexo = leia.nextInt();
				System.out.println();
			}
			System.out.print("1- Calma \n2- Nervosa \n3- Agressiva \nDigite a Característica Psicológica: ");
			caracPsicologicas = leia.nextInt();
			System.out.println();
			
			while(caracPsicologicas < 1 && caracPsicologicas > 3) {
				System.out.print("1- Calma \n2- Nervosa \n3- Agressiva \nDigite a Característica Psicológica: ");
				caracPsicologicas = leia.nextInt();
				System.out.println();
			}
			if (caracPsicologicas == 1 ) {
				pessoasCalmas++;
			}
			if (sexo == 1 && caracPsicologicas == 2) {
				mulheresNervosas++;
			}
			if (sexo == 2 && caracPsicologicas == 3) {
				homensAgressivos++;
			}
			if (sexo == 3 && caracPsicologicas == 1) {
				outrosCalmos++;
			}
			if(caracPsicologicas == 2 && idade > 40) {
				pessoasNervosasComMais40++;
			}
			if(caracPsicologicas == 1 && idade < 18) {
				pessoasCalmasComMenos18++;
			}
			numPessoas++;
		}
		System.out.println();
		System.out.println("Número de pessoas calmas: " + pessoasCalmas);
		System.out.println("Número de mulheres nervosas: " + mulheresNervosas);
		System.out.println("Número de homens agressivos: " + homensAgressivos);
		System.out.println("Número de outros calmos: " + outrosCalmos);
		System.out.println("Número de pessoas nervosas com mais de 40 anos : " + pessoasNervosasComMais40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: " + pessoasCalmasComMenos18);
		
		leia.close();
	}

}
