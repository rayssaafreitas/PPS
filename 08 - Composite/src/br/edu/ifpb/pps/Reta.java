package br.edu.ifpb.pps;

public class Reta implements Figura {
	/*private double comprimento;
	
	public double getComprimento(){
		return this.comprimento;
	}
	
	public void setComprimento(double comprimento){
		this.comprimento = comprimento;
	}*/
	
	public Reta(){}

	@Override
	public void perimetroFigura() {
		System.out.println("Perimetro de Reta e inexistente");
	}

	@Override
	public void areaFigura() {
		System.out.println("Area de Reta e inexistente");
	}

	@Override
	public void desenhaFigura() {
		System.out.println("Desenhando Reta");
	}
	
	public String toString(){
		return "Reta";
	}
}
