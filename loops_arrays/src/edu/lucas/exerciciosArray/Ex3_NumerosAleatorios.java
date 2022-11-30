package edu.lucas.exerciciosArray;

import java.util.Random;


/*
 * Faça um Programa que leia 20 números inteiros aleatórios (Entre 0 e 100) armazene-os num vetor.
 * Ao final mostre os números e seus sucessores.
 */

public class Ex3_NumerosAleatorios {
  public static void main(String[] args) {
    
    Random leitor = new Random();

    int[] numeros = new int[20];

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = leitor.nextInt(101);
      System.out.println(numeros[i]+", sucessor: "+(numeros[i]+1));
    }
    
  }
}
