package org.example;

import java.util.Scanner;
import java.util.Locale;

public class A2 {
    static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        System.out.println("Atividade 3");
        System.out.println();

        double[] notas = new double[4];
        double total = 0;

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Digite a nota" + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            total += notas[i];
        }
        double media = total / notas.length;

        System.out.printf(Locale.forLanguageTag("pt-BR"), "Media: %.2f%n", media);
        if (media >= 6) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situção: Reprovado");
        }
   }
}




