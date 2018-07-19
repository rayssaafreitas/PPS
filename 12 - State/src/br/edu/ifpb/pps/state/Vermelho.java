package br.edu.ifpb.pps.state;

public class Vermelho implements SemaforoState {

	@Override
	public SemaforoState tick() {
		System.out.println("Vermelho -> Verde");
		return new Verde();
	}

	@Override
	public SemaforoState panic() {
		System.out.println("Botao Panic pressionado! Vermelho -> Vermelho Panico");
		return new VermelhoPanico();
	}

	@Override
	public SemaforoState off() {
		System.out.println("Botao Off pressionado! Vermelho -> Amarelo Intermitente");
		return new AmareloIntermitente();
	}

	@Override
	public SemaforoState on(){
		System.out.println("Botao On Pressionado! Vermelho -> Vermelho");
		return this;
	}

}
