package Exercicio01;
 /*
  * Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
  */
import java.util.Scanner;

public class Exercicio04Java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Informe um número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número é par! e o resultado da raiz quadrada desse número é: " + Math.sqrt(numero));
		} 
		else {
			System.out.println("O número é ímpar! e o resultado elevado ao quadrado desse número é: " + Math.pow(numero, 2));
		}
		
		leia.close();

	}

}
