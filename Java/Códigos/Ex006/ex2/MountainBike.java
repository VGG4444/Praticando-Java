package br.com.unit.ex2;

public class MountainBike extends Bicicleta {
	private String suspensao;

	public String getSuspensao() {
		return suspensao;
	}
	public void setSuspensao(String suspensao) {
		this.suspensao = suspensao;
	}
	
	public void exibirDados() {
		System.out.println("----------------");
		System.out.println("Marcha: " + this.getMarcha());
		System.out.println("Velocidade: " + this.getVelocidade());
		System.out.println("Suspensão: " + this.suspensao);
        System.out.println("----------------");
	}

}
