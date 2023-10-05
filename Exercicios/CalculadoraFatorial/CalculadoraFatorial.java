package org.example.exercicios.CalculadoraFatorial;

import java.util.Scanner;

public class CalculadoraFatorial {

    Scanner entrada = new Scanner(System.in);

    int n1;
    int fatorial = 1;
    void usuario(){
        System.out.println("Bem vindo a calculadora de fatorial.");
        System.out.println("\n Digite um número positivo: ");
        n1 = entrada.nextInt();
    }

    int calculo(){

        for (int i = 1; i <= n1; i++){
            fatorial *=i;
        }
        return fatorial;
    }

    void imprimir(){
        System.out.println(fatorial);
    }

}
