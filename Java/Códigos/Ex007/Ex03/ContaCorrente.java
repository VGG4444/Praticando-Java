package Ex03;

public class ContaCorrente {
	private Pessoa usuário;
	private double limite;
	private double saldo;
	private double valorLimite;
	
	public ContaCorrente(){
		this.limite = 50;
		this.saldo = 5;
		
	}

	public void sacar(double valor) {
		try {
			if (valor > this.saldo) {
				throw new Exception("Saldo indisponível!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void depositar(double valor) {
		try {
			if (valor + (this.limite) > this.valorLimite) {
				throw new Exception("Excedeu o limite!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public void setValorLimite(double valor) {
		this.valorLimite = valor;
		try {
			if (valor < 0) {
				throw new Exception("Limite negativo!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	

}
