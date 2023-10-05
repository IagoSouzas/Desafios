package org.example.exercicios.Pessoa;


import java.util.Scanner;

public class Pessoa {
    Scanner entrada = new Scanner(System.in);

    String nome;
    int idade;
    String profissao;

    void coletarInformacoes(){

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.println("Digite sua profissão: ");
        profissao = entrada.next();

    }

    void imprimirInformacoes(){

        System.out.println("\nSeus dados: ");
        System.out.println("\nSeu nome é: "+ nome + "\nSua idade:" + idade
        + "\nSua profissão: "+profissao);

    }

}
