package Ex02;

public class Carro implements Veiculo {

	@Override
	public void ligarMotor() {
		// TODO Auto-generated method stub
		System.out.println("Ligando o motor do Carro");
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Acelerando o Carro");
	}

	@Override
	public void frear() {
		// TODO Auto-generated method stub
		System.out.println("Freando o Carro");
	}

	@Override
	public void buzinar() {
		// TODO Auto-generated method stub
		System.out.println("Buzinando o Carro");
	}

}
