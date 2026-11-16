package org.example;

import java.util.Scanner;
import java.util.Locale;

public class A6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Atividade 6");
        System.out.println();

        System.out.print("Digite o valor do emprestimo: ");
        double valor = sc.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxa = sc.nextDouble();

        double[] valoresMensais = new double[12];

        for (int i = 0; i < valoresMensais.length; i++) {

            int mes = i + 1;

            valoresMensais[i] = valor + valor * taxa / 100 * mes;
        }

        System.out.println();
        System.out.println("Valores devidos por mes:");

        for (int i = 0; i < valoresMensais.length; i++) {

            System.out.printf(Locale.forLanguageTag("pt-BR"), "Mes %d: R$ %.2f%n", i + 1, valoresMensais[i]);
        }
    }
}