package Exercicio01;
	//Faça um programa que receba três inteiros e diga qual deles é o maior.
import java.util.Scanner;

public class Exercicio01Java {
	
	public static void main(String[] args) {
	 
		Scanner leia = new Scanner(System.in);
		
		int a[] = new int[3];
		int maior = 0;
		
		
		
		for(int i=0; i<3; i++){
	        System.out.print("Digite um número : ");
	        a[i] = leia.nextInt();

	        	if (a[i]>maior) {
	        		maior = a[i];
	         }
	     }
	        System.out.println("o maior número é: " + maior);
	        
	        leia.close();
	}
	
}
