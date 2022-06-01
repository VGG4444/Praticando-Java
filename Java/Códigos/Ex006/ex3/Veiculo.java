package br.com.unit.ex3;

public class Veiculo {
	private String modelo;
	private double velocidade;
	private int passageiros;
	private double combustivel;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public double getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

	public Veiculo() {
		this.modelo = "Corolla";
		this.velocidade = 0.0;
		this.passageiros = 5;
		this.combustivel = 444.4;
	}
	
	public void acelera() {
		this.velocidade = velocidade + 5;
	}
	public void freia() {
		this.velocidade = velocidade - 1;
	}

}
