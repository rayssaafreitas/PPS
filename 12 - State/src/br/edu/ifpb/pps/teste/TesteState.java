package br.edu.ifpb.pps.teste;
import java.util.Timer;
import java.util.TimerTask;

import br.edu.ifpb.pps.model.Semaforo;

public class TesteState {
	public static void main(String[] args) {
		//começa amarelo intermitente
		Semaforo semaforo = new Semaforo();
		
		//aciona o funcionamento normal
		semaforo.on(); //vermelho
		
		//funcionamento normal
		semaforo.tick(); //verde
		semaforo.tick(); //amarelo
		semaforo.tick(); //vermelho
		semaforo.tick(); //verde
		
		//aciona o botao de panic
		semaforo.panic(); //vermelho pânico
		
		//tentativas inválidas de voltar ao funcionamento normal
		semaforo.tick(); //inválido
		semaforo.off(); //inválido
		
		//voltando ao normal
		semaforo.on(); //vermelho
		
		//aciona o botao de off
		semaforo.off(); // amarelo intermitente
		
		//tentativa inválida de voltar ao funcionamento normal
		semaforo.tick(); //inválido
		
		//voltando ao normal
		semaforo.on(); //vermelho
	}
}
