package br.edu.ifpb.pps;

public class Triangulo extends FiguraComposta {
	public Triangulo(){}
	
	@Override
	public void perimetroFigura() {
		System.out.println("Calculando perimetro de triangulo");
	}

	@Override
	public void areaFigura() {
		System.out.println("Calculando area de triangulo");
	}

	@Override
	public void desenhaFigura() {
		System.out.println("Desenhando triangulo");
	}
	
	public String toString(){
		String texto = "Triangulo\n";
		texto += super.toString();
		return texto;
	}
}
