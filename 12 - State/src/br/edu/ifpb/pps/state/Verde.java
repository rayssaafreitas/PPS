package br.edu.ifpb.pps.state;

public class Verde implements SemaforoState {

	@Override
	public SemaforoState tick() {
		System.out.println("Verde -> Amarelo");
		return new Amarelo();
	}

	@Override
	public SemaforoState panic() {
		System.out.println("Botao Panic pressionado! Verde -> Vermelho Panico");
		return new VermelhoPanico();
	}

	@Override
	public SemaforoState off() {
		System.out.println("Botao Off pressionado! Verde -> Amarelo Intermitente");
		return new Amarelo();
	}

	@Override
	public SemaforoState on(){
		System.out.println("Botao On Pressionado! Verde -> Vermelho");
		return new Vermelho();
	}

}
