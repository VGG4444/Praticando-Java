package br.com.unit.MEU2;

import java.util.Scanner;

public class Main {
	private static final String comercio = "";
	private static final String formal = "";
	private static final String FC = "";

	public static void main(String[] args) {
		Loja loja = new Loja("Nome Loja", "Ali", "123");
		Scanner entrada = new Scanner(System.in);

		Proprietario p1 = new Proprietario(100, "1", 20, "M");
		loja.adicionarProprietario(p1);
		Proprietario p2 = new Proprietario(100, "2", 20, "F");
		loja.adicionarProprietario(p2);
		Proprietario p3 = new Proprietario(100, "3", 20, "M");
		loja.adicionarProprietario(p3);

		Funcionario f1 = new Funcionario(1, "Manhã", 8, 123, "321", "4002", "1", 12, "NB");
		loja.adicionarFuncionario(f1);
		Funcionario f2 = new Funcionario(1, "Manhã", 8, 123, "321", "4002", "2", 12, "NB");
		loja.adicionarFuncionario(f2);
		Funcionario f3 = new Funcionario(1, "Manhã", 8, 123, "321", "4002", "3", 12, "NB");
		loja.adicionarFuncionario(f3);
		Funcionario f4 = new Funcionario(1, "Manhã", 8, 123, "321", "4002", "4", 12, "NB");
		loja.adicionarFuncionario(f4);
		Funcionario f5 = new Funcionario(1, "Manhã", 8, 123, "321", "4002", "5", 12, "NB");
		loja.adicionarFuncionario(f5);
		Funcionario f6 = new Funcionario(1, "Manhã", 8, 123, "321", "4002", "6", 12, "NB");
		loja.adicionarFuncionario(f6);

		Contador c1 = new Contador(600, "Noite", 8, "Um", "Superior", 123, "Preto", "8922", "1", 21, "F");
		loja.adicionarContador(c1);

		Diretor d1 = new Diretor(1200, "Tarde", 6, "Dois", "Técnico", 000, "Branco", "0800", "1", 53, "I");
		loja.adicionarDiretor(d1);
		Diretor d2 = new Diretor(1200, "Tarde", 6, "Dois", "Técnico", 000, "Branco", "0800", "2", 53, "I");
		loja.adicionarDiretor(d2);

		Produto pb1 = new Produto("Ricardo Eletro", 1, 0.0, "Bebida");
		loja.adicionarProduto(pb1);
		Produto pb2 = new Produto("Ricardo Eletro", 2, 0.0, "Bebida");
		loja.adicionarProduto(pb2);
		Produto pb3 = new Produto("Ricardo Eletro", 3, 0.0, "Bebida");
		loja.adicionarProduto(pb3);

		Produto pc1 = new Produto("Ricardo Eletro", 1, 0.0, "Café");
		loja.adicionarProduto(pc1);
		Produto pc2 = new Produto("Ricardo Eletro", 2, 0.0, "Café");
		loja.adicionarProduto(pc2);
		Produto pc3 = new Produto("Ricardo Eletro", 3, 0.0, "Café");
		loja.adicionarProduto(pc3);
		Produto pc4 = new Produto("Ricardo Eletro", 4, 0.0, "Café");
		loja.adicionarProduto(pc4);
		Produto pc5 = new Produto("Ricardo Eletro", 5, 0.0, "Café");
		loja.adicionarProduto(pc5);

		Produto pco1 = new Produto("Cimento", 1, 0.1, "Condimentos");
		loja.adicionarProduto(pco1);
		Produto pco2 = new Produto("Cimento", 2, 0.1, "Condimentos");
		loja.adicionarProduto(pco2);
		Produto pco3 = new Produto("Cimento", 3, 0.1, "Condimentos");
		loja.adicionarProduto(pco3);
		Produto pco4 = new Produto("Cimento", 4, 0.1, "Condimentos");
		loja.adicionarProduto(pco4);
		Produto pco5 = new Produto("Cimento", 5, 0.1, "Condimentos");
		loja.adicionarProduto(pco5);

		Produto pl1 = new Produto("Sorvete", 1, 0.4, "Laticínio");
		loja.adicionarProduto(pl1);
		Produto pl2 = new Produto("Sorvete", 2, 0.4, "Laticínio");
		loja.adicionarProduto(pl2);
		Produto pl3 = new Produto("Sorvete", 3, 0.4, "Laticínio");
		loja.adicionarProduto(pl3);
		Produto pl4 = new Produto("Sorvete", 4, 0.4, "Laticínio");
		loja.adicionarProduto(pl4);

		Produto pj1 = new Produto("Pizza", 1, 444.4, "Jantar");
		loja.adicionarProduto(pj1);
		Produto pj2 = new Produto("Pizza", 2, 444.4, "Jantar");
		loja.adicionarProduto(pj2);
		Produto pj3 = new Produto("Pizza", 2, 444.4, "Jantar");
		loja.adicionarProduto(pj3);

		while (true) {
			System.out.println("Escolha uma opção: \n" + "1- Adicionar\n" + "2- Imprimir\n" + "3- Buscar\n"
					+ "4- Deletar\n" + "5- Gerenciar Produtos\n" + "6- Sair");
			String escolha = entrada.next();
			switch (escolha) {
			case "1":
				System.out.println("Escolha uma opção: \n" + "1- Adicionar Contador\n" + "2- Adicionar Diretor\n"
						+ "3- Adicionar Funcionario\n" + "4- Voltar");
				String escolha1 = entrada.next();
				switch (escolha1) {
				case "1":
					Contador adc = new Contador(600, "Noite", 8, "Um", "Superior", 123, "Preto", "8922", "1", 21, "F");
					loja.adicionarContador(adc);
					break;
				case "2":
					Diretor add = new Diretor(1200, "Tarde", 6, "Dois", "Técnico", 000, "Branco", "0800", "1", 53, "I");
					loja.adicionarDiretor(add);
					break;
				case "3":
					Funcionario adf = new Funcionario(1, "Manhã", 8, 123, "321", "4002", "1", 12, "NB");
					loja.adicionarFuncionario(adf);
					break;
				case "4":
					break;
				}
				break;
			case "2":
				System.out.println("Escolha uma opção: \n" + "1- Imprimir Proprietario\n" + "2- Imprimir Contador\n"
						+ "3- Imprimir Diretor\n" + "4- Imprimir Funcionario\n" + "5- Voltar");
				String escolha2 = entrada.next();
				switch (escolha2) {
				case "1":
					loja.imprimirProprietarios();
					break;
				case "2":
					loja.imprimirContador();
					break;
				case "3":
					loja.imprimirDiretores();
					break;
				case "4":
					loja.imprimirFuncionarios();
					break;
				case "5":
					break;
				}
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				break;
			}
		}

	}

}
