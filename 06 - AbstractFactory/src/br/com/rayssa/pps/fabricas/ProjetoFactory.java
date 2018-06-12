package br.com.jaenia.pps.fabricas;

import br.com.jaenia.pps.produtosabstratos.Comodo;

public class ProjetoFactory {
	public static Comodo criarComodo(String nome, String tipo, int paredes, int portas, int metais, int loucas){
		FabricaComodo fc = null;
		if(paredes > 8 || portas > 3 || metais > 5 || loucas > 5){
			return null;	
		}else{
			switch(tipo){
			case "basica":
				fc = new FabComodoCasaBasica();
				break;
			case "conforto":
				fc = new FabComodoCasaConforto();
				break;
			case "luxo":
				fc = new FabComodoCasaLuxo();
				break;
			default:
				System.out.println("Tipo de casa invalida!");
				break;
			}
			
			Comodo c = new Comodo();
			
			c.setNome(nome);
			
			c.setPiso(fc.montarPiso());
			
			for(int i = 1; i < paredes; i++){
				c.addParede(fc.montarParede());
			}
			
			for(int i = 1; i < portas; i++){
				c.addPorta(fc.montarPorta());
			}
			
			c.setTinta(fc.montarTinta());
			
			for(int i = 1; i < metais; i++){
				c.addMetal(fc.montarMetal());
			}
			
			for(int i = 1; i < loucas; i++){
				c.addLouca(fc.montarLouca());
			}
			
			return c; 
		}
	}
}
