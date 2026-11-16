package org.example;

import java.util.Scanner;

public class A8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Atividade 8");
        System.out.println();

        double[] notas = new double[10];

        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Digite a nota do aluno: " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            if (notas[i] >= 6) {
                aprovados++;

            } else if (notas[i] >= 4) {
                recuperacao++;

            } else {
                reprovados++;
            }
        }

        System.out.println();
        System.out.println("Resultado da turma:");
        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos em recuperação: " + recuperacao);
        System.out.println("Alunos reprovados: " + reprovados);
    }
}