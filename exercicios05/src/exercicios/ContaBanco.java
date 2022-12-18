package exercicios;

public class ContaBanco {
	
	String numero;
	String agencia;
	String banco;
	String titular;
	double saldo;
	double limite;
	int cheques;
	boolean credito;
	boolean statusConta = true;


	void verSaldo() {
		System.out.println("Verificando saldo...");
	}

	void verLimite() {
		System.out.println("Verificando limite...");
	}
}
