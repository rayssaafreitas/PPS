package br.edu.ifpb.pps;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
	private AlgoritmoDistribuicao x;
	private Jogador jogador1;
	private Jogador jogador2;
	private Baralho baralho;
	protected ArrayList<Carta> cartasSelecionadas = new ArrayList<Carta>();
	private String ganhador;
	
	public Jogo(){
		pedirNomesDosJogadores();
		
		baralho = new Baralho();
		
		for(int i = 1; i <= 10; i++){
			System.out.println("\n=----------Cartas retiradas na rodada " + i + "----------=");
			iniciarJogo();
		}
		
		if(jogador1.getPontos() == jogador2.getPontos()){
			System.out.println("\n=----------Resultado Parcial----------=");
			System.out.println("\nPontuacao de " + jogador1.getNome() + ": " + jogador1.getPontos());
			System.out.println("Pontuacao de " + jogador2.getNome() + ": " + jogador2.getPontos());
			System.out.println("\nHouve um empate! Uma nova rodada ira desempatar!");
			System.out.println("\n=----------Cartas retiradas na rodada 11----------=");
			
			iniciarJogo();
			
			exibirResultadoFinal();
		}else{
			exibirResultadoFinal();
		}
		
		
	}
	
	public void pedirNomesDosJogadores(){
		Scanner teclado = new Scanner(System.in);
		String nomeJogador1, nomeJogador2;
		
		System.out.println("=----------Jogo de cartas de Baralho----------=");
		System.out.println("\nJogador 1, digite seu nome: ");
		nomeJogador1 = teclado.nextLine();
		jogador1 = new Jogador(nomeJogador1);
		
		System.out.println("\nJogador 2, digite seu nome: ");
		nomeJogador2 = teclado.nextLine();
		jogador2 = new Jogador(nomeJogador2);
	}
	
	public void iniciarJogo(){
		baralho.embaralhar();
		
		//System.out.println("\n" + baralho + "\n");
		
		x = new DistribuirCima();
		
		cartasSelecionadas = distribuir();
		
		System.out.println("\nCarta de " + jogador1.getNome() + ": " + cartasSelecionadas.get(0));
		System.out.println("Carta de " + jogador2.getNome() + ": " + cartasSelecionadas.get(1));
		
		verificarMaiorCarta(cartasSelecionadas);
	}
	
	public ArrayList<Carta> distribuir(){
		ArrayList<Carta> cartasRetiradas = new ArrayList<Carta>();
		cartasRetiradas = x.retirarCartas(baralho);
		return cartasRetiradas;
	}
	
	public void verificarMaiorCarta(ArrayList<Carta> cartas){
		Carta carta1 = cartas.get(0);
		Carta carta2 = cartas.get(1);
		int numeroCarta1, numeroCarta2;
		
		switch(carta1.getNumero()){
			case "A":
				carta1.setNumero("1");
				break;
			case "J":
				carta1.setNumero("11");
				break;
			case "Q":
				carta1.setNumero("12");
				break;
			case "K":
				carta1.setNumero("13");
				break;
		}
		
		switch(carta2.getNumero()){
			case "A":
				carta2.setNumero("1");
				break;
			case "J":
				carta2.setNumero("11");
				break;
			case "Q":
				carta2.setNumero("12");
				break;
			case "K":
				carta2.setNumero("13");
				break;
		}
		
		numeroCarta1 = Integer.parseInt(carta1.getNumero());
		numeroCarta2 = Integer.parseInt(carta2.getNumero());
		
		if(numeroCarta1 > numeroCarta2){
			jogador1.adicionarPonto();
		}else if(numeroCarta2 > numeroCarta1){
			jogador2.adicionarPonto();
		}
	}
	
	public void exibirResultadoFinal(){
		System.out.println("\n=----------Resultado Final----------=");
		System.out.println("\nPontuacao de " + jogador1.getNome() + ": " + jogador1.getPontos());
		System.out.println("Pontuacao de " + jogador2.getNome() + ": " + jogador2.getPontos());
		if(jogador1.getPontos() > jogador2.getPontos()){
			System.out.println("\n" + jogador1.getNome() + " venceu! Parabéns!");
		}else{
			System.out.println("\n" + jogador2.getNome() + " venceu! Parabéns!");
		}
	}
	
	public static void main(String[] args) throws Exception {
		new Jogo();
	}
}
