public class Funcionario {
    private String nome;
    private double salario;
    
    double boni;
    double bonii;

    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

    public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

    public void calcularBonificacao(){ 
        boni = (getSalario()*0.10)+getSalario();
        bonii = getSalario()*0.10;
        System.out.println("O Sal�rio agora �: " + boni);
    }
    public void exibirDados() {
    	System.out.println("Nome: " + this.nome);
    	System.out.println("Sal�rio: " + this.salario);
    	System.out.println("Bonifica��o: " + bonii);
    }
}