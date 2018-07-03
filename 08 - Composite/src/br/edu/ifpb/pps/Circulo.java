package br.edu.ifpb.pps;

public class Circulo extends FiguraComposta {
	public Circulo(){}
	
	@Override
	public void perimetroFigura() {
		System.out.println("Calculando perimetro de circulo");
	}

	@Override
	public void areaFigura() {
		System.out.println("Calculando area de circulo");
	}

	@Override
	public void desenhaFigura() {
		System.out.println("Desenhando circulo");
	}
	
	public String toString(){
		String texto = "Circulo\n";
		texto += super.toString();
		return texto;
	}
}
