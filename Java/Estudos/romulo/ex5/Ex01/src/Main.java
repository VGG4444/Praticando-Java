import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	System.out.println("Escolha uma op��o");
	System.out.println("1. Pessoa F�sica");
	System.out.println("2. Pessoa Jur�dica");
	int opcao = entrada.nextInt();
	if(opcao == 1) {
		F�sica pessoa = new F�sica();
		System.out.println("Nome:");
		pessoa.setNome(entrada.next());
		System.out.println("Endere�o:");
		pessoa.setEndereco(entrada.next());
		System.out.println("Telefone:");
		pessoa.setTelefone(entrada.next());
		System.out.println("CPF:");
		pessoa.setCpf(entrada.next());
		System.out.println("RG");
		pessoa.setRg(entrada.next());
		System.out.println("Data Nascimento:");
		pessoa.setData(entrada.next());
	}
	if(opcao == 2) {
		Jur�dica pessoa = new Jur�dica();
		System.out.println("Nome:");
		pessoa.setNome(entrada.next());
		System.out.println("Endere�o:");
		pessoa.setEndereco(entrada.next());
		System.out.println("Telefone:");
		pessoa.setTelefone(entrada.next());
		System.out.println("CNPJ:");
		pessoa.setCnpj(entrada.next());
		System.out.println("Inscri��o Estadual:");
		pessoa.setInsEstadual(entrada.next());
		System.out.println("Inscri��o Municipal:");
		pessoa.setInsMunicipal(entrada.next());
	}

}}
