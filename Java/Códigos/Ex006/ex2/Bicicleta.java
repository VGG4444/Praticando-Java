package br.com.unit.ex2;

public class Bicicleta {
	private int marcha;
	private double velocidade;
	
	public Bicicleta() {
		this.marcha = 1;
		this.velocidade = 20.5;
	}
	
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void exibirDados() {
		System.out.println("----------------");
		System.out.println("Marcha: " + this.marcha);
		System.out.println("Velocidade: " + this.velocidade);
        System.out.println("----------------");
	}

}
