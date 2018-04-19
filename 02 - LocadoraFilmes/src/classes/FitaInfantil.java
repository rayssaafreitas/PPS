package classes;

import interfaces.TipoFita;

public class FitaInfantil implements TipoFita{
	private double valor = 1.5;
	
	public double calculaValor(int dias){
		if(dias > 3) {
	          valor += (dias - 3) * 1.5;
	    }
		return valor;
	}
	
	public int verificaBonus(int dias){
		return 0;
	}
}