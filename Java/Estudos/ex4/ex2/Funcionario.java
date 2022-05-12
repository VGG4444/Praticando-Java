package ex4.ex2;

public class Funcionario extends Empresa {
	private int cpf;
	private String nome;
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void ImprimirDados() {
		System.out.println(getNome() + " " + getSalario());
	}
}
