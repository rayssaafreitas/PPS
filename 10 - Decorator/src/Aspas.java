
public class Aspas extends NumeroUmDecorator {

	public Aspas(NumeroUm umnumero) {
		super(umnumero);
		nome = "'" + umnumero.getNome() + "'";
	}

}