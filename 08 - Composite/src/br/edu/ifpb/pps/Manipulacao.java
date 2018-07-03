package br.edu.ifpb.pps;

public class Manipulacao {
	public static void main(String[] args){
		Ponto ponto = new Ponto();
		Reta reta = new Reta();
		
		ponto.desenhaFigura();
		reta.desenhaFigura();
		
		Quadrilatero q1 = new Quadrilatero();
		
		System.out.println(q1);
		
		q1.addFigura(new Ponto());
		q1.addFigura(new Reta());
		q1.addFigura(new Circulo());
		q1.addFigura(new Quadrilatero());
		
		q1.areaFigura();
		
		System.out.println(q1);
		
		Figura f = new QuadradoAdapter();
		f.desenhaFigura();
	}
}
