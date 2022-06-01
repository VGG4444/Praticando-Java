package br.com.unit.ex4;

public class Jogador extends Personagem {
	private int pontosMagia;
	private int experienciaAtual;
	private int experienciaProximoNivel;
	
	public Jogador() {
		this.pontosMagia = 14;
		this.experienciaAtual = 1000;
		this.experienciaProximoNivel = 1500;
	}
	
	public int getPontosMagia() {
		return pontosMagia;
	}
	public void setPontosMagia(int pontosMagia) {
		this.pontosMagia = pontosMagia;
	}
	
	public int getExperienciaAtual() {
		return experienciaAtual;
	}
	public void setExperienciaAtual(int experienciaAtual) {
		this.experienciaAtual = experienciaAtual;
	}
	
	public int getExperienciaProximoNivel() {
		return experienciaProximoNivel;
	}
	public void setExperienciaProximoNivel(int experienciaProximoNivel) {
		this.experienciaProximoNivel = experienciaProximoNivel;
	}
	
	public void exibirNome() {
		System.out.println("Nome: " + this.getNome());
	}
}
