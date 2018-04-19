package locadora;

public class Locadora {
	  public static void main(String[] args) {
		
	    Cliente c1 = new Cliente("Juliana");
	    c1.adicionaAluguel(new Aluguel(new Fita("O Exorcista                   ", new FitaNormal()), 3));
	    c1.adicionaAluguel(new Aluguel(new Fita("Men in Black                  ", new FitaNormal()), 2));
	    c1.adicionaAluguel(new Aluguel(new Fita("Jurassic Park III             ", new FitaLancamento()), 3));
	    c1.adicionaAluguel(new Aluguel(new Fita("Planeta dos Macacos           ", new FitaLancamento()), 4));
	    c1.adicionaAluguel(new Aluguel(new Fita("Pateta no Planeta dos Macacos ", new FitaInfantil()), 10));
	    c1.adicionaAluguel(new Aluguel(new Fita("O Rei Leao                    ", new FitaInfantil()), 30));

	    System.out.println(c1.extrato());
	  }
	}