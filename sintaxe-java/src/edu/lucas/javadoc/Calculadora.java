/**
 * <h1>Calculadora</>
 * <p>A classe calculadora realiza operações matemáticas básicas.</p>
 * @author Lucas Roque
 * @version 1.0
 * @since 12/11/2022
 */
public class Calculadora {
  
  /**
   * Este método é utilizado para somar dois números inteiros
   * @param numero1 é o primeiro algarismo da operação de soma da calculadora
   * @param numero2 é o segundo algarismo da operação de soma da calculadora
   * @return int o resultado deste método é a soma dos dois parâmetros.
   */
  public int somar(int numero1, int numero2){
    return numero1 + numero2;
  }

  /**
   * Este método é utilizado para subtrair dois números inteiros
   * @param numero1 é o primeiro algarismo da operação de subtração da calculadora
   * @param numero2 é o segundo algarismo da operação de subtração da calculadora
   * @return int o resultado deste método é a subtração do primeiro algarismo pelo segundo algarismo.
   */
  public int subtrair(int numero1, int numero2){
    return numero1 - numero2;
  }
}
