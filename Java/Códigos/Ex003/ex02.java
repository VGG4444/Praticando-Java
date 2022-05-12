import java.util.ArrayList;
import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<String>();
		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner entrada = new Scanner(System.in);

		while (true) {
			System.out.println("Escolha uma opção: \n" + "1	Cadastrar Aluno\n" + "2	Cadastrar Notas");
			int escolha = (entrada.nextInt());
			if (escolha == 1) {
				System.out.println("Informe o aluno: ");
				String aluno = (entrada.next());
				alunos.add(aluno);
			}
			if (escolha == 2) {
				System.out.println("Digite a primeira nota: ");
				double n1 = (entrada.nextDouble());
				System.out.println("Digite a segunda nota: ");
				double n2 = (entrada.nextDouble());
				System.out.println("Digite a terceira nota: ");
				double n3 = (entrada.nextDouble());

				double media = (n1 + n2 + n3) / 3;
				notas.add(media);

			}

			System.out.println("Deseja parar?(0) ");
			int parada = (entrada.nextInt());

			if (parada == 0) {

				for (int i = 0; i < alunos.size(); i++) {
					System.out.println(i + 1 + " Aluno: " + alunos.get(i) + " com média " + notas.get(i));
				}
				break;
			}
		}
	}
}