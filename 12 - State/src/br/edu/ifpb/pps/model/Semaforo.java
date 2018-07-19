package br.edu.ifpb.pps.model;

import br.edu.ifpb.pps.state.AmareloIntermitente;
import br.edu.ifpb.pps.state.SemaforoState;

public class Semaforo {
	private SemaforoState estado;
	
	public Semaforo(){
		this.estado = new AmareloIntermitente();
	}
	
	public void tick(){
		this.status();
		this.estado = estado.tick();
	}

	public void panic(){
		this.status();
		this.estado = estado.panic();
	}
	
	public void off(){
		this.status();
		this.estado = estado.off();
	}
	
	public void on(){
		this.status();
		this.estado = estado.on();
	}
	
	public void status() {
		System.out.println("Cor atual do semaforo: " + estado.getClass().getSimpleName());
	}
}
