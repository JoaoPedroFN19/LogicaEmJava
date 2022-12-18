package exercicios;

public class TestePatinete {

	public static void main(String[] args) {
		
		Patinete pat1 = new Patinete();
		Patinete pat2 = new Patinete();
		
		pat1.tipo = "Manual";
		pat1.rodas = 2;
		pat1.material = "Plástico e metal";
		System.out.println("Tipo : "+ pat1.tipo);
		System.out.println("Rodas : "+ pat1.rodas);
		System.out.println("Material : "+ pat1.material);
		pat1.acelerar();
		pat1.desacelerar();

		System.out.println();
		
		pat2.tipo = "Elétrico";
		pat2.rodas = 2;
		pat2.material = "Borracha e metal";
		System.out.println("Tipo : "+ pat2.tipo);
		System.out.println("Rodas : "+ pat2.rodas);
		System.out.println("Material : "+ pat2.material);
		pat2.acelerar();
		pat2.desacelerar();
		
	}

}
