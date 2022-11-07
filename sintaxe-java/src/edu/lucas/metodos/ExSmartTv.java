package edu.lucas.metodos;

public class ExSmartTv {
  /*Convenções para criação de métodos:
   * - Devem ser nomeado como verbo, por ex: somar(), calcular(), imprimir().
   * - Devem seguir o padrão camelCase, por ex: findById().
   * 
   *Critério de definição de métodos:
   * - Qual a proposta principal do método? Você deve se perguntar constantemente até compreender a real finalidade do mesmo.
   * - Qual o tipo de retorno esperado após executar o método? Você deve analisar se o método será responsável por retornar algum valor ou não.
   * - Caso o método não retorne nenhum valor, ele será representado pela palavra-chave void.
   * - Quais os parâmetros serão necessários para execução do método? Os métodos às vezes precisarão de argumentos como critérios para a execução.
   * - O método possui o risco de apresentar alguma exceção? Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.
   * - Qual a visibilidade do método? Avaliar se será necessário que o método seja visível a toda aplicação, somente em pacotes, através de herança ou somente a nível a própria classe.
   */

  /*EXERCITANDO
   * Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
   * Ela tenha as características: ligada (boolean), canal (int) e volume (int);
   * Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
   * Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
   * Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente
   */

  private boolean ligada = false;
  private int canal = 0;
  private int volume = 20;

  public boolean getEstadoTv(){
    return this.ligada;
  }
  
  public int getCanal(){
    return this.canal;
  }

  public int getVolume(){
    return this.volume;
  }

  public void ligarTv(){
    this.ligada = true;
  }

  public void desligarTv(){
    this.ligada = false;
  }

  public void aumentarVolume(){
    if(this.ligada){
      this.volume ++;
    }
  }

  public void reduzirVolume(){
    if(this.ligada){
      this.volume --;
    }
  }

  public void escolherCanal(int numCanal){
    if(this.ligada){
      this.canal = numCanal;
    }
  }

  public void selecionarProximoCanal(){
    if(this.ligada){
      this.canal ++;
    }
  }

  public void selecionarCanalAnterior(){
    if(this.ligada){
      this.canal --;
    }
  }
}
