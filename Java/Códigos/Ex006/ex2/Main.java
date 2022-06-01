package br.com.unit.ex2;

public class Main {

	public static void main(String[] args) {
		MountainBike m1 = new MountainBike();
		
		m1.setSuspensao("Aro 26");
		m1.exibirDados();
		
		Ciclismo c1 = new Ciclismo();
		
		c1.setEspessuraPneu(20);
		c1.exibirDados();

	}

}
