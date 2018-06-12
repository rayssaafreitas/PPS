package br.com.jaenia.pps.fabricas;

import br.com.jaenia.pps.produtoconcretos.loucas.LoucaElizabeth;
import br.com.jaenia.pps.produtoconcretos.metais.MetalAluminio;
import br.com.jaenia.pps.produtosabstratos.Louca;
import br.com.jaenia.pps.produtosabstratos.Metal;
import br.com.jaenia.pps.produtosabstratos.Parede;
import br.com.jaenia.pps.produtosabstratos.Piso;
import br.com.jaenia.pps.produtosabstratos.Porta;
import br.com.jaenia.pps.produtosabstratos.Tinta;
import br.com.jaenia.pps.produtosconcretos.paredes.ParedeAlvenaria;
import br.com.jaenia.pps.produtosconcretos.pisos.PisoCeramicaEsmaltada;
import br.com.jaenia.pps.produtosconcretos.portas.PortaMadeira;
import br.com.jaenia.pps.produtosconcretos.tintas.TintaAcrilica;

public class FabComodoCasaConforto extends FabricaComodo {

	public Piso montarPiso() {
		return new PisoCeramicaEsmaltada();
	}

	public Parede montarParede() {
		return new ParedeAlvenaria();
	}

	public Porta montarPorta() {
		return new PortaMadeira();
	}

	public Tinta montarTinta() {
		return new TintaAcrilica();
	}

	public Metal montarMetal() {
		return new MetalAluminio();
	}

	public Louca montarLouca() {
		return new LoucaElizabeth();
	}

}
