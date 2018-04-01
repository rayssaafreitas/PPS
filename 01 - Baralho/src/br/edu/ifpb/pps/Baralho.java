package br.edu.ifpb.pps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	public Baralho(){
		super();
		this.addCartasCopas();
		this.addCartasEspada();
		this.addCartasOuro();
		this.addCartasPaus();
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	public void addCartasCopas(){
		Carta carta = new Carta("A", "Copas");
		cartas.add(carta);
		carta = new Carta("2", "Copas");
		cartas.add(carta);
		carta = new Carta("3", "Copas");
		cartas.add(carta);
		carta = new Carta("4", "Copas");
		cartas.add(carta);
		carta = new Carta("5", "Copas");
		cartas.add(carta);
		carta = new Carta("6", "Copas");
		cartas.add(carta);
		carta = new Carta("7", "Copas");
		cartas.add(carta);
		carta = new Carta("8", "Copas");
		cartas.add(carta);
		carta = new Carta("9", "Copas");
		cartas.add(carta);
		carta = new Carta("10", "Copas");
		cartas.add(carta);
		carta = new Carta("J", "Copas");
		cartas.add(carta);
		carta = new Carta("Q", "Copas");
		cartas.add(carta);
		carta = new Carta("K", "Copas");
		cartas.add(carta);
	}
	
	public void addCartasEspada(){
		Carta carta = new Carta("A", "Espada");
		cartas.add(carta);
		carta = new Carta("2", "Espada");
		cartas.add(carta);
		carta = new Carta("3", "Espada");
		cartas.add(carta);
		carta = new Carta("4", "Espada");
		cartas.add(carta);
		carta = new Carta("5", "Espada");
		cartas.add(carta);
		carta = new Carta("6", "Espada");
		cartas.add(carta);
		carta = new Carta("7", "Espada");
		cartas.add(carta);
		carta = new Carta("8", "Espada");
		cartas.add(carta);
		carta = new Carta("9", "Espada");
		cartas.add(carta);
		carta = new Carta("10", "Espada");
		cartas.add(carta);
		carta = new Carta("J", "Espada");
		cartas.add(carta);
		carta = new Carta("Q", "Espada");
		cartas.add(carta);
		carta = new Carta("K", "Espada");
		cartas.add(carta);
	}
	
	public void addCartasOuro(){
		Carta carta = new Carta("A", "Ouro");
		cartas.add(carta);
		carta = new Carta("2", "Ouro");
		cartas.add(carta);
		carta = new Carta("3", "Ouro");
		cartas.add(carta);
		carta = new Carta("4", "Ouro");
		cartas.add(carta);
		carta = new Carta("5", "Ouro");
		cartas.add(carta);
		carta = new Carta("6", "Ouro");
		cartas.add(carta);
		carta = new Carta("7", "Ouro");
		cartas.add(carta);
		carta = new Carta("8", "Ouro");
		cartas.add(carta);
		carta = new Carta("9", "Ouro");
		cartas.add(carta);
		carta = new Carta("10", "Ouro");
		cartas.add(carta);
		carta = new Carta("J", "Ouro");
		cartas.add(carta);
		carta = new Carta("Q", "Ouro");
		cartas.add(carta);
		carta = new Carta("K", "Ouro");
		cartas.add(carta);
	}
	
	public void addCartasPaus(){
		Carta carta = new Carta("A", "Paus");
		cartas.add(carta);
		carta = new Carta("2", "Paus");
		cartas.add(carta);
		carta = new Carta("3", "Paus");
		cartas.add(carta);
		carta = new Carta("4", "Paus");
		cartas.add(carta);
		carta = new Carta("5", "Paus");
		cartas.add(carta);
		carta = new Carta("6", "Paus");
		cartas.add(carta);
		carta = new Carta("7", "Paus");
		cartas.add(carta);
		carta = new Carta("8", "Paus");
		cartas.add(carta);
		carta = new Carta("9", "Paus");
		cartas.add(carta);
		carta = new Carta("10", "Paus");
		cartas.add(carta);
		carta = new Carta("J", "Paus");
		cartas.add(carta);
		carta = new Carta("Q", "Paus");
		cartas.add(carta);
		carta = new Carta("K", "Paus");
		cartas.add(carta);
	}

	public void embaralhar(){
		Collections.shuffle(this.cartas);
	}
	
	public String toString(){
		String texto = "Cartas: ";
		for(Carta c : cartas){
			texto += "\n" + c.toString();
		}
		return texto;
	}
	
	public Carta getCarta(int pos){
		return cartas.get(pos);
	}
}
