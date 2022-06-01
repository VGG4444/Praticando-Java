package br.com.unit.MEU2;

public class Proprietario extends Pessoa {
    private double valorInvestimento;
    
    
    public Proprietario(double valorInvestimento, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.valorInvestimento = valorInvestimento;
    }
    
    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }
    
    public void displayProprietario(){
        System.out.println("DADOS PROPRIETÃ�RIO");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Valor de investimento: " + this.getValorInvestimento());
    }
    
    
}
