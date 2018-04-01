

import java.util.Random;

public class RetiraCartaAleatorio implements  algoritmoDistribuido {

	@Override
	public void retiraCarta(Jogador jogador1, Jogador jogador2, Baralho baralho) {
		
		Carta carta1, carta2;		
		Random random = new Random();
		int limite;
		int posicao;
		
		limite = baralho.totaldeCartas(baralho) - 1;	
		posicao = random.nextInt(limite);
		carta1 = baralho.cartas.get(posicao); 
		jogador1.setCarta(carta1);
		baralho.cartas.remove(baralho.cartas.get(posicao));
		
		
		limite = baralho.totaldeCartas(baralho) - 1;	
		posicao = random.nextInt(limite);
		carta2 = baralho.cartas.get(posicao); 
		jogador2.setCarta(carta2);
		baralho.cartas.remove(baralho.cartas.get(posicao));
		
		if(carta1.getPeso() > carta2.getPeso()) {
			jogador1.setPontos(jogador1.getPontos() + 1);
		} else {
			jogador2.setPontos(jogador2.getPontos() + 1);
		}

		
	}

}
