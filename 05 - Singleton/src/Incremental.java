
public class Incremental {
	private static Incremental instancia = null;
	
	private static int count = 0;
	private int numero;
	
	private Incremental(){	
	}
	
	public static Incremental getInstancia(){
		if(Incremental.instancia == null){
			Incremental.instancia = new Incremental();
		}
		Incremental.instancia.numero = ++count;
		return Incremental.instancia;
	}
	
	public String toString(){
		return "Incremental " + numero;
	}
}