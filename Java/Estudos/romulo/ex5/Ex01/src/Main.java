import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	System.out.println("Escolha uma opção");
	System.out.println("1. Pessoa Física");
	System.out.println("2. Pessoa Jurídica");
	int opcao = entrada.nextInt();
	if(opcao == 1) {
		Física pessoa = new Física();
		System.out.println("Nome:");
		pessoa.setNome(entrada.next());
		System.out.println("Endereço:");
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
		Jurídica pessoa = new Jurídica();
		System.out.println("Nome:");
		pessoa.setNome(entrada.next());
		System.out.println("Endereço:");
		pessoa.setEndereco(entrada.next());
		System.out.println("Telefone:");
		pessoa.setTelefone(entrada.next());
		System.out.println("CNPJ:");
		pessoa.setCnpj(entrada.next());
		System.out.println("Inscrição Estadual:");
		pessoa.setInsEstadual(entrada.next());
		System.out.println("Inscrição Municipal:");
		pessoa.setInsMunicipal(entrada.next());
	}

}}
