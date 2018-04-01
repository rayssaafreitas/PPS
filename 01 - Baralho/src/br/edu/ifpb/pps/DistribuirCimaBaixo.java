package br.edu.ifpb.pps;

import java.util.ArrayList;
import java.util.List;

public class DistribuirCimaBaixo implements AlgoritmoDistribuicao {
	
	public ArrayList<Carta> retirarCartas(Baralho b){
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		Carta carta;
	
		carta = b.getCarta(0);
		cartas.add(carta);
		carta = b.getCarta(51);
		cartas.add(carta);
		
		return cartas;	
	}
}
