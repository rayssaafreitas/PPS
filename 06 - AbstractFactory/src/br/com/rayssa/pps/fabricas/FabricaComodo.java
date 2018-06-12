package br.com.jaenia.pps.fabricas;

import java.util.List;

import br.com.jaenia.pps.produtosabstratos.Louca;
import br.com.jaenia.pps.produtosabstratos.Metal;
import br.com.jaenia.pps.produtosabstratos.Parede;
import br.com.jaenia.pps.produtosabstratos.Piso;
import br.com.jaenia.pps.produtosabstratos.Porta;
import br.com.jaenia.pps.produtosabstratos.Tinta;

public abstract class FabricaComodo {
	
	public abstract Piso montarPiso();
	public abstract Parede montarParede();
	public abstract Porta montarPorta();
	public abstract Tinta montarTinta();
	public abstract Metal montarMetal();
	public abstract Louca montarLouca();
	
}
