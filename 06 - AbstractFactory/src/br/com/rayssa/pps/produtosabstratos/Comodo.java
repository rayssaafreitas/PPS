package br.com.rayssa.pps.produtosabstratos;

import java.util.ArrayList;
import java.util.List;

public class Comodo {
	private String nome;
	private Piso piso;
	private List<Parede> paredes = new ArrayList<Parede>();
	private List<Porta> portas = new ArrayList<Porta>();
	private Tinta tinta;
	private List<Metal> metais = new ArrayList<Metal>();
	private List<Louca> loucas = new ArrayList<Louca>();
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setPiso(Piso piso){
		this.piso = piso;
	}
	
	public void setTinta(Tinta tinta){
		this.tinta = tinta;
	}
	
	public void addParede(Parede p){
		paredes.add(p);
	}
	
	public void addPorta(Porta p){
		portas.add(p);
	}
	
	public void addMetal(Metal m){
		metais.add(m);
	}
	
	public void addLouca(Louca l){
		loucas.add(l);
	}

	@Override
	public String toString() {
		String texto = "Comodo: nome= " + nome;
		texto += "\npiso= " + piso.toString();
		texto += "\nparede(s)= " + paredes.size() + " parede(s) do tipo " + paredes.toString();
		texto += "\nporta(s)= " + portas.size() + " porta(s) do tipo " + portas.toString();
		texto += "\ntinta= " + tinta.toString();
		texto += "\nmetal(is)= " + metais.size() + " metal(is) do tipo " + metais.toString();
		texto += "\nlouças(s)= " + loucas.size() + " louça(s) do tipo " + loucas.toString();
		return texto;
	}
}
