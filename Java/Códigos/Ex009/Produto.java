package br.com.unit.MEU2;

public class Produto implements Item {
	private String nome;
    private int id;
    private double preco;
    private String categoria;

    @Override
    public void displayItem() {
        System.out.println("Nome: " + this.nome);
        System.out.println("ID: " + this.id);
        System.out.println("Preço: " + this.preco);
        System.out.println("Categoria: " + this.categoria);
        
    }
    
    public Produto(String nome, int id, double preco, String categoria){
    
}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
