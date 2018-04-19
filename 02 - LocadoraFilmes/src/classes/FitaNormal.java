package classes;

import interfaces.TipoFita;

public class FitaNormal implements TipoFita{
	private double valor = 2;
	
	public double calculaValor(int dias){
		if(dias > 2) {
	          valor += (dias - 2) * 1.5;
	    }
		return valor;
	}
	
	public int verificaBonus(int dias){
		return 0;
	}
}