import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cadastre um secretario...");
		Secretario secretario = new Secretario();
		System.out.print("Digite um nome: ");
		secretario.setNome(entrada.next());
		System.out.print("Digite um salário: ");
		secretario.setSalario(entrada.nextDouble());
		System.out.print("Informe um ramal: ");
		secretario.setRamal(entrada.nextInt());
		secretario.calcularBonificacao();
		secretario.exibirDados();
		System.out.println("--------------------");
		
		System.out.println("Cadastre um gerente...");
		Gerente gerente = new Gerente();
		System.out.print("Digite um nome: ");
		gerente.setNome(entrada.next());
		System.out.print("Digite um user: ");
		gerente.setNome_u(entrada.next());
		System.out.print("Digite um salário: ");
		gerente.setSalario(entrada.nextDouble());
		System.out.print("Digite uma senha: ");
		gerente.setSenha(entrada.nextInt());
		gerente.calcularBonificacao();
		gerente.exibirDados();
		System.out.println("--------------------");
	}

}
