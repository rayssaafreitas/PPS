package br.edu.ifpb.pps.colleague;

import br.edu.ifpb.pps.mediator.Mediator;

public class ItauColleague extends BancoColleague {

	public ItauColleague(Mediator mediator){
		super(mediator);
	}

	@Override
	public void receberTransferencia(double quantia) {
		System.out.println("Itau recebeu: R$ " + quantia);
	}
}
