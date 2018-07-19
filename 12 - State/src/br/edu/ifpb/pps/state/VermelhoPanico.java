package br.edu.ifpb.pps.state;

public class VermelhoPanico implements SemaforoState {
	@Override
	public SemaforoState tick() {
		System.out.println("Operacao invalida! Use o on()");
		return this;
	}

	@Override
	public SemaforoState panic() {
		System.out.println("Botao Panic pressionado! Vermelho Panico -> Vermelho Panico");
		return this;
	}

	@Override
	public SemaforoState off() {
		System.out.println("Operacao invalida! Use o on()");
		return this;
	}

	@Override
	public SemaforoState on(){
		System.out.println("Botao On Pressionado! Vermelho Panico -> Vermelho");
		return new Vermelho();
	}

}
