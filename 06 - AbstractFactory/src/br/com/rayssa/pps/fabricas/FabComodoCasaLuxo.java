package br.com.rayssa.pps.fabricas;

import br.com.rayssa.pps.produtoconcretos.loucas.LoucaDECA;
import br.com.rayssa.pps.produtoconcretos.metais.MetalInox;
import br.com.rayssa.pps.produtosabstratos.Louca;
import br.com.rayssa.pps.produtosabstratos.Metal;
import br.com.rayssa.pps.produtosabstratos.Parede;
import br.com.rayssa.pps.produtosabstratos.Piso;
import br.com.rayssa.pps.produtosabstratos.Porta;
import br.com.rayssa.pps.produtosabstratos.Tinta;
import br.com.rayssa.pps.produtosconcretos.paredes.ParedeAlvenariaDryWall;
import br.com.rayssa.pps.produtosconcretos.pisos.PisoPorcelanato;
import br.com.rayssa.pps.produtosconcretos.portas.PortaMadeiraLei;
import br.com.rayssa.pps.produtosconcretos.tintas.TintaSuperLavavel;

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
