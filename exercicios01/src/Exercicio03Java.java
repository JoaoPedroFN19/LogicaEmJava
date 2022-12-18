import java.util.Scanner;
public class Exercicio03Java {
	 
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int segundos, minutos, horas, totalSegundos, sobraHoras;
		
		System.out.print("Informe o tempo em segundos: ");
			totalSegundos = leia.nextInt();
			
			horas = totalSegundos / 3600;
			sobraHoras = totalSegundos - (horas * 3600);
			minutos = sobraHoras / 60;
			segundos = sobraHoras - (minutos * 60);
			
			System.out.println("Tempo do evento: " + horas + "H " + minutos + "Min " + segundos + "Seg.");
			
			leia.close();
	}
	
}
