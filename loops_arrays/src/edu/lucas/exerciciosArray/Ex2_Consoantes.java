package edu.lucas.exerciciosArray;

import java.util.Scanner;

public class Ex2_Consoantes {
  /*
   * Faça um programa que leia um vetor de 6 caracteres,
   * e diga quantas consoantes foram lidas.
   * Imprima as consoantes.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] consoantes = new String[6];
    int quantConsoantes = 0;
    int count = 0;
    do {
      System.out.println("Letra: ");
      String letra = scan.next();

      if(!(letra.equalsIgnoreCase("a") ||
          letra.equalsIgnoreCase("e")||
          letra.equalsIgnoreCase("i")||
          letra.equalsIgnoreCase("o")||
          letra.equalsIgnoreCase("u"))){
            consoantes[count] = letra;
            quantConsoantes++;
      }
      
      count++;

    } while (count < consoantes.length);

    for (String consoante : consoantes) {
      if(consoante != null){
        System.out.print(consoante + " ");
        
      }
      
    }
    System.out.println();
    System.out.println("Quantidade de consoantes: "+ quantConsoantes);

    scan.close();
  }
}
