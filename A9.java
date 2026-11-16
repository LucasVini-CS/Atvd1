package org.example;

import java.util.Scanner;
import java.util.Locale;

public class A9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Atividade 9");
        System.out.println();

        int[] codigos = {101, 205, 310, 420, 550};

        double[] precos = {4.50, 12.00, 7.90, 25.00, 3.20};

        System.out.print("Digite o código do produto: ");
        int codigoBusca = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < codigos.length; i++) {

            if (codigos[i] == codigoBusca) {

                System.out.printf(Locale.forLanguageTag("pt-BR"), "Produto encontrado! Preço: R$ %.2f%n", precos[i]);

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado...");
        }
    }
}