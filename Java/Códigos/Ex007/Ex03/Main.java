package Ex03;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();
		System.out.print("Informe um novo limite: ");
		double limite = entrada.nextDouble();
		conta.setValorLimite(limite);
		System.out.print("Saque da conta: ");
		double saque = entrada.nextDouble();
		conta.sacar(saque);
		System.out.print("Deposite na conta: ");
		double deposito = entrada.nextDouble();
		conta.depositar(deposito);

	}

}
