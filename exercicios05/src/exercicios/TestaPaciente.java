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
		System.out.println("Doen�a     : "+ paciente1.doenca);
		System.out.println("Situa��o   : "+ paciente1.situacao);
		System.out.println("Tratamento : "+ paciente1.tratamento);
		
		paciente1.vivo();
		
		System.out.println();
		
		paciente2.nome = "Maria";
		paciente2.doenca = "C�ncer";
		paciente2.situacao = "Cr�tica";
		paciente2.tratamento = "Sem Tratamentos";

		System.out.println("Paciente   : "+paciente2.nome);
		System.out.println("Doen�a     : "+ paciente2.doenca);
		System.out.println("Situa��o   : "+ paciente2.situacao);
		System.out.println("Tratamento : "+ paciente2.tratamento);
		
		paciente2.morto();
	}

}
