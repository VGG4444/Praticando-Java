package br.com.unit.ex1;
import java.util.Scanner;

public class Documento {
	private String autor;
	private String dataDeCriacao;
	
	Scanner entrada = new Scanner(System.in);
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDataDeCriacao() {
		return dataDeCriacao;
	}
	public void setDataDeCriacao(String dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}
	
	
	public void Imprimir() {
        System.out.println("----------------");
		System.out.println(this.autor + " " + this.dataDeCriacao);
        System.out.println("----------------");
	}
	public void Editar() {
		System.out.print("Digite um novo autor: ");
		setAutor(entrada.next());
		System.out.print("Digite uma nova data de criação: ");
		setDataDeCriacao(entrada.next());
	}
	
	
}
