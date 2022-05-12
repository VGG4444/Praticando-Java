import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Assistente> listaAssistentes = new ArrayList<>();
		ArrayList<Supervisor> listaSupervisores = new ArrayList<>();
		ArrayList<Comissionado> listaComissionados = new ArrayList<>();
		ArrayList<Horista> listaHoristas = new ArrayList<>();

		System.out.println("Total de vendas de roupa:");
		double totalRoupas = (entrada.nextDouble());
		System.out.println("Total de vendas de calçados:");
		double totalCalcados = (entrada.nextDouble());
		double comissaoRoupas = totalRoupas * 5 / 100;
		double comissaoCalcados = totalCalcados * 7 / 100;
		double salarioComissionados = comissaoCalcados + comissaoRoupas;
		while (true) {
			System.out.println("Escolha uma opção");
			System.out.println("1.Cadastro de funcionários \n2.Consultar salário \n0.Parar programa");

			int menu = entrada.nextInt();
			if (menu == 0) {
				break;
			}
			if (menu == 1) {

				while (true) {
					System.out.println("Cargo do funcionário:");
					System.out.println(
							"1.Assitente \n2.Supervisor \n3.Comissionado \n4.Horista \n5.Voltar ao menu anterior");
					int opcao = entrada.nextInt();
					if (opcao == 1) {
						Assistente assistente = new Assistente();
						System.out.println("Nome:");
						assistente.setNome(entrada.next());
						System.out.println("CPF:");
						assistente.setCpf(entrada.next());
						System.out.println("Matrícula:");
						assistente.setMatricula(entrada.next());
						System.out.println("Data de nascimento:");
						assistente.setMatricula(entrada.next());
						listaAssistentes.add(assistente);

					}
					if (opcao == 2) {
						Supervisor supervisor = new Supervisor();
						System.out.println("Nome:");
						supervisor.setNome(entrada.next());
						System.out.println("CPF:");
						supervisor.setCpf(entrada.next());
						System.out.println("Matrícula:");
						supervisor.setMatricula(entrada.next());
						System.out.println("Data de nascimento:");
						supervisor.setMatricula(entrada.next());
						listaSupervisores.add(supervisor);

					}

					if (opcao == 3) {
						Comissionado comissionado = new Comissionado();
						System.out.println("Nome:");
						comissionado.setNome(entrada.next());
						System.out.println("CPF:");
						comissionado.setCpf(entrada.next());
						System.out.println("Matrícula:");
						comissionado.setMatricula(entrada.next());
						System.out.println("Data de nascimento:");
						comissionado.setMatricula(entrada.next());
						listaComissionados.add(comissionado);

					}
					if (opcao == 4) {
						Horista horista = new Horista();
						System.out.println("Nome:");
						horista.setNome(entrada.next());
						System.out.println("CPF:");
						horista.setCpf(entrada.next());
						System.out.println("Matrícula:");
						horista.setMatricula(entrada.next());
						System.out.println("Data de nascimento:");
						horista.setMatricula(entrada.next());
						System.out.println("Horas trabalhadas:");
						horista.setHorasTrabalhadas(entrada.nextDouble());
						listaHoristas.add(horista);

					}
					if (opcao == 5) {
						break;

					}
				}
			}
			if (menu == 2) {
				while (true) {
					System.out.println("Cargo do funcionário:");
					System.out.println(
							"1.Assitente \n2.Supervisor \n3.Comissionado \n4.Horista \n5.Voltar ao menu anterior");
					int cargo = entrada.nextInt();
					if (cargo == 1) {

						System.out.println("Nome do assistente:");
						String auxiliar = entrada.next();
						for (Assistente teste : listaAssistentes) {
							if (teste.getNome().equals(auxiliar)) {
								System.out.println("Nome: " + teste.getNome() + "\nSalário:" + teste.salario);
								break;
							}

							else {
								System.out.println("Funcionário não cadastrado");
								break;
							}

						}
					}

					if (cargo == 2) {

						System.out.println("Nome do supervisor:");
						String auxiliar = entrada.next();
						for (Supervisor teste : listaSupervisores) {
							if (teste.getNome().equals(auxiliar)) {
								System.out.println("Nome: " + teste.getNome() + "\nSalário:" + teste.salario);
								break;
							}

							else {
								System.out.println("Funcionário não cadastrado");
								break;

							}

						}

					}
					if (cargo == 3) {

						System.out.println("Nome do comissionado:");
						String auxiliar = entrada.next();
						for (Comissionado teste : listaComissionados) {
							if (teste.getNome().equals(auxiliar)) {
								System.out.println("Nome: " + teste.getNome() + "\nSalário:" + salarioComissionados);
								break;
							}

							else {
								System.out.println("Funcionário não cadastrado");
								break;

							}
						}
					}
					if (cargo == 4) {

						System.out.println("Nome do horista:");
						String auxiliar = entrada.next();
						for (Horista teste : listaHoristas) {
							if (teste.getNome().equals(auxiliar)) {
								System.out.println(
										"Nome: " + teste.getNome() + "\nSalário:" + teste.getHorasTrabalhadas() * 50);
								break;
							}

							else {
								System.out.println("Funcionário não cadastrado");
								break;

							}
						}

					}
					if (cargo == 5) {
						break;
					}

				}
			}
		}
	}
}
