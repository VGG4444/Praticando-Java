package Ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPessoa {
	Pessoa pessoa;
	static ArrayList<Pessoa> lista = new ArrayList<>();
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("Escolha:\n" + "1- Cadastrar\n" + "2- Imprimir");
			String escolha = entrada.next();
			switch (escolha) {
			case "1":
				System.out.println("1- Pessoa Física\n" + "2- Pessoa Jurídica");
				String escolha1 = entrada.next();
				switch (escolha1) {
				case "1":
					System.out.print("Nome: ");
					String nome1 = entrada.next();
					System.out.print("CPF: ");
					int cpf1 = entrada.nextInt();
					System.out.print("Data de Nascimento: ");
					String data1 = entrada.next();

					PessoaFisica pessoaFisica = new PessoaFisica(cpf1, data1, nome1);
					lista.add(pessoaFisica);
					break;
				case "2":
					System.out.print("Nome: ");
					String nome2 = entrada.next();
					System.out.print("CNPJ: ");
					int cnpj2 = entrada.nextInt();
					System.out.print("Inscrição Estadual: ");
					int insc2 = entrada.nextInt();
					System.out.print("Nome Fantasia: ");
					String nomeF2 = entrada.next();
					System.out.print("Razão Social: ");
					int raz2 = entrada.nextInt();

					PessoaJuridica pessoaJuridica = new PessoaJuridica(cnpj2, insc2, nomeF2, raz2, nome2);
					lista.add(pessoaJuridica);
					break;
				default:
					System.out.println("Número Inválido!");
				}
				break;
			case "2":
				if (lista.size() == 0) {
					System.out.println("Erro!");
				}
				for (Pessoa i : lista) {
					i.imprimir();
				}
			}
		}
	}

	public static void cadastrar() {
		System.out.println("1- Pessoa Física\n" + "2- Pessoa Jurídica");
		String escolha1 = entrada.next();
		switch (escolha1) {
		case "1":
			System.out.print("Nome: ");
			String nome1 = entrada.next();
			System.out.print("CPF: ");
			int cpf1 = entrada.nextInt();
			System.out.print("Data de Nascimento: ");
			String data1 = entrada.next();

			PessoaFisica pessoaFisica = new PessoaFisica(cpf1, data1, nome1);
			lista.add(pessoaFisica);
			break;
		case "2":
			System.out.print("Nome: ");
			String nome2 = entrada.next();
			System.out.print("CNPJ: ");
			int cnpj2 = entrada.nextInt();
			System.out.print("Inscrição Estadual: ");
			int insc2 = entrada.nextInt();
			System.out.print("Nome Fantasia: ");
			String nomeF2 = entrada.next();
			System.out.print("Razão Social: ");
			int raz2 = entrada.nextInt();

			PessoaJuridica pessoaJuridica = new PessoaJuridica(cnpj2, insc2, nomeF2, raz2, nome2);
			lista.add(pessoaJuridica);
			break;
		default:
			System.out.println("Número Inválido!");
		}
	}

	public static void imprimir() {
		System.out.println("1- Pessoa Física\n" + "2- Pessoa Jurídica");
		String escolhaI = entrada.next();
		switch (escolhaI) {
		case "1":
			try {
				for (Pessoa aux : lista) {
					aux.imprimir();
				}
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			}
			break;
		case "2":
			try {
				PessoaJuridica pessoaJuridica = new PessoaJuridica();
				pessoaJuridica.imprimir();
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			}
			break;
		}
	}
}
