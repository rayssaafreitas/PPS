package br.com.jaenia.pps.fabricas;

import br.com.jaenia.pps.produtoconcretos.loucas.LoucaMaisBarata;
import br.com.jaenia.pps.produtoconcretos.metais.MetalFerro;
import br.com.jaenia.pps.produtosabstratos.Louca;
import br.com.jaenia.pps.produtosabstratos.Metal;
import br.com.jaenia.pps.produtosabstratos.Parede;
import br.com.jaenia.pps.produtosabstratos.Piso;
import br.com.jaenia.pps.produtosabstratos.Porta;
import br.com.jaenia.pps.produtosabstratos.Tinta;
import br.com.jaenia.pps.produtosconcretos.paredes.ParedeGesso;
import br.com.jaenia.pps.produtosconcretos.pisos.PisoCeramica;
import br.com.jaenia.pps.produtosconcretos.portas.PortaMDF;
import br.com.jaenia.pps.produtosconcretos.tintas.TintaLatex;

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
