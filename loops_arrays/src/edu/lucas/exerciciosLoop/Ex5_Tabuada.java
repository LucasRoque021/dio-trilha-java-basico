package edu.lucas.exerciciosLoop;

import java.util.Scanner;

public class Ex5_Tabuada {
  /*
   * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
   * o usuário deve informar de qual número ele deseja ver a tabuada.
   */

   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int tabuada;
 
    System.out.println("Qual tabuada você deseja saber? ");
    tabuada = scan.nextInt();
    
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d x %d = %d %n", tabuada, i, tabuada*i);
    }
    scan.close();
   }
   
}
