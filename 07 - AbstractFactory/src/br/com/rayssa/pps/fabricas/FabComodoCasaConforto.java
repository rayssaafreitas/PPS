package br.com.rayssa.pps.fabricas;

import br.com.rayssa.pps.produtoconcretos.loucas.LoucaElizabeth;
import br.com.rayssa.pps.produtoconcretos.metais.MetalAluminio;
import br.com.rayssa.pps.produtosabstratos.Louca;
import br.com.rayssa.pps.produtosabstratos.Metal;
import br.com.rayssa.pps.produtosabstratos.Parede;
import br.com.rayssa.pps.produtosabstratos.Piso;
import br.com.rayssa.pps.produtosabstratos.Porta;
import br.com.rayssa.pps.produtosabstratos.Tinta;
import br.com.rayssa.pps.produtosconcretos.paredes.ParedeAlvenaria;
import br.com.rayssa.pps.produtosconcretos.pisos.PisoCeramicaEsmaltada;
import br.com.rayssa.pps.produtosconcretos.portas.PortaMadeira;
import br.com.rayssa.pps.produtosconcretos.tintas.TintaAcrilica;

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
