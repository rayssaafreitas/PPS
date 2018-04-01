package br.edu.ifpb.pps;

import java.util.ArrayList;
import java.util.List;

public interface AlgoritmoDistribuicao {
	public default ArrayList<Carta> retirarCartas(Baralho b){
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		return cartas;	
	}
}
