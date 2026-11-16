package org.example;

import java.util.Scanner;
import java.util.Locale;

public class A7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Atividade 7");
        System.out.println();

        double[] salarios = new double[6];
        double total = 0;

        for (int i = 0; i < salarios.length; i++) {

            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salarios[i] = sc.nextDouble();

            total += salarios[i];
        }

        double maior = salarios[0];
        double menor = salarios[0];

        for (int i = 0; i < salarios.length; i++) {

            if (salarios[i] > maior) {
                maior = salarios[i];
            }

            if (salarios[i] < menor) {
                menor = salarios[i];
            }
        }

        double media = total / salarios.length;

        int acimaMedia = 0;

        for (int i = 0; i < salarios.length; i++) {

            if (salarios[i] > media) {
                acimaMedia++;
            }
        }

        System.out.println();

        System.out.printf(Locale.forLanguageTag("pt-BR"), "Maior salário: R$ %.2f%n", maior);

        System.out.printf(Locale.forLanguageTag("pt-BR"), "Menor salário: R$ %.2f%n", menor);

        System.out.printf(Locale.forLanguageTag("pt-BR"), "Media salárial: R$ %.2f%n", media);

        System.out.println("Funcionários acima da média: " + acimaMedia);
    }
}