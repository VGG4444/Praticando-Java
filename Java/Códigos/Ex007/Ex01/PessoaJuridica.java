package Ex01;

public class PessoaJuridica extends Pessoa {
	private int cnpj;
	private int inscricaoEst;
	private String nomeFant;
	private int razaoSoc;
	
	PessoaJuridica(){
	}
	
	PessoaJuridica(int cnpj, int inscricaoEst, String nomeFant, int razaoSoc, String nome){
		super(nome);
		this.cnpj = cnpj;
		this.inscricaoEst = inscricaoEst;
		this.nomeFant = nomeFant;
		this.razaoSoc = razaoSoc;
	}
	
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}


	public int getInscricaoEst() {
		return inscricaoEst;
	}
	public void setInscricaoEst(int inscricaoEst) {
		this.inscricaoEst = inscricaoEst;
	}


	public String getNomeFant() {
		return nomeFant;
	}
	public void setNomeFant(String nomeFant) {
		this.nomeFant = nomeFant;
	}


	public int getRazaoSoc() {
		return razaoSoc;
	}
	public void setRazaoSoc(int razaoSoc) {
		this.razaoSoc = razaoSoc;
	}


	@Override
	public void imprimir() {
		System.out.println("--------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Inscrição Estadual: " + this.inscricaoEst);
		System.out.println("Nome Fantasia: " + this.nomeFant);
		System.out.println("Razão Social: " + this.razaoSoc);
		System.out.println("--------");
	}
	
}
