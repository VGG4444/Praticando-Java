package br.com.unit.ex3;

public class Carro extends Veiculo {
	private int marcha;
	
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	
	public void exibirDados() {
		System.out.println("----------------");
		System.out.println("Marcha: " + this.marcha);
		System.out.println("Velocidade: " + this.getVelocidade());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Passageiros: " + this.getPassageiros());
		System.out.println("Combustível: " + this.getCombustivel());
        System.out.println("----------------");
	}
}
