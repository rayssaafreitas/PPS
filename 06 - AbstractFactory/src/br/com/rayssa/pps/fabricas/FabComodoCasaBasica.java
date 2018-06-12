package br.com.rayssa.pps.fabricas;

import br.com.rayssa.pps.produtoconcretos.loucas.LoucaMaisBarata;
import br.com.rayssa.pps.produtoconcretos.metais.MetalFerro;
import br.com.rayssa.pps.produtosabstratos.Louca;
import br.com.rayssa.pps.produtosabstratos.Metal;
import br.com.rayssa.pps.produtosabstratos.Parede;
import br.com.rayssa.pps.produtosabstratos.Piso;
import br.com.rayssa.pps.produtosabstratos.Porta;
import br.com.rayssa.pps.produtosabstratos.Tinta;
import br.com.rayssa.pps.produtosconcretos.paredes.ParedeGesso;
import br.com.rayssa.pps.produtosconcretos.pisos.PisoCeramica;
import br.com.rayssa.pps.produtosconcretos.portas.PortaMDF;
import br.com.rayssa.pps.produtosconcretos.tintas.TintaLatex;

public class FabComodoCasaBasica extends FabricaComodo{
	
	public Piso montarPiso(){
		return new PisoCeramica();
	}
	
	public Parede montarParede(){
		return new ParedeGesso();
	}
	
	public Porta montarPorta(){
		return new PortaMDF();
	}
	
	public Tinta montarTinta(){
		return new TintaLatex();
	}
	
	public Metal montarMetal(){
		return new MetalFerro();
	}
	
	public Louca montarLouca(){
		return new LoucaMaisBarata();
	}
}
