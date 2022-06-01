package Ex02;

public class Barco implements Veiculo {

	@Override
	public void ligarMotor() {
		// TODO Auto-generated method stub
		System.out.println("Ligando o motor do Barco");
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Acelerando o Barco");
	}

	@Override
	public void frear() {
		// TODO Auto-generated method stub
		System.out.println("Freando o Barco");
	}

	@Override
	public void buzinar() {
		// TODO Auto-generated method stub
		System.out.println("Buzinando o Barco");
	}

}
