package br.edu.ifpb.pps.colleague;

import br.edu.ifpb.pps.mediator.Mediator;

public class BradescoColleague extends BancoColleague {
	
	public BradescoColleague(Mediator mediator){
		super(mediator);
	}

	@Override
	public void receberTransferencia(double quantia) {
		System.out.println("Bradesco recebeu: R$ " + quantia);
	}
}
