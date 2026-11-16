package org.example;

import java.util.Scanner;
import java.util.Locale;

public class A10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println();
        System.out.println("Atividade 10 - Caixa de Loja");
        System.out.println();

        System.out.print("Digite a quantidade de itens: ");
        int n = sc.nextInt();

        if (n < 1) {

            System.out.println("Quantidade invalida...");

        } else {

            double[] precos = new double[n];
            int[] quantidades = new int[n];

            double totalCompra = 0;

            for (int i = 0; i < n; i++) {

                System.out.print("Digite o preço do item " + (i + 1) + ": ");
                precos[i] = sc.nextDouble();

                System.out.print("Digite a quantidade do item " + (i + 1) + ": ");
                quantidades[i] = sc.nextInt();
            }

            System.out.println();
            System.out.println("Subtotais dos produtos:");

            for (int i = 0; i < n; i++) {

                double subtotal = precos[i] * quantidades[i];

                totalCompra += subtotal;

                System.out.printf(Locale.forLanguageTag("pt-BR"), "Item %d: R$ %.2f%n", i + 1, subtotal);
            }

            double desconto = 0;

            if (totalCompra > 200) {
                desconto = totalCompra * 0.05;
            }

            double valorFinal = totalCompra - desconto;

            System.out.println();

            System.out.printf(Locale.forLanguageTag("pt-BR"), "Total da compra: R$ %.2f%n", totalCompra);

            System.out.printf(Locale.forLanguageTag("pt-BR"), "Desconto: R$ %.2f%n", desconto);

            System.out.printf(Locale.forLanguageTag("pt-BR"), "Valor final para pagar: R$ %.2f%n", valorFinal);
        }
    }
}
