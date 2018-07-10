
public class Teste {

	public static void main(String[] args) {

		NumeroUm umNumero = new NumeroUm();
		umNumero.imprimir();

		umNumero = new Chaves(umNumero);
		umNumero.imprimir();

		umNumero = new Aspas(umNumero);
		umNumero.imprimir();

		umNumero = new Parenteses(umNumero);
		umNumero.imprimir();

	}
}
