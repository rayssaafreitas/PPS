package br.edu.ifpb.pps;

public class Jogador {
	private String nome;
	private int pontos = 0;
	
	public Jogador(String nome){
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getPontos(){
		return pontos;
	}
	
	public void adicionarPonto(){
		this.pontos++;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + "]";
	}
}
