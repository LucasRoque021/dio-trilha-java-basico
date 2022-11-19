package edu.lucas.exerciciosLoop;

import java.util.Scanner;

/*Faça um programa que leia 5 números
e informe o maior número e
a média desses números*/
public class Ex3_MaiorEMedia {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int media;
    int soma = 0;
    int[] numeros = new int[5];
    int maior = numeros[0];

    for (int i = 0; i < 5; i++) {
      System.out.println("Digite um número: ");
      numeros[i] = scan.nextInt();
      soma += numeros[i]; 

      maior = (numeros[i] > maior) ? numeros[i] : maior;
    }

    media = soma/numeros.length;
    System.out.printf("Média = %d %nMaior número = %d", media, maior);

    scan.close();
  }

}
