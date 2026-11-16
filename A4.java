package org.example;

import java.util.Scanner;
import java.util.Locale;

public class A4 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Atividade 4");
        System.out.println();

        double[] precos = new double[5];
        double totalCompra = 0;

        for (int i = 0; i < precos.length; i++) {

            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();

            totalCompra += precos[i];
        }

        System.out.println();
        System.out.println("Preços dos produtos: ");

        for (int i = 0; i < precos.length; i++) {

            System.out.printf(Locale.forLanguageTag("pt-BR"), "Produto %d: R$ %.2f%n", i + 1, precos[i]);
        }
        System.out.printf(Locale.forLanguageTag("pt-BR"), "Total da compra: R$ %.2f%n", totalCompra);
    }
}
