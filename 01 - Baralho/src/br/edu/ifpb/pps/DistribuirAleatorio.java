package br.edu.ifpb.pps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DistribuirAleatorio implements AlgoritmoDistribuicao {
	
	public ArrayList<Carta> retirarCartas(Baralho b){
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		Carta carta;
		int numero;
		
		Random gerador = new Random();
		
		for(int i = 1; i <= 2; i++){
			numero = gerador.nextInt(51);
			carta = b.getCarta(numero);
			cartas.add(carta);
		}
		
		return cartas;	
	}
}
