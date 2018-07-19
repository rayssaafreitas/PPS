package br.edu.ifpb.pps.state;

public class AmareloIntermitente implements SemaforoState {

	@Override
	public SemaforoState tick() {
		System.out.println("Operacao invalida! Use o panic() ou o on()");
		return this;
	}

	@Override
	public SemaforoState panic() {
		System.out.println("Botao Panic pressionado! Amarelo Intermitente -> Vermelho");
		return new Vermelho();
	}

	@Override
	public SemaforoState off() {
		System.out.println("Botao Off pressionado! Amarelo Intermitente -> Amarelo Intermitente");
		return this;
	}

	@Override
	public SemaforoState on(){
		System.out.println("Botao On Pressionado! Amarelo Intermitente -> Vermelho");
		return new Vermelho();
	}
}
