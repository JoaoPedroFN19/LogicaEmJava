package Exercicio01;
	//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
import java.util.Scanner;

public class Exercicio01Java {
	
	public static void main(String[] args) {
	 
		Scanner leia = new Scanner(System.in);
		
		int a[] = new int[3];
		int maior = 0;
		
		
		
		for(int i=0; i<3; i++){
	        System.out.print("Digite um n�mero : ");
	        a[i] = leia.nextInt();

	        	if (a[i]>maior) {
	        		maior = a[i];
	         }
	     }
	        System.out.println("o maior n�mero �: " + maior);
	        
	        leia.close();
	}
	
}
