package br.edu.ifpb.pps;

public class LosangoAdapter implements Figura{
	private Losango losango;
	
	public LosangoAdapter(){
		this.losango = new Losango();
	}

	@Override
	public void perimetroFigura() {
		this.losango.volume();
	}

	@Override
	public void areaFigura() {
		this.losango.area();
	}

	@Override
	public void desenhaFigura() {
		this.losango.draw();
	}

}
