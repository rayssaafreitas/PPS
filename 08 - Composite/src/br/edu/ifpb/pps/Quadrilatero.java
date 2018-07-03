package br.edu.ifpb.pps;

public class Quadrilatero extends FiguraComposta {
	public Quadrilatero(){}
		
	@Override
	public void perimetroFigura() {
		System.out.println("Calculando perimetro de quadrilatero");
	}

	@Override
	public void areaFigura() {
		System.out.println("Calculando area de quadrilatero");
	}

	@Override
	public void desenhaFigura() {
		System.out.println("Desenhando quadrilatero");
	}
	
	public String toString(){
		String texto = "Quadrilatero\n";
		texto += super.toString();
		return texto;
	}
}
