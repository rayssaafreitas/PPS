import java.util.ArrayList;
import java.util.Random;



public class Jogo implements algoritmoDistribuido		{
private Jogo j;
private	Baralho b1;
	public Jogo(Jogo j, Baralho b1) {
		super();
		this.j = j;
		this.b1 = b1;
		b1.embaralha();
	}
	@Override
	public void retiraCarta(Jogador jogador1, Jogador jogador2, Baralho baralho) {
		// TODO Auto-generated method stub
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
			System.out.println("jogador 1 ganhou");
		} else {
			jogador2.setPontos(jogador2.getPontos() + 1);
			
		}	
		
	}
	} 

