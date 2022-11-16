package edu.lucas.exerciciosLoop;

import java.util.Scanner;

/*Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundorepresentando a sua idade.
 * (Pare o programa inserindo o valor 0 no campo nome)
 */

public class Ex1_NomeIdade {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        do {
            System.out.println("Digite o nome do aluno: ");
            nome = scan.next();
            
            System.out.println("Digite a idade do aluno: ");
            idade = scan.nextInt();

            System.out.printf("%nNome do aluno: %s %nIdade do aluno: %d %n%n", nome, idade);
        } while (!nome.equals("0"));

        scan.close();
    }
}
