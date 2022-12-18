package exercicios;

public class TestaPaciente {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		Paciente paciente2 = new Paciente();
		
		paciente1.nome = "Carlos";
		paciente1.doenca = "Gripe";
		paciente1.situacao = "leve";
		paciente1.tratamento = "Repouso e remedios";

		System.out.println("Paciente   : "+paciente1.nome);
		System.out.println("Doença     : "+ paciente1.doenca);
		System.out.println("Situação   : "+ paciente1.situacao);
		System.out.println("Tratamento : "+ paciente1.tratamento);
		
		paciente1.vivo();
		
		System.out.println();
		
		paciente2.nome = "Maria";
		paciente2.doenca = "Câncer";
		paciente2.situacao = "Crítica";
		paciente2.tratamento = "Sem Tratamentos";

		System.out.println("Paciente   : "+paciente2.nome);
		System.out.println("Doença     : "+ paciente2.doenca);
		System.out.println("Situação   : "+ paciente2.situacao);
		System.out.println("Tratamento : "+ paciente2.tratamento);
		
		paciente2.morto();
	}

}
