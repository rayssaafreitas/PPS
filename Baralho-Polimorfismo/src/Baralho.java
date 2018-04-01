

import java.util.ArrayList;
import java.util.Collections;

public class Baralho {
	
	ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	public Baralho() {
				
		String nipe;
		String valor;		
		int peso = 52;
		
		for (int i = 0; i < Carta.Nipes.length; i++) {		
			for (int j = 0; j < Carta.Valor.length; j++) {
				
				nipe = Carta.Nipes[i];
				valor = Carta.Valor[j];
				
				cartas.add(new Carta(nipe, valor, peso));
				peso--;
				
			}	
						
		}
	}
	
	public void embaralhar(Baralho baralho) {			
		Collections.shuffle(baralho.cartas);
	}
	
	public void mostrarBaralho(Baralho baralho) {
				
		for (Carta c : baralho.cartas) {
			System.out.println(c.toString());
		}		
		
	}
	
	public int totaldeCartas(Baralho baralho) {
		int quantidade = 0;
		
		for (Carta c : baralho.cartas) {
			quantidade++;
		}
		
		return quantidade;
	}

	public void embaralha() {
		// TODO Auto-generated method stub
		
	}
	
}
