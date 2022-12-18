package Exercicio01;

import java.util.Scanner;

/*
  * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
  */
public class Exercicio03Java {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe a idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.print("Infantil");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.print("Juvenil");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.print("Adulto");
		}
		else {
			System.out.print("Idade sem categoria!");
		}
		
		leia.close();
	}

}
