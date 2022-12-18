package exercicios;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico pe1 = new ProdutoEletronico();
		ProdutoEletronico pe2 = new ProdutoEletronico();
		
		pe1.marca = "Iphone";
		pe1.aparelho = "Celular";
		pe1.ano = 2021;
		pe1.modelo = "Iphone11";
		System.out.println("Marca: " + pe1.marca);
		System.out.println("Celular: " + pe1.aparelho);
		System.out.println("Ano: " + pe1.ano);
		System.out.println("Modelo: " + pe1.modelo);
		pe1.ligar();
		pe1.desligar();
		
		System.out.println();
		
		pe2.marca = "Samsung";
		pe2.aparelho = "Celular";
		pe2.ano = 2021;
		pe2.modelo = "S20";
		System.out.println("Marca: " + pe2.marca);
		System.out.println("Celular: " + pe2.aparelho);
		System.out.println("Ano: " + pe2.ano);
		System.out.println("Modelo: " + pe2.modelo);
		pe2.ligar();
		pe2.desligar();
		
	}

}
