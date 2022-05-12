package ex4.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class ex2main {
	public static void main(String [] args) {
	ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
	Scanner entrada = new Scanner(System.in);
	Empresa empresa = new Empresa();

	System.out.println("Informe o nome da empresa: ");
	empresa.setNome(entrada.next());
	System.out.println("Digite o CNPJ da empresa: ");
	empresa.setCnpj(entrada.nextInt());
	while (true) {
		Funcionario funcionario1 = new Funcionario();
		System.out.println("Digite o nome do funcionário: ");
		funcionario1.setNome(entrada.next());
		System.out.println("Digite o CPF do funcionário: ");
		funcionario1.setCpf(entrada.nextInt());
		System.out.println("Digite o salário: ");
		funcionario1.setSalario(entrada.nextInt());		
		funcionario.add(funcionario1);
		System.out.println("Digite 0 para parar.");
		int parar;
		parar = (entrada.nextInt());
	if (parar == 0) {
		for (Funcionario pessoa : funcionario) {
			pessoa.ImprimirDados();
		
		}
		break;
		}
		
	}
	
	}
	
	
	
}

