package br.edu.ifpb.pps;

public class TesteNomes {
	
	public static void  main(String[] args){
		Nome nome1 = FabricaNome.criarNome("McNealy, Scott");
		Nome nome2 = FabricaNome.criarNome("James Gosling");
		Nome nome3 = FabricaNome.criarNome("Naughton, Patrick");
		
		System.out.println(nome1.organizaNome());
		System.out.println(nome2.organizaNome());
		System.out.println(nome3.organizaNome());
	}	
}
