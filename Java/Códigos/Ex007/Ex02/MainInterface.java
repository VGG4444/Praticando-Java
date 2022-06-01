package Ex02;

public class MainInterface {

	public static void main(String[] args) {
		Aviao aviao = new Aviao();
		aviao.ligarMotor();
		aviao.acelerar();
		aviao.buzinar();
		aviao.frear();
		System.out.println("----------------");
		Barco barco = new Barco();
		barco.ligarMotor();
		barco.acelerar();
		barco.buzinar();
		barco.frear();
		System.out.println("----------------");
		Carro carro = new Carro();
		carro.ligarMotor();
		carro.acelerar();
		carro.buzinar();
		carro.frear();
		System.out.println("----------------");

	}

}
