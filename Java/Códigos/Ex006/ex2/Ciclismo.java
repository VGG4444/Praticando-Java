package br.com.unit.ex2;

public class Ciclismo extends Bicicleta {
	private int espessuraPneu;

	public int getEspessuraPneu() {
		return espessuraPneu;
	}
	public void setEspessuraPneu(int espessuraPneu) {
		this.espessuraPneu = espessuraPneu;
	}

	public void exibirDados() {
		System.out.println("----------------");
		System.out.println("Marcha: " + this.getMarcha());
		System.out.println("Velocidade: " + this.getVelocidade());
		System.out.println("Espessura do Pneu: " + this.espessuraPneu);
        System.out.println("----------------");
	}
}
