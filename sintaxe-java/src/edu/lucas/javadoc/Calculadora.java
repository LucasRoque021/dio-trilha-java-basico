/**
 * <h1>Calculadora</>
 * <p>A classe calculadora realiza operações matemáticas básicas.</p>
 * @author Lucas Roque
 * @version 1.0
 * @since 12/11/2022
 */
public class Calculadora {
  
  /**
   * Este método é utilizado para somar dois números
   * @param numero1 é o primeiro algarismo da operação de soma da calculadora
   * @param numero2 é o segundo algarismo da operação de soma da calculadora
   * @return double o resultado deste método é a soma dos dois parâmetros.
   */
  public double somar(double numero1, double numero2){
    return numero1 + numero2;
  }

  /**
   * Este método é utilizado para subtrair dois números
   * @param numero1 é o primeiro algarismo da operação de subtração da calculadora
   * @param numero2 é o segundo algarismo da operação de subtração da calculadora
   * @return double o resultado deste método é a subtração do primeiro algarismo pelo segundo algarismo.
   */
  public double subtrair(double numero1, double numero2){
    return numero1 - numero2;
  }

  /**
   * Este método é utilizado para multiplicar dois números
   * @param numero1 é o primeiro algarismo da multiplicação
   * @param numero2 é o segundo algarismo da multiplicação
   * @return double o resultado da multiplicação do primeiro algarismo pelo segundo algarismo.
   */
  public double multiplicar(double numero1, double numero2){
    return numero1 * numero2;
  }

  /**
   * Este método é utilizado para dividir um algarismo pelo outro
   * @param numero1 é o dividendo da divisão
   * @param numero2 é o divisor da divisão
   * @return double o resultado da divisão do primeiro algarismo pelo segundo algarismo.
   */
  public double dividir(double numero1, double numero2){
    return numero1 / numero2;
  }

}
