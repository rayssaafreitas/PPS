
public class Parenteses extends NumeroUmDecorator {

	public Parenteses(NumeroUm umnumero) {
		super(umnumero);
		nome = "(" + umnumero.getNome() + ")";
	}

}