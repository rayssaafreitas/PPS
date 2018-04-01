

public class Jogador {

	private String nome;
	private int pontos;
	private Carta carta;
	
	public Jogador(String nome, int pontos) {
		this.nome = nome;
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}

	public String toString() {
		return "Jogador: " + getNome() + " [Carta: " + getCarta() + "]" + " Pontos: " + getPontos();
	}

	public String toString2() {
		return "Jogador ganho " + getNome() ;	}
}
