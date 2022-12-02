package edu.lucas.exerciciosArray;

import java.util.Random;

/*
 * Gere e imprima uma Matriz 4x4 com valores aleatórios entre 0-9.
 */

public class Ex4_ArrayMultidimensional {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[4][4];

    for(int i = 0; i<matriz.length; i++){
      for(int j = 0; j<matriz[i].length; j++){
        matriz[i][j] = random.nextInt(10);
      }
    }

    for(int i = 0; i<matriz.length; i++){
      for(int j = 0; j<matriz[i].length; j++){
        System.out.print(matriz[i][j]+" ");
      }
      System.out.println();
    }
  }
}
