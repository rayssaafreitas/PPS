package classes;

public class Aluguel {
	private Fita fita;
	private int diasAlugada;
  
	public Aluguel(Fita fita, int diasAlugada) {
		this.fita = fita;
		this.diasAlugada = diasAlugada;
	}
  
	public Fita getFita() {
		return fita;
	}
  
	public int getDiasAlugada() {
		return diasAlugada;
	}
	
	public double valorDoAluguel(){
		return fita.getTipo().calculaValor(diasAlugada);
	}
	
	public int verificarBonusAluguel(){
		return fita.getTipo().verificaBonus(diasAlugada);
	}
}