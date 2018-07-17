import java.math.BigDecimal;


public abstract class Manipulador
{
  /**
   * Proximo slot 
   */
  protected Manipulador successor;
  
  /**
   * Reconhecer o valor monetario da moeda
   * 
   * @param coin moeda a ser analisada
   * @return valor monetario da moeda
   */
  public abstract BigDecimal recognize(Coin coin);

  /**
   * Configurar o proximo slot
   * 
   * @param successor proximo slot
   */
  public void setSuccessor(Manipulador successor)
  {
    this.successor = successor;
  }
}