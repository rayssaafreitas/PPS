

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baralho baralho = new Baralho();


		
		Jogador jogador1 = new Jogador("Benjamin", 0);		
		Jogador jogador2 = new Jogador("Lolita", 0);
				


		algoritmoDistribuido alg = new RetiraCartaAleatorio();
				
		for(int i = 0; i < 10; i++) {
			alg.retiraCarta(jogador1, jogador2, baralho);
			baralho.embaralhar(baralho);			
		}
		
		if (jogador1.getCarta().getValor().equals(  jogador2.getCarta().getPeso())) {
			alg.retiraCarta(jogador1, jogador2, baralho);
			System.out.println("empate");
			baralho.embaralhar(baralho);
		}
		if (jogador1.getCarta().getPeso() > jogador2.getCarta().getPeso()) {
			alg.retiraCarta(jogador1, jogador1, baralho);
			System.out.println("jogador"+ jogador1.getNome());
			baralho.embaralhar(baralho);
		}					
		System.out.println(jogador1.toString());
		System.out.println(jogador2.toString());		
		
	}
	}
			 

