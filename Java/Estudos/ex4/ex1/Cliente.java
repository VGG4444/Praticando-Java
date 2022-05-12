package ex4.ex1;

public class Cliente {
	private int id;
	private String nome;
	private int idade;
	private int telefone;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void imprimirDados() {
		System.out.println(this.id);
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.telefone);
	}

}
