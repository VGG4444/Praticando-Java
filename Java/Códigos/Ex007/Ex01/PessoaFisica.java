package Ex01;

public class PessoaFisica extends Pessoa {
	private int cpf;
	private String dataNasc;

	public PessoaFisica() {
		
	}
	
	public PessoaFisica(int cpf, String dataNasc, String nome) {
		super(nome);
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}


	@Override
	public void imprimir() {
		System.out.println("--------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.cpf);
		System.out.println("Data de Nascimento: " + this.dataNasc);
		System.out.println("--------");
		
	}

}
