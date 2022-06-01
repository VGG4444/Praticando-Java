package br.com.unit.ex1;

public class Carta extends Documento {
	private String Endereco;
	private String FormaEnvio;
	
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getFormaEnvio() {
		return FormaEnvio;
	}
	public void setFormaEnvio(String formaEnvio) {
		FormaEnvio = formaEnvio;
	}

	public void Imprimir() {
        System.out.println("----------------");
		System.out.println("Endereço: " + this.Endereco + "\n" + "Forma de Envio: " + this.FormaEnvio);
		System.out.println("Autor: " + this.getAutor() + "\n" + "Data: " + this.getDataDeCriacao());
        System.out.println("----------------");
	}
	public void Anexar() {
		System.out.println("Anexando documento...");
	}
}
