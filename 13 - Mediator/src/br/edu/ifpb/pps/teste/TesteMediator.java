package br.edu.ifpb.pps.teste;

import br.edu.ifpb.pps.colleague.BBColleague;
import br.edu.ifpb.pps.colleague.BradescoColleague;
import br.edu.ifpb.pps.colleague.CEFColleague;
import br.edu.ifpb.pps.colleague.ItauColleague;
import br.edu.ifpb.pps.mediator.TransferenciaMediator;

public class TesteMediator {
	public static void main(String[] args){
		//mediator
		TransferenciaMediator mediator = new TransferenciaMediator();
		
		//colleagues
		CEFColleague caixa = new CEFColleague(mediator);
		BBColleague bancoDoBrasil = new BBColleague(mediator);
		ItauColleague itau = new ItauColleague(mediator);
		BradescoColleague bradesco = new BradescoColleague(mediator);
		
		//adicionando os colleagues ao mediator
		mediator.addColleague(caixa);
		mediator.addColleague(bancoDoBrasil);
		mediator.addColleague(itau);
		mediator.addColleague(bradesco);
		
		//transferências
		caixa.enviarTranferencia(10.00, bancoDoBrasil);
		bancoDoBrasil.enviarTranferencia(25.50, itau);
		itau.enviarTranferencia(49.99, bradesco);
		bradesco.enviarTranferencia(100.49, caixa);
	}
}
