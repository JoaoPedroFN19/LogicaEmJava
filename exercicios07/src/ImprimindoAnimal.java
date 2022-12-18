package br.com.generation.exercicio07;

public class ImprimindoAnimal {

	public static void main(String[] args) {
		
		TesteAnimal ta = new TesteAnimal();
		
		Cachorro cac = new Cachorro();
		cac.setNome("Doguinho");
		cac.setIdade(5);
		
		System.out.println("Nome: " + cac.getNome());
		System.out.println("Idade: " + cac.getIdade());
		ta.fazerAnimalEmitirSom(new Cachorro());
		cac.acao();
		
		System.out.println();
		
		Cavalo cav = new Cavalo();
		cav.setNome("Pegasus");
		cav.setIdade(12);
		
		System.out.println("Nome: " + cav.getNome());
		System.out.println("Idade: " + cav.getIdade());
		ta.fazerAnimalEmitirSom(new Cavalo());
		cav.acao();
		
		System.out.println();
		
		Preguica pre = new Preguica();
		pre.setNome("Brad-Prigui");
		pre.setIdade(20);
		
		System.out.println("Nome: " + pre.getNome());
		System.out.println("Idade: " + pre.getIdade());
		ta.fazerAnimalEmitirSom(new Preguica());
		pre.acao();
	}
}
