package br.com.jaenia.pps.fabricas;

import br.com.jaenia.pps.produtoconcretos.loucas.LoucaDECA;
import br.com.jaenia.pps.produtoconcretos.metais.MetalInox;
import br.com.jaenia.pps.produtosabstratos.Louca;
import br.com.jaenia.pps.produtosabstratos.Metal;
import br.com.jaenia.pps.produtosabstratos.Parede;
import br.com.jaenia.pps.produtosabstratos.Piso;
import br.com.jaenia.pps.produtosabstratos.Porta;
import br.com.jaenia.pps.produtosabstratos.Tinta;
import br.com.jaenia.pps.produtosconcretos.paredes.ParedeAlvenariaDryWall;
import br.com.jaenia.pps.produtosconcretos.pisos.PisoPorcelanato;
import br.com.jaenia.pps.produtosconcretos.portas.PortaMadeiraLei;
import br.com.jaenia.pps.produtosconcretos.tintas.TintaSuperLavavel;

public class FabComodoCasaLuxo extends FabricaComodo{
	public Piso montarPiso(){
		return new PisoPorcelanato();
	}
	
	public Parede montarParede(){
		return new ParedeAlvenariaDryWall();
	}
	
	public Porta montarPorta(){
		return new PortaMadeiraLei();
	}
	
	public Tinta montarTinta(){
		return new TintaSuperLavavel();
	}
	
	public Metal montarMetal(){
		return new MetalInox();
	}
	
	public Louca montarLouca(){
		return new LoucaDECA();
	}
}
