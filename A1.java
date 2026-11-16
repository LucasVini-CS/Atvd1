package org.example;

public class A1 {

    static void main(String[] args){

        System.out.println();
        System.out.println("Atividade 1");
        System.out.println();

        double[] notas = {7.5, 6.0, 8.0, 5.5};

        System.out.println("Quantidade de notas: " + notas.length);
        System.out.println("Primeira nota: " + notas[0]);
        System.out.println("Ultima nota: " + notas[notas.length - 1]);

        System.out.println();
        System.out.println("Atividade 2");
        System.out.println();

        double[] preco = new double[3];

        preco[0] = 12.90;
        preco[1] = 5.50;
        preco[2] = 30.00;

        for (int i = 0; i < preco.length; i++) {
            System.out.printf(
                    java.util.Locale.forLanguageTag("pt-BR"), "produto %d: R$ %.2f%n", i + 1, preco[i]);

        }
    }
}