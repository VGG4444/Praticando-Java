package ex4.ex1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		
		while (true) {
			Scanner entrada = new Scanner(System.in);
			Cliente cliente = new Cliente();
			System.out.println("Digite o id: ");
			cliente.setId(entrada.nextInt());
			if (cliente.getId() == 0) {
				for (Cliente clientes : lista) {
					clientes.imprimirDados();
				}
				break;
				
			}
			System.out.println("Digite o nome: ");
			cliente.setNome(entrada.next());
			System.out.println("Digite o idade: ");
			cliente.setIdade(entrada.nextInt());
			System.out.println("Digite o telefone: ");
			cliente.setTelefone(entrada.nextInt());
			
			lista.add(cliente);
		
		}
	}
}