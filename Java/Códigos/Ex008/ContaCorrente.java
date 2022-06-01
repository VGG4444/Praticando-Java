package br.com.unit.apsu2;

public class ContaCorrente extends Conta {
	public ContaCorrente() {
		saldo = 100;
	}

	private double saldo;
	
	

	public void atualiza(double perc) {
		double percent = ((perc / 100) * 2) * saldo;
		saldo = saldo + percent;
		System.out.println("Novo saldo da Conta Corrente: R$" + saldo);
	}

	public void depositar(double valor) {
		if (valor > 0.1) {
			double deposito = (saldo + valor) - 0.10;
			saldo = deposito;
			System.out.println("Novo saldo: " + saldo);
		} else {
			System.out.println("Insira um valor maior que dez centavos!");
		}

	}
	
	public double getSaldo() {
		return saldo;
	}

}
