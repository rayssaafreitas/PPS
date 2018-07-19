package br.edu.ifpb.pps.state;

public class Amarelo implements SemaforoState {

	@Override
	public SemaforoState tick() {
		System.out.println("Amarelo -> Vermelho");
		return new Vermelho();
	}

	@Override
	public SemaforoState panic() {
		System.out.println("Botao Panic pressionado! Amarelo -> Vermelho Panico");
		return new VermelhoPanico();
	}

	@Override
	public SemaforoState off() {
		System.out.println("Botao Off pressionado! Amarelo -> Amarelo Intermitente");
		return new AmareloIntermitente();
	}

	@Override
	public SemaforoState on(){
		System.out.println("Botao On Pressionado! Amarelo -> Vermelho");
		return new Vermelho();
	}

}
