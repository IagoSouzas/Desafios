package org.example.exercicios.maiorEmenor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;
        int[] numeros = new int[tamanho];

        System.out.println("Digite " + tamanho + " números:");

        for (int i = 0; i < tamanho; i++) {
            numeros[i] = scanner.nextInt();
        }

        scanner.close();

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < tamanho; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);



    }
}
