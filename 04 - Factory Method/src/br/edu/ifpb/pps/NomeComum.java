package br.edu.ifpb.pps;

public class NomeComum implements Nome{
	private String nome;
	
	public NomeComum(String nome){
		this.nome = nome;
	}
	
	public String organizaNome(){
		String[] aux;
		String nome, sobrenome;
		
		aux = this.nome.split(" ");
		nome = aux[0];
		sobrenome = aux[1];
		
		return nome + " " + sobrenome;
	}
}
