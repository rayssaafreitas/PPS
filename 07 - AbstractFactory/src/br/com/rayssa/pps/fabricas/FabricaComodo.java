package br.com.rayssa.pps.fabricas;

import java.util.List;

import br.com.rayssa.pps.produtosabstratos.Louca;
import br.com.rayssa.pps.produtosabstratos.Metal;
import br.com.rayssa.pps.produtosabstratos.Parede;
import br.com.rayssa.pps.produtosabstratos.Piso;
import br.com.rayssa.pps.produtosabstratos.Porta;
import br.com.rayssa.pps.produtosabstratos.Tinta;

public abstract class FabricaComodo {
	
	public abstract Piso montarPiso();
	public abstract Parede montarParede();
	public abstract Porta montarPorta();
	public abstract Tinta montarTinta();
	public abstract Metal montarMetal();
	public abstract Louca montarLouca();
	
}
