package locadora;

public class FitaLancamento implements TipoFita{
	private double valor = 0;
	
	public double calculaValor(int dias){
		valor += dias * 3;
		return valor;
	}
	
	public int verificaBonus(int dias){
		if(dias > 1) {
		   return 1;
		}
		return 0;
	}
}