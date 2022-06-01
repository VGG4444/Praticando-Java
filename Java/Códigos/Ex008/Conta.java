package br.com.unit.apsu2;

public class Conta {
	private static double saldo;

	public Conta() {
		saldo = 100;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		Conta.saldo = saldo;
	}

	public void sacar(double valor) {
		if (valor > Conta.saldo) {
			System.out.println("Saldo indisponível!");
		}
		if (valor < Conta.saldo) {
			double saque = saldo - valor;
			saldo = saque;
			System.out.println("Novo saldo: R$" + saldo);
		}

	}

	public void depositar(double valor) {
		double deposito = saldo + valor;
		saldo = deposito;
		System.out.println("Novo saldo: R$" + saldo);
	}

	public void atualiza(double perc) {
		double percent = (perc / 100) * saldo;
		saldo = saldo + percent;
		System.out.println("Novo saldo: R$" + saldo);
	}

}
