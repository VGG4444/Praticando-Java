package br.com.unit.apsu2;

import java.util.Scanner;

/*Crie uma classe Conta que possua um atributo saldo e os métodos para pegar saldo, depositar e sacar.
Adicione um método na classe Conta, que atualiza essa conta de acordo com uma taxa percentual fornecida pelo usuário.                                                                      public void atualiza (double taxa)
Crie duas subclasses da classe Conta: ContaCorrente e ContaPoupanca. Ambas terão o método atualiza, isto é, método reescrito.
A classe ContaCorrente deve atualizar-se com o dobro da taxa e a ContaPoupanca deve atualizar-se com o triplo da taxa.
Além disso, a ContaCorrente deve reescrever o método deposita, a fim de retirar uma taxa bancária de dez centavos de cada depósito.
Crie uma classe com método main e instancie essas classes, atualize-as e veja o resultado.
DICA: use a palavra-chave super nos métodos atualiza reescritos, para não ter de refazer o trabalho.*/

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Conta conta = new Conta();
		ContaCorrente contaC = new ContaCorrente();
		ContaPoupanca contaP = new ContaPoupanca();

		System.out.print("Informe um saldo: ");
		double saldo = entrada.nextDouble();
		conta.setSaldo(saldo);

		while (true) {
			System.out.println("-------------------------------");
			System.out.println("Informe uma ação: \n" + "1- Depositar\n" + "2- Sacar\n" + "3- Atualizar\n"
					+ "4- Depositar na Conta Corrente\n"
					+ "5- Pegar Saldo");
			System.out.println("-------------------------------");
			String escolha = entrada.next();
			switch (escolha) {
			case "1":
				System.out.print("Qual quantia você deseja despositar? ");
				double deposito = entrada.nextDouble();
				conta.depositar(deposito);
				break;
			case "2":
				System.out.print("Qual quantia você deseja sacar? ");
				double saque = entrada.nextDouble();
				conta.sacar(saque);
				break;
			case "3":
				System.out.print("Informe um percentual: ");
				double perc = entrada.nextDouble();
				conta.atualiza(perc);
				contaC.atualiza(perc);
				contaP.atualiza(perc);
				break;
			case "4":
				System.out.print("Qual quantia você deseja despositar na Conta Corrente? ");
				double depositoC = entrada.nextDouble();
				contaC.depositar(depositoC);
				break;
			case "5":
				double saldoA = conta.getSaldo();
				System.out.println("Saldo atual: R$" + saldoA);
				
				double saldoAC = contaC.getSaldo();
				System.out.println("Saldo atual na Conta Corrente: R$" + saldoAC);
				
				double saldoAP = contaP.getSaldo();
				System.out.println("Saldo atual na Conta Poupança: R$" + saldoAP);

			}
		}

	}

}
