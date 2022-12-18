package exercicios;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.nome = "João";
		c1.idade = 19;
		c1.metodoDePagamento = "Cartão de Crédito";
		c1.produto = "Geladeira";
		System.out.println("Nome: " + c1.nome);
		System.out.println("Idade: " + c1.idade);
		System.out.println("Produto: " + c1.produto);
		System.out.println("Forma de Pagamento: " + c1.metodoDePagamento);
		c1.comprar();
		c1.pagar();
		
		System.out.println();
		
		c2.nome = "Emanuel";
		c2.idade = 22;
		c2.metodoDePagamento = "Cartão de Debíto";
		c2.produto = "Cama";
		System.out.println("Nome: " + c2.nome);
		System.out.println("Idade: " + c2.idade);
		System.out.println("Produto: " + c2.produto);
		System.out.println("Forma de Pagamento: " + c2.metodoDePagamento);
		c2.comprar();
		c2.pagar();
		

	}

}
