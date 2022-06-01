public class Gerente extends Funcionario {
    private String nome_u;
    private int senha;

    public String getNome_u() {
		return nome_u;
	}
	public void setNome_u(String nome_u) {
		this.nome_u = nome_u;
	}

    public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public void calcularBonificacao(){ 
        boni = (getSalario()*0.60)+getSalario();
        bonii = getSalario()*0.60;
        System.out.println("O Salário agora é: " + boni);
    }
}