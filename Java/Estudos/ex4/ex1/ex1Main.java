

import java.util.Scanner;
import java.util.ArrayList;

public class ex1Main {
	public static void main(String[] args) {
		ArrayList<ex1> lista = new ArrayList<ex1>();
		
		while (true) {
			Scanner entrada = new Scanner(System.in);
			ex1 ex1 = new ex1();
			System.out.print("Informe o ID: ");
			ex1.setId(entrada.nextInt());
			if (ex1.getId() == 0) {
				for (ex1 clientes : lista) {
					clientes.imprimirDados();
				}
				break;
				
			}
			System.out.print("Informe o nome: ");
			ex1.setNome(entrada.next());
			System.out.print("Informe o idade: ");
			ex1.setIdade(entrada.nextInt());
			System.out.print("Informe o telefone: ");
			ex1.setTelefone(entrada.nextInt());
			
			lista.add(ex1);
		
		}
	}
}