package br.com.unit.ex4;
import java.util.Scanner;

public class Personagem {
	private String nome;
	private int forca;
	private int vida;
	private int magia;
	private int velocidade;
	private int defesa;
	private int nivel;
	
	Scanner entrada = new Scanner(System.in);
	
	public Personagem() {
		this.nome = "Nesvyn";
		this.forca = -1;
		this.magia = 3;
		this.vida = 150;
		this.velocidade = 30;
		this.defesa = 19;
		this.nivel = 13;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMagia() {
		return magia;
	}
	public void setMagia(int magia) {
		this.magia = magia;
	}

	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public void atacar() {
		System.out.println("Rolagem de Ataque: 1d20 + " + forca);
	}
	public void defender() {
		System.out.println("HP: " + vida + "\nCA: " + defesa);
	}
	public void usarMagia() {
		System.out.println("Rolagem de Feitiço: 1d20 + " + magia);
	}
	public void usarItem() {
		System.out.println("Usando item...");
	}
	
}
