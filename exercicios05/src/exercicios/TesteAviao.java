package exercicios;

public class TesteAviao {

	public static void main(String[] args) {
		
		Aviao a1 = new Aviao();
		Aviao a2 = new Aviao();
		
		a1.ano = 1992;
		a1.modelo = "777-200ER";
		a1.marca = "Boeing";
		System.out.println("Marca: " + a1.marca);
		System.out.println("Modelo: " + a1.modelo);
		System.out.println("Ano: " + a1.ano);
		a1.decolar();
		a1.pousar();
		
		System.out.println();
		
		a2.ano = 1992;
		a2.modelo = "A350-900";
		a2.marca = "Airbus";
		System.out.println("Marca: " + a2.marca);
		System.out.println("Modelo: " + a2.modelo);
		System.out.println("Ano: " + a2.ano);
		a2.decolar();
		a2.pousar();
		
	}

}
