package br.edu.ifpb.pps;

public class FabricaNome {
	public static Nome criarNome(String nome){
		if (nome.contains(",")){
			return new NomeInvertido(nome);
		}else{
			return new NomeComum(nome);
		}
	}
}
