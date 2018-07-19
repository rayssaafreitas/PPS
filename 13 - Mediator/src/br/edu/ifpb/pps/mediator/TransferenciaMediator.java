package br.edu.ifpb.pps.mediator;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.pps.colleague.BancoColleague;

public class TransferenciaMediator implements Mediator {
	private List<BancoColleague> bancos;
	
	public TransferenciaMediator(){
		super();
		this.bancos = new ArrayList<BancoColleague>();
	}
	
	public void addColleague(BancoColleague banco){
		bancos.add(banco);
	}
	
	public void removeColleague(BancoColleague banco){
		bancos.remove(banco);
	}
	
	@Override
	public void enviarTransferencia(double quantia, BancoColleague banco) {
		for(BancoColleague b : bancos){
			if(b == banco){
				b.receberTransferencia(quantia);
			}
		}
	}

}
