package classes;

import interfaces.TipoFita;

public class Fita {
	  private TipoFita tipo;
	  private String titulo;

	  public Fita(String titulo, TipoFita tipo) {
	    this.titulo = titulo;
	    this.tipo = tipo;
	  }
	  
	  public String getTitulo() {
	    return titulo;
	  }
	  
	  public void setTipo(TipoFita t) {
		    this.tipo = tipo;
	  }
	  
	  public TipoFita getTipo(){
		  return tipo;
	  }
}
