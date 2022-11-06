package edu.lucas.operadores;

import java.util.Date;

public class Operadores {
  public static void main(String[] args) {
    // Atribuição -> =

    String nome = "Lucas";
    int idade = 29;
    double peso = 86.3;
    char sexo = 'M';
    boolean doadorOrgao = false;
    boolean doadorSangue = true;
    Date dataNascimento = new Date();

    // Operadores aritméticos -> +, -, *, /, %

    int soma = 8 + 2;
    int subtracao = 8 - 2;
    int multiplicacao = 8 * 2;
    double divisao = 8/2;

    // + para concatenação
    String nomeCompleto = "LINGUAGEM" + "JAVA";
		
    //qual o resultado das expressoes abaixo?
    String concatenacao ="?"; //?

    concatenacao = 1+1+1+"1";  //31

    concatenacao = 1+"1"+1+1; //1111

    concatenacao = 1+"1"+1+"1"; //1111

    concatenacao = "1"+1+1+1; //1111

    concatenacao = "1"+(1+1+1); //13


    /*Operadores unários: Esses operadores, são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar (++), decrementar (--), inverter valores numéricos(-) e booleanos (!). */

    int numero = 5;
    System.out.println(-numero);
    System.out.println(--numero);
    System.out.println(numero);
    System.out.println(++ numero);
    System.out.println(numero);

    boolean verdadeiro = true;

    System.out.println("Inverteu " + !verdadeiro);
    System.out.println(verdadeiro);


    /*Operador ternário: é o IF escrito em uma linha só!!
     * O operador ternário é representado pelos símbolos "?" e ":"  utilizados na seguinte estrutura de sintaxe: 
      <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>
     */
    int a, b;
    a=6;
    b=6;
    String resultado = (a==b)? "verdadeiro":"falso";

    /*Operadores relacionais: Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual(==), diferente(!=), menor(<), menor ou igual(<=), maior(>), maior ou igual ao da direita(>=), retornando um valor booleano como resultado.
    */

    int numero1 = 1;
    int numero2 = 2;

    if(numero1 > numero2)
      System.out.println("Numero 1 maior que numero 2");

    if(numero1 < numero2)
      System.out.println("Numero 1 menor que numero 2");

    if(numero1 >= numero2)
      System.out.println("Numero 1 maior ou igual que numero 2");

    if(numero1 <= numero2)
      System.out.println("Numero 1 menor ou igual que numero 2");

    if(numero1 != numero2)
      System.out.println("Numero 1 é diferente de numero 2");


    //Comparações com objetos  
    Integer num1 = 130;
    Integer num2 = 130;

    System.out.println(num1 == num2); //false
      
    // A razão pela qual o resultado é false, é devido o Java tratar os valores
    // Como objetos (Integer ou String) a partir de agora.
    // Qual a solução ?
    // Quando queremos comparar objetos, usamos o método equals
      
    System.out.println(num1.equals(num2));


    /*Operadores lógicos: and (&&), or (||) */
    boolean condicao1=true;

    boolean condicao2=false;

    /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
    expressões. 
    É como se estivesse escrito:
    "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
    */

    if(condicao1 && condicao2)
      System.out.println("Os dois valores são verdadeiros");;

    //Se condicao1 OU condicao2 for verdadeira, executar código.
    if(condicao1 || condicao2)
      System.out.println("pelo menos um dos valores é verdadeiro");
        
  }  
}
