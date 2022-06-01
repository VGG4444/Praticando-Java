package br.com.unit.MEU2;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public Pessoa(String nome, int idade, String sexo){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }
    
}
