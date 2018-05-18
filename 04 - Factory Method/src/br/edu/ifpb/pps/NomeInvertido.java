package br.edu.ifpb.pps;

public class NomeInvertido implements Nome{
	private String nome;
	
	public NomeInvertido(String nome){
		this.nome = nome;
	}
	
	public String organizaNome(){
		String[] aux;
		String nome, sobrenome;
		
		aux = this.nome.split(", ");
		nome = aux[1];
		sobrenome = aux[0];
		
		return nome + " " + sobrenome;
	}
	
}
