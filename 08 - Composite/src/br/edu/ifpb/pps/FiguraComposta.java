package br.edu.ifpb.pps;

import java.util.ArrayList;
import java.util.List;

public abstract class FiguraComposta implements Figura{
	private List<Figura> figuras;
	
	public FiguraComposta(){
		this.figuras = new ArrayList<Figura>();
	}
	
	public void addFigura(Figura f){
		this.figuras.add(f);
	}
	
	public List<Figura> getFiguras(){
		return this.figuras;
	}
	
	public String toString(){
		int tamanhoFiguras = figuras.size();
		String texto = "";
		if(!figuras.isEmpty()){
			texto = "Componentes da figura: ";
			for(Figura f : figuras){
				texto += f.toString();
				if(!f.equals(figuras.get(tamanhoFiguras - 1))){
					texto += " + ";
				}
			}
		}
		return texto;
	}
}
