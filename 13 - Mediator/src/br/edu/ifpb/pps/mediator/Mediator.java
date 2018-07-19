package br.edu.ifpb.pps.mediator;

import br.edu.ifpb.pps.colleague.BancoColleague;

public interface Mediator {
	public void enviarTransferencia(double quantia, BancoColleague banco);
}
