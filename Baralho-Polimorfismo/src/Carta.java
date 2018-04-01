

public class Carta {
	
	//Definicao dos Nipes
	public static String[] Nipes = {"Ouro", "Copas", "Espadas", "Paus"};
	
	//Definicao dos Valores
	public static String[] Valor = {"As", "2", "3", "4", "5", "6","7", "8", "9", "10", "J", "Q", "K"};
	
	private String nipe;
	private String valor;
	private int peso; //Definicação de quanto a carta vale em relação as demais
	
	public Carta(String nipe, String valor, int peso) {
		this.nipe = nipe;
		this.valor = valor;
		this.peso = peso;
	}
	
	public String getNipe() {
		return nipe;
	}
	public void setNipe(String nipe) {
		this.nipe = nipe;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Nipe: " + getNipe() + " - Valor: " + getValor() + " - Peso: " + getPeso();
	}
	
	
}
