package exercicios;

public class TestaContaBanco {

	public static void main(String[] args) {
		
		ContaBanco conta = new ContaBanco();
		ContaBanco conta1 = new ContaBanco();
		
		conta.numero = "123456789";
		conta.agencia = "1111";
		conta.banco = "Bradesco";
		conta.titular = "João Pedro";
		conta.saldo = 1000.0;
		conta.limite = 3000.0;

		System.out.println("Titular : " +conta.titular);
		System.out.println("Banco : "+conta.banco);
		System.out.println("Número : "+conta.numero);
		System.out.println("Agencia : "+ conta.agencia);
		
		conta.verSaldo();
		conta.verLimite();
		
		System.out.println("Saldo Atual: "+conta.saldo + " | Limite disponivel : " + conta.limite);
		
		System.out.println();
		
		conta1.numero = "987654321";
		conta1.agencia = "1001";
		conta1.banco = "Itau";
		conta1.titular = "Emanuel";
		conta1.saldo = 500.0;
		conta1.limite = 5000.0;

		System.out.println("Titular : " +conta1.titular);
		System.out.println("Banco : "+conta1.banco);
		System.out.println("Número : "+conta1.numero);
		System.out.println("Agencia : "+ conta1.agencia);
		
		conta1.verSaldo();
		conta1.verLimite();
		
		System.out.println("Saldo Atual: "+conta1.saldo + " | Limite disponivel : " + conta1.limite);

	}

}
