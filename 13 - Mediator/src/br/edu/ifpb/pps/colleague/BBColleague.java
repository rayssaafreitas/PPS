package br.edu.ifpb.pps.colleague;

import br.edu.ifpb.pps.mediator.Mediator;

public class BBColleague extends BancoColleague {

	public BBColleague(Mediator mediator){
		super(mediator);
	}

	@Override
	public void receberTransferencia(double quantia) {
		System.out.println("Banco do Brasil recebeu: R$ " + quantia);
	}
}
