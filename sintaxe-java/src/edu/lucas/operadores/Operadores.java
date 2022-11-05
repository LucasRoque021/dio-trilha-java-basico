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


  }
}
