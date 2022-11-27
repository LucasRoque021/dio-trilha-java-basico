package edu.lucas.exerciciosLoop;

import java.util.Scanner;

public class Ex6_Fatorial {
  public static void main(String[] args) {
    /*
     * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
     */
     int resultado = 1; 

     Scanner scan = new Scanner(System.in);
     System.out.println("Qual valor você deseja calcular o fatorial? ");
     int fatorial = scan.nextInt();

     for (int i = fatorial; i > 0; i--) {
      resultado *= i;
     }
     System.out.printf("%d! = %d", fatorial, resultado);
     scan.close();
  }
}
