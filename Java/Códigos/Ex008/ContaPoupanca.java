package br.com.unit.apsu2;

public class ContaPoupanca extends Conta {
	private double saldo;
	
	public ContaPoupanca() {
		saldo = 100;
	}
	
	public void atualiza(double perc) {
		double percent = ((perc/100)*3) * saldo;
		saldo = saldo + percent;
		System.out.println("Novo saldo da Conta Poupança: R$" +  saldo);
	}
	
	public double getSaldo() {
		return saldo;
	}

}
