import br.com.jaenia.pps.fabricas.ProjetoFactory;
import br.com.jaenia.pps.produtosabstratos.Comodo;

public class Projeto {

	public static void main(String[] args) {
		ProjetoFactory fabrica = new ProjetoFactory();
		Comodo c;
		
		c = fabrica.criarComodo("sala", "luxo", 5, 2, 3, 3);
		
		if(c != null){
			System.out.println(c.toString());
		}

	}

}
