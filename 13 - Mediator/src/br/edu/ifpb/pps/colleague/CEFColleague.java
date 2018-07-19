package br.edu.ifpb.pps.colleague;

import br.edu.ifpb.pps.mediator.Mediator;

public class CEFColleague extends BancoColleague{
	
	public CEFColleague(Mediator mediator){
		super(mediator);
	}

	@Override
	public void receberTransferencia(double quantia) {
		System.out.println("Caixa Economica Federal recebeu: R$ " + quantia);
	}
}
