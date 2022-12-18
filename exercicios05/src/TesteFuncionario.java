package exercicios;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario();
		Funcionario fun2 = new Funcionario();
		
		fun1.nome = "Cleiton";
		fun1.idade = 23;
		fun1.cidade = "Sao Paulo";
		fun1.cargo = "Markting";

		System.out.println("Nome: " + fun1.nome);
		System.out.println("Idade: " + fun1.idade);
		System.out.println("Cidade: " + fun1.cidade);
		System.out.println("Cargo: " + fun1.cargo);
		fun1.entrada();
		fun1.saida();
		
		System.out.println();
		
		fun2.nome = "Emanuel";
		fun2.idade = 23;
		fun2.cidade = "Sao Paulo";
		fun2.cargo = "Desenvolvedor";
		System.out.println("Nome: " + fun2.nome);
		System.out.println("Idade: " + fun2.idade);
		System.out.println("Cidade: " + fun2.cidade);
		System.out.println("Cargo: " + fun2.cargo);
		fun2.entrada();
		fun2.saida();

	}

}
