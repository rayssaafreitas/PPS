
public class Chaves extends NumeroUmDecorator {

	public Chaves(NumeroUm umnumero) {
		super(umnumero);
		nome = "{" + umnumero.getNome() + "}";
	}

}