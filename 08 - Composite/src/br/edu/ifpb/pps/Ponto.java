package br.edu.ifpb.pps;

public class Ponto implements Figura{
	public Ponto(){}
	
	@Override
	public void perimetroFigura() {
		System.out.println("Perimetro de ponto e inexistente");
	}

	@Override
	public void areaFigura() {
		System.out.println("Area de ponto e inexistente");
	}

	@Override
	public void desenhaFigura() {
		System.out.println("Desenhando ponto");
	}
	
	public String toString(){
		return "Ponto";
	}
}
