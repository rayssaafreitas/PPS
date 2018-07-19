package br.edu.ifpb.pps.teste;
import java.util.Timer;
import java.util.TimerTask;

import br.edu.ifpb.pps.model.Semaforo;

public class TesteState {
	public static void main(String[] args) {
		//come�a amarelo intermitente
		Semaforo semaforo = new Semaforo();
		
		//aciona o funcionamento normal
		semaforo.on(); //vermelho
		
		//funcionamento normal
		semaforo.tick(); //verde
		semaforo.tick(); //amarelo
		semaforo.tick(); //vermelho
		semaforo.tick(); //verde
		
		//aciona o botao de panic
		semaforo.panic(); //vermelho p�nico
		
		//tentativas inv�lidas de voltar ao funcionamento normal
		semaforo.tick(); //inv�lido
		semaforo.off(); //inv�lido
		
		//voltando ao normal
		semaforo.on(); //vermelho
		
		//aciona o botao de off
		semaforo.off(); // amarelo intermitente
		
		//tentativa inv�lida de voltar ao funcionamento normal
		semaforo.tick(); //inv�lido
		
		//voltando ao normal
		semaforo.on(); //vermelho
	}
}
