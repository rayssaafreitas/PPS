package br.edu.ifpb.pps.model;

public abstract class MaquinaChain {

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class MaquinaChain{
  private BigDecimal price;
  private Coin slot;
  private BigDecimal total;
  
  
  public Manipulador(BigDecimal price)
  {
    this.price = price;
    
    total = new BigDecimal(0.0);
    
    NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));
    
    System.out.println("Preço a ser cobrado: R$ " + nf.format(price));
    
    slot = new OnePenceHandler();
    Coin fivePence = new Five();
    Coin tenPence = new Ten();
    Coin twentyFivePence = new TwentyFive();
    Coin fiftyPence = new Fifty();
    Coin onePound = new OneReal();
    
    slot.setSuccessor(fivePence);
    fivePence.setSuccessor(tenPence);
    tenPence.setSuccessor(twentyFivePence);
    twentyFivePence.setSuccessor(fiftyPence);
    fiftyPence.setSuccessor(onePound);
  }
  
  /**
   * Depositar uma moeda
   * 
   * @param coin moeda depositada pelo usuario 
   */
  public void deposit(Coin coin)
  {
    total = total.add(slot.recognize(coin));
    
    NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));

    if(total.doubleValue() < price.doubleValue())
    {
      System.out.println("Falta R$ " + nf.format(price.subtract(total)));
    }
    else if(total.doubleValue() == price.doubleValue())
    {
      System.out.println("Obrigado pela sua preferência!");
    }
    else if(total.doubleValue() > price.doubleValue())
    {
      System.out.println("Obrigado pela sua preferência!");
      System.out.println("Seu troco á de R$ " + nf.format(total.subtract(price)));
    }
  }
}
