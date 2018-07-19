package br.edu.ifpb.pps.colleague;

import br.edu.ifpb.pps.mediator.Mediator;

public abstract class BancoColleague {
	private Mediator mediator;
	
	public BancoColleague(Mediator mediator){
		super();
		this.mediator = mediator;
	}
	
	public void enviarTranferencia(double quantia, BancoColleague banco){
		mediator.enviarTransferencia(quantia, banco);
	}
	
	public abstract void receberTransferencia(double quantia);
}
