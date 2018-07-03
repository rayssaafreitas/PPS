package br.edu.ifpb.pps;

public class QuadradoAdapter implements Figura{
	private Quadrado quadrado;
	
	public QuadradoAdapter(){
		this.quadrado = new Quadrado();
	}

	@Override
	public void perimetroFigura() {
		this.quadrado.volume();
	}

	@Override
	public void areaFigura() {
		this.quadrado.area();
	}

	@Override
	public void desenhaFigura() {
		this.quadrado.draw();
	}

}
