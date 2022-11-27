package edu.lucas.exerciciosLoop;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares e a
 * quantidade de números impares.
 */

public class Ex4_ImparOuPar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = 0, numero, quantNumeros, quantImpares = 0, quantPares = 0;

    System.out.println("Quantos números você quer digitar? ");
    quantNumeros = scan.nextInt();

    do {
      System.out.printf("Digite o %d° número: ", i+1);
      numero = scan.nextInt();

      if (numero % 2 == 0) {
        quantPares++;
      } else {
        quantImpares++;
      }
      i++;
    } while (i < quantNumeros);
    System.out.printf("Quantidade de ímpares = %d %nQuantidade de pares = %d",quantImpares, quantPares);
    scan.close();
  }
}
