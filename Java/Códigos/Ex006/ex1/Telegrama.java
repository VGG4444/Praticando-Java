package br.com.unit.ex1;

public class Telegrama extends Documento {
	private int QuantCaracter;
	private double ValorTelegrama;
	
	public int getQuantCaracter() {
		return QuantCaracter;
	}
	public void setQuantCaracter(int quantCaracter) {
		QuantCaracter = quantCaracter;
	}
	public double getValorTelegrama() {
		return ValorTelegrama;
	}
	public void setValorTelegrama(double valorTelegrama) {
		ValorTelegrama = valorTelegrama;
	}
	
	public void Imprimir() {
        System.out.println("----------------");
		System.out.println(this.QuantCaracter + " " + this.ValorTelegrama);
        System.out.println("----------------");
	}
	public void Pagar() {
		System.out.println("Efetuando Pagamento...");
	}
}
