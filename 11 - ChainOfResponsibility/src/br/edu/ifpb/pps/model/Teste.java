package br.edu.ifpb.pps.model;

import java.math.BigDecimal;

/**
 * Teste da aplicacao
 */
public class Texte
{

  public static void main(String[] args)
  {
    // Preço a ser cobrado: R$ 2,02
    ATM atm = new ATM(new BigDecimal(4.45));
    
    // Reconhecido R$ 1,00
    // Falta R$ 1,02
    atm.deposit(Coin.ONE_POUND);
    
    // Reconhecido R$ 0,50
    // Falta R$ 0,52
    atm.deposit(Coin.FIFTY_PENCE);
    
    // Reconhecido R$ 0,25
    // Falta R$ 0,27
    atm.deposit(Coin.TWENTY_FIVE_PENCE);
    
    // Reconhecido R$ 0,10
    // Falta R$ 0,17
    atm.deposit(Coin.TEN_PENCE);
    
    // Reconhecido R$ 0,10
    // Falta R$ 0,07
    atm.deposit(Coin.TEN_PENCE);
    
    // Reconhecido R$ 0,05
    // Falta R$ 0,02
    atm.deposit(Coin.FIVE_PENCE);
    
    // Reconhecido R$ 0,01
    // Falta R$ 0,01
    atm.deposit(Coin.ONE_PENCE);
    
    // Reconhecido R$ 0,01
    // Obrigado pela sua preferência!
    atm.deposit(Coin.ONE_PENCE);
  }
}
