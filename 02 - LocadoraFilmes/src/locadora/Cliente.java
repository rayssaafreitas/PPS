package locadora;

import java.util.*;
public class Cliente {
	
  private String nome;
  private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();
  private int pontos = 0;
  
  public Cliente(String nome) {
    this.nome = nome;
  }
  
  public String getNome() {
    return nome;
  }
  
  public void adicionaAluguel(Aluguel aluguel) {
    fitasAlugadas.add(aluguel);
  }
  
  public String extrato() {
    double valorTotal = 0.0;
    
    Iterator<Aluguel> alugueis = fitasAlugadas.iterator();
    
    String resultado = "Registro de Alugueis de " + getNome() + "\n";
    
    while(alugueis.hasNext()) {
      double valorCorrente = 0.0;
      
      Aluguel cada = (Aluguel)alugueis.next();
      // determina valores para cada linha
      valorCorrente = cada.valorDoAluguel();

      // mostra valores para este aluguel
      resultado += "\t" + cada.getFita().getTitulo() + "\t" + valorCorrente + "\n";
      valorTotal += valorCorrente;
    } // while
    
    calculaPontos();
    
    // adiciona rodapé
    resultado += "Valor total devido: " + valorTotal + "\n";
    resultado += "Voce acumulou " + pontos +
              " pontos de alugador frequente";
    return resultado;
  }
  
  public void calculaPontos(){
	  for(Aluguel a : fitasAlugadas){
		  pontos++;
		  pontos += a.verificarBonusAluguel();
	  }
  }
}
