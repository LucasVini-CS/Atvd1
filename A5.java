package org.example;

import java.util.Scanner;
import java.util.Locale;

public class A5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Atividade 5");
        System.out.println();

        double[] precosOriginais = new double[5];
        double[] precosDesconto = new double[5];

        for (int i = 0; i < precosOriginais.length; i++) {

            System.out.print("Digite o preco do produto " + (i + 1) + ": ");
            precosOriginais[i] = sc.nextDouble();

            precosDesconto[i] = precosOriginais[i] * 0.90;
        }

        System.out.println();
        System.out.println("Preços dos produtos com desconto: ");

        for (int i = 0; i < precosOriginais.length; i++) {

            System.out.printf(Locale.forLanguageTag("pt-BR"), "Produto %d: Original R$ %.2f | Com desconto R$ %.2f%n", i + 1, precosOriginais[i], precosDesconto[i]);
        }
    }
}